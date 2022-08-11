package tasks;

import org.testng.annotations.Test;

import Generic_lib.Base_class;

public class Tc_001_Test extends Base_class {

	
	@Test
	public void demo() {
		driver.get("http://demowebshop.tricentis.com/");
	}
}
