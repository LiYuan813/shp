package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.domain.TPMWeek;
import cn.shp.oa.service.WeekService;
import cn.shp.oa.dao.TPMWeekDao;

@Service
@Transactional
public class WeekServiceImpl implements WeekService{

	@Resource
	private TPMWeekDao TPMWeekDao;
	
	@Override
	public List<TPMWeek> findAll() {
		return TPMWeekDao.findAll();
	}

	@Override
	public TPMWeek getById(Long id) {
		return TPMWeekDao.getById(id);
	}

	@Override
	public void update(TPMWeek week) {
		TPMWeekDao.update(week);
		
	}

}
