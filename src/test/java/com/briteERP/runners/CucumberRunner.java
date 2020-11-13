package com.briteERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin   = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",      //always starts from the 'src'
        glue     = "com/briteERP/stepDefinitions",   //always starts from the 'com' AND //HOOKS RUNNING BY THE GLUE
        dryRun   = false,
        tags     = "@addNote",
        publish = true

)


public class CucumberRunner{

}
