package cn.shp.oa.base;

import org.junit.Test;
import cn.shp.oa.dao.RoleDao;
import cn.shp.oa.dao.UserDao;
import cn.shp.oa.dao.impl.RoleDaoImpl;
import cn.shp.oa.dao.impl.UserDaoImpl;

public class BaseDaoTest {

	@Test
	public void testSave() {
		
		UserDao userDao=new UserDaoImpl();
		RoleDao roleDao=new RoleDaoImpl();
		
	}

}
