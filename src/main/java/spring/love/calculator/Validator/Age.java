package spring.love.calculator.Validator;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Age {

    String message() default "Age should between 18-60";
    int lower() default 18;
    int upper() default 60;


}
