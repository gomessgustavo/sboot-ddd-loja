package com.example.loja.aberta.application.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Year;

public class MinAnoValidator implements ConstraintValidator<MinAno, Integer> {

    @Override
    public void initialize(MinAno constraintAnnotation) {}

    @Override
    public boolean isValid(Integer ano, ConstraintValidatorContext context) {
        if (ano == null) {
            return true;
        }
        
        int anoAtual = Year.now().getValue();
        return ano >= anoAtual;
    }
}
