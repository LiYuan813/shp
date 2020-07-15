package cn.shp.oa.test;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogTest {
	
	private Log log = LogFactory.getLog(this.getClass());
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	

	@Test
	public void test() throws Exception {
		log.debug("����debug��Ϣ");
		log.info("����info��Ϣ");
		log.warn("����warn��Ϣ");
		log.error("����error��Ϣ");
		log.fatal("����fatal��Ϣ");
	}

}
