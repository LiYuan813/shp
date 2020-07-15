package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.TPMWenTiDao;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TPMWenTi;
import cn.shp.oa.service.TPMWenTiService;

@Service
@Transactional
public class TPMWenTiServiceImpl extends BaseDaoImpl<TPMWenTi> implements TPMWenTiService{

	@Resource
	private TPMWenTiDao tPMWenTiDao;
	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM TPMWenTi")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM TPMWenTi").uniqueResult();
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}

	@Override
	public List<TPMWenTi> findAll() {
		
		return tPMWenTiDao.findAll();
	}

	@Override
	public void delete(Long id) {
		tPMWenTiDao.delete(id);
		
	}

	@Override
	public void save(TPMWenTi model) {
		tPMWenTiDao.save(model);
		
	}

	@Override
	public TPMWenTi getById(Long id) {
		
		return tPMWenTiDao.getById(id) ;
	}

	@Override
	public void update(TPMWenTi tPMWenTi) {
		tPMWenTiDao.update(tPMWenTi);
		
	}

}
