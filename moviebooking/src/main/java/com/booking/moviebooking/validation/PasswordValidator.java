package com.booking.moviebooking.validation;


import javax.validation.Constraint;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmailValidatorClass.class)
public @interface PasswordValidator {

    public String  message() default  "Please enter passowd containing atleast one upperCase ,one lowerCase,special charater ,one number and must not have whitespace ";

}
