package com.briteERP.stepDefinitions;

import com.briteERP.pages.BasePage;
import com.briteERP.pages.NotePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteStepDefinitions {
   NotePage notePage = new NotePage();

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {
        notePage.navigateTo(string);
    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
    }
    @When("user create note information")
    public void user_create_note_information(io.cucumber.datatable.DataTable dataTable) {

    }





}
