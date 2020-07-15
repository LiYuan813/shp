package cn.shp.oa.service;

import java.util.List;
import cn.shp.oa.domain.MaintenanceRecords;
import cn.shp.oa.domain.PageBean;

public interface MaintenanceRecordsService  {

	List<MaintenanceRecords> findAll();

	void delete(Long id);

	void save(MaintenanceRecords model);

	MaintenanceRecords getById(Long id);

	void update(MaintenanceRecords maintenanceRecords);

	PageBean getPageBeanById(int pageNum, int pageSize);

}
