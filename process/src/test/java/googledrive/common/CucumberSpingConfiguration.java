package googledrive.common;

import googledrive.ProcessApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProcessApplication.class })
public class CucumberSpingConfiguration {}
