package Testscripts;

import org.testng.annotations.Test;

import Generic.GenericData;
import Generic.Generic_class;
import POM.Pom;

public class SampleTest1 extends Generic_class {

	@Test
	public void test()
	{
		String u_name = GenericData.GetData("Sheet1", 0, 0);
		String password = GenericData.GetData("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.un(u_name);
		p.pwd(password);
		//Assert.fail();
		p.btn();
		
		
	}
}