package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.MaintenanceRecordsDao;
import cn.shp.oa.domain.MaintenanceRecords;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.MaintenanceRecordsService;

@Service
@Transactional
public class MaintenanceRecordsServiceImpl extends BaseDaoImpl<MaintenanceRecords> implements MaintenanceRecordsService {
	
	
	@Resource
	private MaintenanceRecordsDao maintenanceRecordsDao;

	@Override
	public List<MaintenanceRecords> findAll() {
		// TODO Auto-generated method stub
		return maintenanceRecordsDao.findAll();
	}

	@Override
	public void delete(Long id) {
		maintenanceRecordsDao.delete(id);
		
	}

	@Override
	public void save(MaintenanceRecords model) {
		maintenanceRecordsDao.save(model);
		
	}

	@Override
	public MaintenanceRecords getById(Long id) {
		return maintenanceRecordsDao.getById(id);
	}

	@Override
	public void update(MaintenanceRecords maintenanceRecords) {
		maintenanceRecordsDao.update(maintenanceRecords);
		
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM MaintenanceRecords")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM MaintenanceRecords").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}
	

}
