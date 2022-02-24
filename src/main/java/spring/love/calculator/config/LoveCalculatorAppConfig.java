package spring.love.calculator.config;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import spring.love.calculator.converters.CreditCardConverter;
import spring.love.calculator.converters.CreditConverterObjectToString;
import spring.love.calculator.formatter.PhoneNumberFormatter;
import spring.love.calculator.formatter.billFormatter;

import java.util.Properties;
import java.util.logging.Logger;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"spring.love.calculator"})
@PropertySources({@PropertySource("classpath:email.properties"), @PropertySource("classpath:messages.properties")})
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

    @Autowired
    private Environment environment;

    // Creating the logger instance for the class
    Logger logger = Logger.getLogger(LoveCalculatorAppConfig.class.getName());

    // Set up my view Resolver
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");
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


    @Override
    public void addFormatters(FormatterRegistry registry) {
        System.out.println("Inside addFormatters Method");
        // registry.addFormatter(new PhoneNumberFormatter());
        // registry.addFormatter(new billFormatter());
        registry.addConverter(new CreditCardConverter());
        registry.addConverter(new CreditConverterObjectToString());
    }

    @Override
    public Validator getValidator() {

        return validator();
    }


    @Bean
    public JavaMailSender getJavaMailSender() {

        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        logger.info(">>>>>>>>>>>>>> Fetching the host value " + environment.getProperty("mail.host"));

        javaMailSender.setHost(environment.getProperty("mail.host"));
        javaMailSender.setUsername(environment.getProperty("mail.username"));
        javaMailSender.setPassword(environment.getProperty("mail.password"));
        javaMailSender.setPort(getIntProperty("mail.port"));

        // Properties mailProperties = getMailProperties();

        javaMailSender.setJavaMailProperties(getMailProperties());

        return javaMailSender;
    }

    private Properties getMailProperties() {
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        mailProperties.put("mail.smtp.host", "smtp.gmail.com");
        mailProperties.put("mail.smtp.port", "465");
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.starttls.enable", "true");
        mailProperties.put("mail.smtp.starttls.required", "true");
        mailProperties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        mailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        return mailProperties;
    }


    // Helper method to convert a string into an integer
    int getIntProperty(String key) {

        String property = environment.getProperty(key);

        return Integer.parseInt(property);
    }


}
