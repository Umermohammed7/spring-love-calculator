package com.seleniumexpress.lc.Validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy= PhonegoValidator.class)
public @interface Phonego {

	
	String message() default "{invalidPhoneMessage}";
	int limit () default 11;
	
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
