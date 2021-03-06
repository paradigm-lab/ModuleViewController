package spring.love.calculator.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = " * Your Name can't be blank")
    // @Min(value = 3, message = "* your Name should have at least 3 characters")
    @Size(min = 3, max = 15, message = "{userName.size}")
    private String userName; // = "Mr x";

    @NotBlank(message = " * Crush Name can't be blank")
    @Size(min = 3, max = 15, message = "* Crush Name should have char between 3-15")
    private String crushName; //= "Miss y";

    @AssertTrue(message = "Agree to use our app")
    private boolean termAndCondition;

    private String result;

    /*
                The getter and setter method
             */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public boolean isTermAndCondition() {
        return termAndCondition;
    }

    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
