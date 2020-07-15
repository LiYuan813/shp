package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TPMWenTi;

public interface TPMWenTiService {

	PageBean getPageBeanById(int pageNum, int pageSize);

	List<TPMWenTi> findAll();

	void delete(Long id);

	void save(TPMWenTi model);

	TPMWenTi getById(Long id);

	void update(TPMWenTi tPMWenTi);

}
