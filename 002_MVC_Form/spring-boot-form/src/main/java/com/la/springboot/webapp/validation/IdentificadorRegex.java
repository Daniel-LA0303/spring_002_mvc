package com.la.springboot.webapp.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IdentificadorRegexValidador.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface IdentificadorRegex {
	String message() default "Identificador inválido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
