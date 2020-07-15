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
		//获取容器相关的service对象
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		PrivilegeService privilegeService=(PrivilegeService)ac.getBean("privilegeServiceImpl");
		//准备数据topPrivilegeList
		List<Privilege> topPrivilegeList=privilegeService.findTopList();
		sce.getServletContext().setAttribute("topPrivilegeList", topPrivilegeList);
		System.out.println("------>已准备数据");

	}

}
