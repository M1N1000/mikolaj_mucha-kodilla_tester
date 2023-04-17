package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private final CashSlot cashSlot = new CashSlot();
    private final Wallet wallet = new Wallet();

    @Given("I have deposited ${int} in my wallet")
        public void i_have_deposited_$_in_my_wallet (int deposit) {
            wallet.deposit(deposit);
            Assertions.assertEquals(deposit,wallet.getBalance());
    }
    @When("I request ${int}")
        public void i_request_$ (int amount) {
            Cashier cashier = new Cashier(cashSlot);
        if (wallet.getBalance() >= amount) {
            cashier.withdraw(wallet, amount);
        }else  {
            System.out.println("In your bank account is only: " + wallet.getBalance() + "Try again!");

            }
    }
    @Then("${int} should be dispensed")
        public void $_should_be_dispensed (int answer) {
            Assertions.assertEquals(answer,cashSlot.getContents());
    }
    @Then("And the balance of my wallet should be ${int}")
    public void and_the_balance_of_my_wallet_should_be_$(int balance) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(balance,wallet.getBalance());

    }


}

