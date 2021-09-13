package com.iontrading.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUtilsTest {
    @Test
    public void test_mapArgsToEntity() {
        // Given
        String[] args = {"2", "+", "3"};

        // When
        CalculationEntity result = CalculatorUtils.mapArgsToEntity(args);

        // Then
        assertEquals(2, result.getNumber1());
        assertEquals("+", result.getOperator());
        assertEquals(3, result.getNumber2());
    }
}