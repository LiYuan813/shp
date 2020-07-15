package cn.shp.oa.service;

import java.util.List;
import cn.shp.oa.domain.MaintainPlan;
import cn.shp.oa.domain.PageBean;

public interface MaintainPlanService{

	List<MaintainPlan> findAll();

	void delete(Long id);

	MaintainPlan getById(Long id);

	void update(MaintainPlan maintainPlan);

	void save(MaintainPlan model);

	PageBean getPageBeanById(int pageNum, int pageSize);






}
