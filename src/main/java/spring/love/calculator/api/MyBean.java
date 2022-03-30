package spring.love.calculator.api;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode =  ScopedProxyMode.TARGET_CLASS)
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
