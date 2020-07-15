package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.RoleDao;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.Role;
import cn.shp.oa.service.RoleService;


@Service
@Transactional
public class RoleServiceImpl extends BaseDaoImpl<Role> implements RoleService{
	
	
	@Resource
	private RoleDao roleDao;

	@Override
	public List<Role> findAll() {
		
		return roleDao.findAll();
	}

	@Override
	public void delete(Long id) {
		roleDao.delete(id);
		
	}

	@Override
	public void save(Role role) {
		roleDao.save(role);
		
	}

	@Override
	public Role getById(Long id) {
		return roleDao.getById(id);
	}

	@Override
	public void update(Role role) {
		roleDao.update(role);
		
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM Role")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM Role").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}

	@Override
	public void importExcel(String filePath, String fileName, List<Role> roleList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExcelData(String excelPath) {
		// TODO Auto-generated method stub
		
	}

}
