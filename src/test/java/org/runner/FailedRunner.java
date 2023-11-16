package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt", 
glue= {"org.stepdefinitions","org.hooks"},plugin = {"rerun:target/rerun.txt"})
public class FailedRunner {

}
