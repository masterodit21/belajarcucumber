package stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCustomerStepDef {
    private String baseURL = "https://demo.guru99.com/telecom/index.html";
    private WebDriver driver;
    private WebDriver wait;
    @Given("ada di halaman dashboard")
    public void ada_di_halaman_dashboard() {
        System.setProperty("webdriver.edge.driver",
                "D:\\webdriver\\msedgedriver.exe");
        driver = new EdgeDriver();

        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get(baseURL);
        driver.manage().window().maximize();

    }

    @When("tekan menu customer")
    public void tekan_menu_customer() {
        String linkAddCustomerPath = "//a[text()=\"Add Customer\"]";
        WebElement linkAdd = driver.findElement(By.xpath(linkAddCustomerPath));
        linkAdd.click();
    }

    @When("ada di halaman customer")
    public void ada_di_halaman_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("ceklis done")
    public void ceklis_done() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("isi first name {string}")
    public void isi_first_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("isi last name {string}")
    public void isi_last_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("isi email {string}")
    public void isi_email(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("isi address {string}")
    public void isi_address(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("isi mobile phone {string}")
    public void isi_mobile_phone(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("klik submit")
    public void klik_submit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("dapat kode customer")
    public void dapat_kode_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}