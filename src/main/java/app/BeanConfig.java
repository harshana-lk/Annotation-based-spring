package app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("app")
@PropertySource("classpath:application.properties")
public class BeanConfig {
}
