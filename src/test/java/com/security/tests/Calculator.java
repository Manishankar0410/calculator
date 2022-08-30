package com.security.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.security.calculator.CalculatorCondition;

class Calculator {

	@Test
	public void addition()
	{
		CalculatorCondition cond = new CalculatorCondition();
		assertEquals(30, cond.addition(10, 20));
	}

}
