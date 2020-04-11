package tests;

import org.testng.annotations.Test;

import actions.ReusableActions;
import pages.RegisterPage2;
import pages.RegisterPage3;

public class TestCases {
	
	ReusableActions registerAction=new ReusableActions();
	//RegisterPage registerPage=new RegisterPage(ReusableActions.driver());
	RegisterPage2 regiPage2=new RegisterPage2(ReusableActions.driver());
	RegisterPage3 regiPage3=new RegisterPage3(ReusableActions.driver());
	
//	 @Test
//	 public void generalWayofDesiningTheTestCase(){
//		 registerPage.inputFirstName("Prasad");
//		 registerPage.inputLastName("Kancharla");
//		 registerPage.inputEmail("test@mail.com");
//		 
//		 registerAction.teardown();
//	 }
	
	@Test
	public void designtestcaseusingMethodChaining(){
		regiPage2.inputFirstName("Prasad")
				 .inputLastName("Kancharla")
				 .inputEmail("test@mail.com");
		
		registerAction.teardown();
	}
	
	
	@Test
	public void methodChainingNegativeCase(){
		regiPage3.inputFirstName("Prasad").readAttribute();
	}
}
