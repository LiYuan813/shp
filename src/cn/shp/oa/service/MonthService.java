package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.TPMMonth;
import cn.shp.oa.domain.TPMWeek;

public interface MonthService {

	List<TPMMonth> findAll();

	TPMMonth getById(Long id);

	void update(TPMMonth month);

}
