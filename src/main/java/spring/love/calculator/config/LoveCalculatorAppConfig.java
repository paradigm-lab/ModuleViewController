package spring.love.calculator.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import spring.love.calculator.formatter.PhoneNumberFormatter;
import spring.love.calculator.formatter.billFormatter;


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
    // Reloadable
    @Bean
    public MessageSource messageSource() {

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");

        return messageSource;
    }

    @Bean(name = "validator")
    public LocalValidatorFactoryBean validator() {

        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());

        return localValidatorFactoryBean;
    }

    /*
    @Override
    public void addFormatters(FormatterRegistry registry) {
        System.out.println("Inside addFormatters Method");
        registry.addFormatter(new PhoneNumberFormatter());
        registry.addFormatter(new billFormatter());
    }
    */

    @Override
    public Validator getValidator() {

        return validator();
    }
}
