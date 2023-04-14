package homework;

import com.kodilla.homework.ResulChecker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class divide {
    private int number;
    private String result;

    @Given("number is 18")
    public void your_number_is_18() {
        this.number = 18;
    }
    @Given("number is 15")
    public void your_number_is_15() {
        this.number = 15;
    }
    @Given("number is 10")
    public void your_number_is_10() {
        this.number = 10;
    }
    @Given("number is 4")
    public void your_number_is_4() {
        this.number = 4;
    }


    @When("I ask whether it's divide")
    public void i_ask_whether_it_s_divide(){
        this.result = ResulChecker.divideByNumber(this.number);
    }


    @Then("The result is {string}")
    public void the_result_is(String string){
        Assertions.assertEquals(string,this.result);
    }

    }



