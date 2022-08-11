package POM_Re;

import Generic_lib.Base_class;

public class Tc_001_Test extends Base_class {

	public void Tc_001_Click() {
		Tc_001_reg_Test reg = new Tc_001_reg_Test();
		reg.getReg().click();
		reg.getGender().click();
		reg.getFn().sendKeys("preeti");
		reg.getLn().sendKeys("chinnu");
		reg.getEmail().sendKeys("chinnu@Gmail.com");
		reg.getPassword().sendKeys("chinnul");
		reg.getConfirmPassword().sendKeys("chinnul");
		reg.getReg_click().click();
	}
}
