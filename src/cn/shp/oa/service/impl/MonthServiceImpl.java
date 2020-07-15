package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.TPMMonthDao;
import cn.shp.oa.domain.TPMMonth;
import cn.shp.oa.service.MonthService;
@Service
@Transactional
public class MonthServiceImpl extends BaseDaoImpl<TPMMonth>implements MonthService{

	@Resource
	private TPMMonthDao tpmMonthDao;
	@Override
	public List<TPMMonth> findAll() {
		
		return tpmMonthDao.findAll();
	}

	@Override
	public TPMMonth getById(Long id) {
		
		return tpmMonthDao.getById(id);
	}

	@Override
	public void update(TPMMonth month) {
		tpmMonthDao.update(month);
		
	}

}
