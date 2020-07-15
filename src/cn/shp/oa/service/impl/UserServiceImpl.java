package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.UserDao;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.User;
import cn.shp.oa.service.UserService;


@Service
@Transactional
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public void save(User user) {

		userDao.save(user);
	}

	@Override
	public void update(User user) {

		userDao.update(user);
	}

	@Override
	public void delete(Long id) {

		userDao.delete(id);
	}

	@Override
	public User getById(Long id) {

		return userDao.getById(id);
	}

	@Override
	public List<User> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return super.getByIds(ids);
	}

	@Override
	public List<User> findAll() {

		return userDao.findAll();
	}

	@Override
	public User findByLoginNameAndPassword(String name, String password) {
		// 使用密码的md5摘要进行对比
		String md5Digest = DigestUtils.md5Hex(password);
		return (User) getSession().createQuery("FROM User u WHERE u.name=? AND u.password=?").setParameter(0, name)
				.setParameter(1, md5Digest).uniqueResult();

	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		// 查询列表，分页查询
		List list = getSession().createQuery("FROM User")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		// 查询总数量
		Long count = (Long) getSession().createQuery("SELECT COUNT(*) FROM User").uniqueResult();

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}

	

	 

}
