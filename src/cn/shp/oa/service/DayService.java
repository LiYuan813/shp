package cn.shp.oa.service;

import java.util.List;


import cn.shp.oa.domain.TPMDay;

public interface DayService {

	List<TPMDay> findAll();

	void update(TPMDay day);
	
	TPMDay getById(Long id);

}
