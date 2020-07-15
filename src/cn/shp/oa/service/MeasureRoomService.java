package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.MeasureRoom;

public interface MeasureRoomService {

	List<MeasureRoom> findAll();

	void save(MeasureRoom model);

	void delete(Long id);

	MeasureRoom getById(Long id);

	void update(MeasureRoom measureRoom);

}
