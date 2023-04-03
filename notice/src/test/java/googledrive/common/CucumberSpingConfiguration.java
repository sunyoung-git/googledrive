package googledrive.common;

import googledrive.NoticeApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NoticeApplication.class })
public class CucumberSpingConfiguration {}
