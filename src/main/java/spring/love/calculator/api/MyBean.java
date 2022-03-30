package spring.love.calculator.api;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Component("myBean")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyBean {

    // Class Property
    private String websiteName = "Kwawingu.com";

    public MyBean() {
        System.out.println("My Bean Object created...");
    }

    // Getter and Setter methods
    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

}
