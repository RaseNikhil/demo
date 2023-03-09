package com.booking.moviebooking.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmailValidatorClass.class)
public @interface PasswordValidator {



    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    public String  message() default  "Please enter passowd containing atleast one upperCase ,one lowerCase,special charater ,one number and must not have whitespace ";



}
