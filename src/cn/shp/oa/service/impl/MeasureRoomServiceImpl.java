package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.MeasureRoomDao;
import cn.shp.oa.domain.MeasureRoom;
import cn.shp.oa.service.MeasureRoomService;
@Service
@Transactional

public class MeasureRoomServiceImpl extends BaseDaoImpl<MeasureRoom>implements MeasureRoomService {

	@Resource
	private MeasureRoomDao measureRoomDao;
	@Override
	public void save(MeasureRoom model) {
		measureRoomDao.save(model);
	}

	@Override
	public void update(MeasureRoom measureRoom) {
		measureRoomDao.update(measureRoom);
	}

	@Override
	public void delete(Long id) {
		measureRoomDao.delete(id);
	}

	@Override
	public MeasureRoom getById(Long id) {
		return measureRoomDao.getById(id);
	}
	@Override
	public List<MeasureRoom> findAll() {
		return measureRoomDao.findAll();
	}
	

}
