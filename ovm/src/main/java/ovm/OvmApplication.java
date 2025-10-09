package ovm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OvmApplication extends SpringBootServletInitializer {

    // Main method for running as standalone (optional)
    public static void main(String[] args) {
        SpringApplication.run(OvmApplication.class, args);
    }

    // This method is required for WAR deployment on external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OvmApplication.class);
    }
}
