package spring.love.calculator.mvc1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"spring.love.calculator.api", "spring.love.calculator.mvc1"})
public class AppConfig1 implements WebMvcConfigurer {



}
