package spring.love.calculator.api;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;


@ApplicationScope
@Component("applicationScopeTest")
public class ApplicationScopeTest {

    private int i = 0;

    public ApplicationScopeTest(){
        System.out.println("ApplicationScopeTest Constructor");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
