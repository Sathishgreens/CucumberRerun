package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Lenovo\\eclipse-workspace\\CucumberRerun\\FeatureFiles\\ff.feature",
glue= {"org.stepdefinitions"},dryRun=false,monochrome=true,
plugin= {"html:target/cucumber-reports/html","json:target/cucumber.json","rerun:target/rerun.txt"},
tags = "@A")
public class TestRunner {

}
