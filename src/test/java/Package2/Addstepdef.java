package Package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addstepdef {
	@Given("I enter 40 in the calculator")
	public void I_enter_20_in_the_calculator()
	{
		System.out.println("I enter 20 in the calculator");
	}
	@And("I press add")
	public void I_press_add()
	{
		System.out.println("I press add");
	}
	@And("I have entered 20 in the calculator")
	public void Again_add()
	{
		System.out.println("I again need to add 20");
	}
	@When("I press equal")
	public void Equal()
	{
		System.out.println("I press equal");
	}
	@Then("The result should be 40 on the screen")
	public void Result()
	{
		System.out.println("The result 40 should be displayed on the screen");
	}

}
