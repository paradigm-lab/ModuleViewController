package spring.love.calculator.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    @Override
    public void initialize(Age constraintAnnotation) {
        // I can write the post construct work right here
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        // Writing my logic here

        return false;
    }
}
