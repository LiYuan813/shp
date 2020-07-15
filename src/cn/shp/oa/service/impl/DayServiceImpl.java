package cn.shp.oa.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.domain.TPMDay;
import cn.shp.oa.service.DayService;

@Service
@Transactional
public class DayServiceImpl extends BaseDaoImpl<TPMDay> implements DayService {

}
