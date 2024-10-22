package com.example.loja.aberta.application.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinAnoValidator.class)
public @interface MinAno {

    String message() default "O ano não pode ser menor que o ano atual";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
