package org.check.test2.prjNewJunit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {
	
	DemoUtils demoUtils;
	//setup
	@BeforeEach
	public void setupBeforeTest() {
		demoUtils = new DemoUtils();
		System.out.println("before each executed");
	}
	
//	@BeforeAll
//	public static void setupBeforeTest() {
//		demoUtils = new DemoUtils();
//		System.out.println("before each executed");
//	}

	
//	@Test
	@DisplayName("Test equals")
	@ParameterizedTest(name = "expected= {0} ,value1= {1} ,value2 = {2}")
	@CsvSource({"6,2,4","8,4,4","9,6,3"})
	public void testEqualsAndNotEquals(int expected,int val1,int val2) {
		//assert
		assertEquals(expected, demoUtils.add(val1, val2) ,"2 + 4 must be equal 6");
		
	}
	
	@Test
	public void testEqualsAndNotEquals2() {
		// setup
		int expected = 8;
		
		//assert
		assertEquals(expected, demoUtils.add(4, 4) ,"4 + 4 must be equal 6");
		
	}
	
	@Test
	@DisplayName("Test throws")
	@Order(-3)
	@EnabledIfEnvironmentVariable(named = "HI_CH",matches = "H2")
	public void testThrowsExp() {
		
		assertThrows(Exception.class, () ->{demoUtils.throwsExp(-1);}, "throws Exception");
    	
    }
	
	@Test
	@DisplayName("Test Timeout")
	@Order(-1)
	@EnabledOnOs(OS.LINUX)
	public void testTimeout() {
		
		assertTimeout(Duration.ofSeconds(3), () ->{demoUtils.checkTimeout();}, "timeout check");
    	
    }

}
