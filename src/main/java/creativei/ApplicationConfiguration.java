package creativei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class ApplicationConfiguration {
    private static final Logger log = LoggerFactory.getLogger(ApplicationConfiguration.class);
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

}
