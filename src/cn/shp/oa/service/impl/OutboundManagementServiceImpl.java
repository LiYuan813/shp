package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.OutboundManagementDao;
import cn.shp.oa.domain.OutboundManagement;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.OutboundManagementService;

@Service
@Transactional
public class OutboundManagementServiceImpl extends BaseDaoImpl<OutboundManagement> implements OutboundManagementService {

	@Resource
	private OutboundManagementDao outboundManagementDao;
	@Override
	public List<OutboundManagement> findAll() {
		
		return outboundManagementDao.findAll();
	}

	@Override
	public void save(OutboundManagement model) {
		outboundManagementDao.save(model);
		
	}

	@Override
	public void delete(Long id) {
		outboundManagementDao.delete(id);
		
	}

	@Override
	public OutboundManagement getById(Long id) {
		
		return outboundManagementDao.getById(id);
	}

	@Override
	public void update(OutboundManagement outboundManagement) {
		outboundManagementDao.update(outboundManagement);
		
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM OutboundManagement")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM OutboundManagement").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}

	
}
