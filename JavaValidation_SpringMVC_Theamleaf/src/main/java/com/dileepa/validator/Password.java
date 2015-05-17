package com.dileepa.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Intelij Idea IDE
 * Created by dileepa.
 * Date on 5/13/15.
 * Time on 11:35 AM
 */
@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Password
{
    String message() default "{Password Length is between 2 and 10.}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
