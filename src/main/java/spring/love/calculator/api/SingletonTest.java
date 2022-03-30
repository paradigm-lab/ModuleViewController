package spring.love.calculator.api;

import org.springframework.stereotype.Component;

@Component
public class SingletonTest {

    private int i = 0;

    public SingletonTest() {
        System.out.println("SingletonTest Constructor");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
