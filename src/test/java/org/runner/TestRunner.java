package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Lenovo\\eclipse-workspace"
		+ "\\CucumberPractice\\FeatureFiles\\AdactinLogin.feature",
		"C:\\Users\\Lenovo\\eclipse-workspace\\CucumberPractice\\"
		+ "FeatureFiles\\ff.feature"},
glue= {"org.stepdefinitions","org.hooks"},dryRun=false,monochrome=true,
plugin= {"pretty","html:target\\cucreport.html","json:target\\rep.json",
		"junit:target\\report.xml","rerun:target/rerun.txt"})
public class TestRunner {

}
