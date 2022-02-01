package spring.love.calculator.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = " * Your Name can't be blank")
    @Min(value = 3, message = "* your Name should have at least 3 characters")
    @Size(min = 3, max = 15, message = "* Your Name should have at least 3 Character")
    private String userName; // = "Mr x";
    private String crushName; //= "Miss y";


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

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "userName='" + userName + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
