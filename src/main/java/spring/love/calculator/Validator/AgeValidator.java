package spring.love.calculator.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    private int lower;
    private int upper;

    @Override
    public void initialize(Age age) {
        // I can write the post construct work right here
        this.lower = age.lower();
        this.upper = age.upper();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {

        // Check for if the age field is null
        if(age == null) {
            return false;
        }

        // Writing my logic here
        if (age < lower || age > upper) {
            return false;  // Fail
        }

        return true; // Pass
    }
}
