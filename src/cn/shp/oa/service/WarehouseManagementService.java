package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.WarehouseManagement;

public interface WarehouseManagementService {

	List<WarehouseManagement> findAll();

	void save(WarehouseManagement model);

	WarehouseManagement getById(Long id);

	void update(WarehouseManagement warehouseManagement);

	void delete(Long id);

	PageBean getPageBeanById(int pageNum, int pageSize);

	void readExcelData(String excelPath);

	void readDataToExcelFile(String filePath, String fileName, List<WarehouseManagement> warehouseManagementList);

}
