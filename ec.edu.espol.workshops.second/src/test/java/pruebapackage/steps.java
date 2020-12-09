package pruebapackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import CucumberGradleTest.Code;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class steps {
	private Code premium = new Code();
	
	@Given("Is a man")
	public void IsMan() {
		premium.setGen('M');
	}

	@Given("Is a woman")
	public void IsWoman() throws Throwable{
		premium.setGen('F');
	}

	@And("Is {int} years old")
	public void IsAge(int age) throws Throwable{
		premium.setAge(age);
	}
	 
	@And("Is single")
	public void IsSingle() throws Throwable{
		premium.setMarry('N');
	}
	
	@And("Is married")
	public void IsMarried() throws Throwable{
		premium.setMarry('Y');
	}

	@When ("Calculate the premium")
	public void Calculate() throws Throwable{
		premium.CalculatePremium();
	}
	
	@Then("Show the Insurance premium")
	public void Show() {
		int premiumvalue = premium.getPrevium();
		System.out.println("The premium is "+String.valueOf(premiumvalue));		
	}
}
