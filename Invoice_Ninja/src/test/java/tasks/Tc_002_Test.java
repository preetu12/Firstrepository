package tasks;

import org.testng.annotations.Test;

import Generic_lib.Base_class;

public class Tc_002_Test extends Base_class {
	@Test
	public void jio() {
		driver.get("https://www.jio.com/");
	}
}
