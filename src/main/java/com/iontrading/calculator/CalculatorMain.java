package com.iontrading.calculator;

import static com.iontrading.calculator.CalculatorUtils.mapArgsToEntity;

public class CalculatorMain {

	public static void main(String... args) {
		CalculationEntity entity = mapArgsToEntity(args);

		switch (entity.getOperator()) {
		case "+":
			System.out.println(entity.getNumber1() + entity.getNumber2());
			break;
		case "-":
			System.out.println(entity.getNumber1() - entity.getNumber2());
			break;
		case "x":
			System.out.println(entity.getNumber1() * entity.getNumber2());
			break;
		case "/":
			if (entity.getNumber2() == 0)
				System.out.println("Division by zero is invalid");
			else
				System.out.println(entity.getNumber1() / entity.getNumber2());
			break;
		case "%":
			System.out.println(entity.getNumber1() % entity.getNumber2());
			break;
		default:
			System.out.println("-1: Unsupported Operator {" + entity.getOperator() + "} provided");
			System.exit(-1);
		}
	}
}
