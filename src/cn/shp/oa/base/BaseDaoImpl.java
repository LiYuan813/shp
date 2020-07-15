package cn.shp.oa.base;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> clazz;
	//ʹ�÷��似���õ���ʵ��T
	public BaseDaoImpl() {
		ParameterizedType pt=(ParameterizedType)this.getClass().getGenericSuperclass();
		this.clazz=(Class<T>)pt.getActualTypeArguments()[0];//��ȡ��һ�����Ͳ�������ʵ����
		System.out.println("clazz--->"+clazz);
	}

	@Resource
	private SessionFactory sessionfactory;
	/**
	 * ��ȡ��ǰ����session����
	 * @return
	 */
	protected Session getSession(){
		return sessionfactory.getCurrentSession();		
	}
	public void save(T entity) {
		Session session=getSession();
		session.save(entity);		
	}
	public void update(T entity) {
		getSession().update(entity);
		
	}
	@Override
	public void delete(Long id) {
		Object obj=getById(id);
		if(obj!=null)
		{
			getSession().delete(obj);
		}
		
	}

	@Override
	public T getById(Long id) {
		return (T)getSession().get(clazz, id);
	}


	@Override
	public List<T> getByIds(Long[] ids) {
		if(ids==null||ids.length ==0) {
		return new ArrayList<T>();	
		}else {
		return getSession().createQuery("FROM"+ clazz.getSimpleName()+"WHERE id IN (:ids)")
				.setParameterList("ids", ids)
				.list();
		}

	}

	@Override
	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM "+clazz.getSimpleName())//
				.list();
	}


	
}
