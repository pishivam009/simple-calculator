package com.iontrading.calculator;

import static java.lang.Integer.parseInt;

public class CalculatorUtils {

    public static CalculationEntity mapArgsToEntity(String... args) {
        if (args.length != 3) {
            System.out.println("-1: Invalid arguments specified");
            System.exit(-1);
        }
        try {
            int a = parseInt(args[0]);
            int b = parseInt(args[2]);
            String c = args[1];
            return new CalculationEntity(a, b, c);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Numbers provided");
            System.exit(-1);
            return null;
        }

    }
}
