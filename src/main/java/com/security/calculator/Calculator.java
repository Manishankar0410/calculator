package com.security.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator 
{
	
	@RequestMapping("number")
	public String numbers()
	{
		return "MUMbai";
	}
	
	@GetMapping("add")
	public String add(CalculatorCondition calculatorCondition)
	{
		int c = calculatorCondition.addition(130, 20);
		return "The Value is: "+c;
	}
	
	@GetMapping("multiple")
	public String multiple(CalculatorCondition calculatorCondition)
	{
		int c = calculatorCondition.multiply(10, 10);
		return "The Product is : "+c;
	}
	@GetMapping("subtract")
	public String subtract(CalculatorCondition calculatorCondition)
	{
		int c = calculatorCondition.subtraction(100,50);
		return "The Subtract is : "+c;
	}
}
