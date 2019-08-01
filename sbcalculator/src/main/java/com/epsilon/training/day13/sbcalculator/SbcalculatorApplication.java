package com.epsilon.training.day13.sbcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.epsilon.training.day13.sbcalculator.bean.Calculator;

@SpringBootApplication
public class SbcalculatorApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SbcalculatorApplication.class, args);
		Calculator calc = context.getBean(Calculator.class);
		System.out.println(calc.add(1, 4));
		System.out.println(calc.subtract(1, 4));
		System.out.println(calc.multiply(1, 4));
		System.out.println(calc.divide(1, 4));
	}

}
