package spring.love.calculator.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import spring.love.calculator.formatter.PhoneNumberFormatter;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "spring.love.calculator.controllers")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

    // Set up my view Resolver
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    // To load the Resource Bundles Spring Provides an interface called MessageSource.
    @Bean
    public MessageSource messageSource() {

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("messages");

        return messageSource;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        System.out.println("Inside addFormatters Method");
        registry.addFormatter(new PhoneNumberFormatter());
    }
}
