package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.TPMWeek;

public interface WeekService {

	List<TPMWeek> findAll();

	TPMWeek getById(Long id);

	void update(TPMWeek week);

}
