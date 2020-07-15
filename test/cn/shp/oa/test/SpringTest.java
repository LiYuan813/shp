package cn.shp.oa.test;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.shp.oa.test.TestService;

public class SpringTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void testBean() throws Exception {
		TestAction testAction = (TestAction) ac.getBean("testAction");
		System.out.println(testAction);
	}
	//≤‚ ‘session factory
	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
	//≤‚ ‘ ¬ŒÒ
	@Test
	public void testTransaction() throws Exception {
		TestService testService = (TestService) ac.getBean("testService");
		testService.saveTwoUsers();
	}
}
