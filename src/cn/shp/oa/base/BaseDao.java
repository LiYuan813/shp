package cn.shp.oa.base;

import java.util.List;

public interface BaseDao <T> {
	/**
	 * ����ʵ��
	 * @param entity
	 */
	void save(T entity);
	/**
	 * ����ʵ��
	 * @param entity
	 */
	void update(T entity);
	/**
	 * ɾ��ʵ��
	 * @param entity
	 */
	void delete(Long id);
	/**
	 * ��id��ѯ
	 * @param id
	 * @return
	 */
	T getById(Long id);
	/**
	 * ��id��ѯ
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);
	/**
	 * ��ѯ����
	 * @param ids
	 * @return
	 */
	List<T> findAll();

}
