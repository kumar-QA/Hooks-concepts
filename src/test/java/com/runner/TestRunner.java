package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue={"com.stepdefination","hooks"},
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"html:target/MyReports/report.html",
				"junit:target/MyReports/report.xml"
				}
//		publish = true
//		tags = "@f1"
		)

public class TestRunner {

	
}
