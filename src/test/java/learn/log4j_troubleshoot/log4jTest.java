package learn.log4j_troubleshoot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class log4jTest {
	public static Logger log=LogManager.getLogger(log4jTest.class.getName());
	@Test
	public void TC1() {
		log.info("this is a test for log4j");
	
		System.out.println("test3");
		
		System.out.println("test3");
		System.out.println("test3");
		
		System.out.println("test3_m");
	}
}
