package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.Role;

public interface RoleService  {

	List<Role> findAll();

	void delete(Long id);

	void save(Role role);

	Role getById(Long id);

	void update(Role role);

	PageBean getPageBeanById(int pageNum, int pageSize);
	
	void importExcel(String filePath, String fileName, List<Role> roleList);

	void readExcelData(String excelPath);

	

}
