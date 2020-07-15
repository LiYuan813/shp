package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.MaintainPlanDao;
import cn.shp.oa.domain.MaintainPlan;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.service.MaintainPlanService;


@Service
@Transactional

public class MaintainPlanServiceImpl extends BaseDaoImpl< MaintainPlan> implements MaintainPlanService {

	@Resource
	private MaintainPlanDao maintainPlanDao;

	@Override
	public List<MaintainPlan> findAll() {
		return maintainPlanDao.findAll();
	}

	@Override
	public void delete(Long id) {
		maintainPlanDao.delete(id);		
	}

	@Override
	public MaintainPlan getById(Long id) {
		
		return maintainPlanDao.getById(id);
	}

	@Override
	public void update(MaintainPlan maintainPlan) {
		maintainPlanDao.update(maintainPlan);
		
	}

	@Override
	public void save(MaintainPlan model) {
		maintainPlanDao.save(model);
		
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM MaintainPlan")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM MaintainPlan").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}
	

	

}
