package fr.eurecom.adel.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author Julien Plu
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MethodNameValidator.class)
@Documented
public @interface MethodName {
  String message() default "The method ${validatedValue} does not exists";
  Class<?>[] groups () default {};
  Class<? extends Payload>[] payload() default {};
}