package com.epsilon.training.day13.sbcalculator.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Calculator {
	private int input1;
	private int input2;
	public int getInput1() {
		return input1;
	}
	public void setInput1(int input1) {
		this.input1 = input1;
	}
	public int getInput2() {
		return input2;
	}
	public void setInput2(int input2) {
		this.input2 = input2;
	}
	public Calculator() {
		System.out.println("Calculator Object created!");
	}
	public int add(int i, int j) {
		return i+j;
	}
	public int subtract(int i, int j) {
		return i-j;
	}
	public int multiply(int i, int j) {
		return i*j;
	}
	public int divide(int i, int j) {
		return i/j;
	}
	public int modulus(int i, int j) {
		return i%j;
	}
}
