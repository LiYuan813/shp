package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.OutboundManagement;
import cn.shp.oa.domain.PageBean;

public interface OutboundManagementService {

	List<OutboundManagement> findAll();

	void save(OutboundManagement model);

	void delete(Long id);

	OutboundManagement getById(Long id);

	void update(OutboundManagement outboundManagement);

	PageBean getPageBeanById(int pageNum, int pageSize);

}
