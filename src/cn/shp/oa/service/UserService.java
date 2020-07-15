package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.User;

public interface UserService  {

	List<User> findAll();

	void save(User model);

	void delete(Long id);

	User getById(Long id);

	void update(User user);

	User findByLoginNameAndPassword(String name, String password);

	PageBean getPageBeanById(int pageNum, int pageSize);

	

}
