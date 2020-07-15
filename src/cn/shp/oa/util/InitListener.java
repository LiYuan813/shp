package cn.shp.oa.util;

import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.shp.oa.domain.Privilege;
import cn.shp.oa.service.PrivilegeService;

public class InitListener implements ServletContextListener {


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {


	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//��ȡ������ص�service����
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		PrivilegeService privilegeService=(PrivilegeService)ac.getBean("privilegeServiceImpl");
		//׼������topPrivilegeList
		List<Privilege> topPrivilegeList=privilegeService.findTopList();
		sce.getServletContext().setAttribute("topPrivilegeList", topPrivilegeList);
		System.out.println("------>��׼������");

	}

}
