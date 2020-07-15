package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.MaintenancePlanDao;
import cn.shp.oa.domain.MaintenancePlan;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.MaintenancePlanService;

@Service
@Transactional
public class MaintenancePlanServiceImpl extends BaseDaoImpl<MaintenancePlan> implements MaintenancePlanService {

	@Resource
	private MaintenancePlanDao maintenancePlanDao;
	
	@Override
	public List<MaintenancePlan> findAll() {
		// TODO Auto-generated method stub
		return maintenancePlanDao.findAll();
	}

	@Override
	public void save(MaintenancePlan model) {
		maintenancePlanDao.save(model);
		
	}

	@Override
	public void delete(Long id) {
		maintenancePlanDao.delete(id);
		
	}

	@Override
	public MaintenancePlan getById(Long id) {
		// TODO Auto-generated method stub
		return maintenancePlanDao.getById(id);
	}

	@Override
	public void update(MaintenancePlan maintenancePlan) {
		maintenancePlanDao.update(maintenancePlan);
	}
	

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM MaintenancePlan")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM MaintenancePlan").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}

	@Override
	public void readExcelData(String filepath) {
		// TODO Auto-generated method stub
		
	}


}
