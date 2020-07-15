package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TotalInventory;

public interface TotalInventoryService {

	List<TotalInventory> findAll();

	void save(TotalInventory model);

	void delete(Long id);

	TotalInventory getById(Long id);

	void update(TotalInventory totalInventory);

	PageBean getPageBeanById(int pageNum, int pageSize);

}
