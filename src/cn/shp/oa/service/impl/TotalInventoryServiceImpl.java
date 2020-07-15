package cn.shp.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.shp.oa.base.BaseDaoImpl;
import cn.shp.oa.dao.TotalInventoryDao;
import cn.shp.oa.domain.PageBean;
import cn.shp.oa.domain.TotalInventory;
import cn.shp.oa.service.TotalInventoryService;


@Service
@Transactional
public class TotalInventoryServiceImpl extends BaseDaoImpl<TotalInventory> implements TotalInventoryService{

	@Resource
	private TotalInventoryDao totalInventoryDao;
	@Override
	
	public List<TotalInventory> findAll() {
		
		return totalInventoryDao.findAll();
	}

	@Override
	public void save(TotalInventory model) {
		
		totalInventoryDao.save(model);
	}

	@Override
	public void delete(Long id) {
		
		totalInventoryDao.delete(id);
		
	}

	@Override
	public TotalInventory getById(Long id) {
		
		return totalInventoryDao.getById(id);
	}

	@Override
	public void update(TotalInventory totalInventory) {
		
		totalInventoryDao.update(totalInventory);
		
	}

	@Override
	public PageBean getPageBeanById(int pageNum, int pageSize) {
		List list=getSession().createQuery("FROM TotalInventory")
				.setFirstResult((pageNum - 1) * pageSize)
				.setMaxResults(pageSize).list();
		Long count=(Long) getSession().createQuery("SELECT COUNT(*) FROM TotalInventory").uniqueResult();
		
		return new PageBean(pageNum,pageSize,count.intValue(),list);
	}

}
