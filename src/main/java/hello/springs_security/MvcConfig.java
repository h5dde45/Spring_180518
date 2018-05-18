package hello.springs_security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("security/home");
        registry.addViewController("/").setViewName("security/home");
        registry.addViewController("/hello").setViewName("security/hello");
        registry.addViewController("/login").setViewName("security/login");
    }

}