package stepdefs;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class EmailStepDef {
    private String email;
    private  boolean actual;
    @Given("saya memasukan email {string}")
    public void saya_memasukan_email(String string) {
        this.email = string;
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @When("saya test formatnya")
    public void saya_test_formatnya() {
        if (this.email.length() > 4){
            this.actual = true;
        } else  {
            this.actual= false;
        }
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("hasilnya harus {string}")
    public void hasilnya_harus(String string) {
            boolean expect = Boolean.parseBoolean(string);
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        assertEquals(actual, expect);
    }
}
