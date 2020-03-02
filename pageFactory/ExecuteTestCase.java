package specimen;

import org.testng.annotations.Test;

public class ExecuteTestCase extends ProjectSpecificMethods{
	
	@Test
	public void testCaseExecution() {
		new HomePage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA();
	}
	
}
