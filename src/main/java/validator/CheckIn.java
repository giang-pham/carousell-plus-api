package validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import model.carousell.CarousellConstant;

/**
 *	check object's existence in the provided list
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = CheckInValidator.class)
@Documented
public @interface CheckIn {

	String message() default "invalid parameter";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	CarousellConstant.constantList value();

}
