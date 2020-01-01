package bDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\user\\eclipse-workspace\\101\\features", //the part of the feature file
glue = {"stepImplementation"},  tags = ("@truNarrative"),
                      format = {"html:cucumberReport/cucumber-html-report","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
                      monochrome = true, //display the console output in a readable format 
        strict= true,
        
        
                      dryRun = false )
public class TestRunnerJUnit {

}

