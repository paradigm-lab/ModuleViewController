package spring.love.calculator.api;

import javax.validation.constraints.NotNull;

public class EmailDTO {
    @NotNull
    private String userEmail;

    // Getter and setter method for the property
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
