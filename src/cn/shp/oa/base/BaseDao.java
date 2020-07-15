package cn.shp.oa.base;

import java.util.List;

public interface BaseDao <T> {
	/**
	 * 保存实体
	 * @param entity
	 */
	void save(T entity);
	/**
	 * 更新实体
	 * @param entity
	 */
	void update(T entity);
	/**
	 * 删除实体
	 * @param entity
	 */
	void delete(Long id);
	/**
	 * 按id查询
	 * @param id
	 * @return
	 */
	T getById(Long id);
	/**
	 * 按id查询
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);
	/**
	 * 查询所有
	 * @param ids
	 * @return
	 */
	List<T> findAll();

}
