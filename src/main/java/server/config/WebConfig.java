package server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan("server.endpoint")
public class WebConfig extends WebMvcConfigurerAdapter {
}