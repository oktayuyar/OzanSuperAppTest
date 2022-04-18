package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
 *  Created by oktayuyar on 15.04.2022
 */
@CucumberOptions(features = "classpath:features"
        , glue = "com.oktay.ozansuperapp.tests")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}


