package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.MaintenancePlan;
import cn.shp.oa.domain.PageBean;

public interface MaintenancePlanService {

	List<MaintenancePlan> findAll();

	void save(MaintenancePlan model);

	void delete(Long id);

	MaintenancePlan getById(Long id);

	void update(MaintenancePlan maintenancePlan);

	void readExcelData(String filepath);

	PageBean getPageBeanById(int pageNum, int pageSize);


}
