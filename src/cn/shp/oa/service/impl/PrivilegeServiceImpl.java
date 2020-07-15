package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.PrivilegeDao;
import cn.shp.oa.domain.Privilege;
import cn.shp.oa.service.PrivilegeService;
@Service
@Transactional
public class PrivilegeServiceImpl extends BaseDaoImpl<Privilege> implements PrivilegeService{
	
	@Resource
	private PrivilegeDao privilegeDao;

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		privilegeDao.delete(id);
	}

	@Override
	public Privilege getById(Long id) {
		// TODO Auto-generated method stub
		return privilegeDao.getById(id);
	}

	@Override
	public List<Privilege> getByIds(Long[] ids) {
		return privilegeDao.getByIds(ids);
	}

	@Override
	public List<Privilege> findAll() {
		// TODO Auto-generated method stub
		return privilegeDao.findAll();
	}

	@SuppressWarnings("unchecked")
	@Override 
	public List<Privilege> findTopList() {
		
		return getSession().createQuery(//
				"FROM Privilege p WHERE p.parent IS NULL")//
				.list();
	}

}
