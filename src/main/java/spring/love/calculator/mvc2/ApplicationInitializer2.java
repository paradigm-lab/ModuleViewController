package spring.love.calculator.mvc2;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import spring.love.calculator.mvc1.AppConfig1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer2 implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Registering the WebApplication Context
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(AppConfig2.class);

        // Creating the dispatcher Servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // Register Dispatcher Servlet with Servlet Context
        ServletRegistration.Dynamic  myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet2", dispatcherServlet);

        myCustomDispatcherServlet.setLoadOnStartup(2);
        myCustomDispatcherServlet.addMapping("/application2/*");
    }

}
