package spring.love.calculator.mvc2;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"spring.love.calculator.api", "spring.love.calculator.mvc2"})
public class AppConfig2 implements WebMvcConfigurer {



}
