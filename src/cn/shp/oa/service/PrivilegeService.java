package cn.shp.oa.service;

import java.util.List;

import cn.shp.oa.domain.Privilege;

public interface PrivilegeService {

	List<Privilege> getByIds(Long[] privilegeIds);

	List<Privilege> findAll();

	List<Privilege> findTopList();

}
