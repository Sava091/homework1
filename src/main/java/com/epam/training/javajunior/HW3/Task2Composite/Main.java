package com.epam.training.javajunior.HW3.Task2Composite;

import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

// (1+2)*4+5*(3+6)
public class Main {
    // list of available functions
    private final String OPERATORS = "+-*/";
    // separator of arguments
    private final String SEPARATOR = ",";
    // temporary stack that holds operators, functions and brackets
    private Stack<String> stackOperations = new Stack<String>();
    // stack for holding expression converted to reversed polish notation
    private Stack<String> stackRPN = new Stack<String>();

    public static void main(String[] args) {
        Main main = new Main();
        main.parse("(1+2)*4+5*(3+6)");
                System.out.println(main.stackRPN);
        String expr = String.join("", main.stackRPN);
        System.out.println(evaluatePrefix(expr).calculate());
    }

    static Boolean isOperand(char c) {
        // If the character is a digit
        // then it must be an operand
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

    static Statement evaluatePrefix(String exprsn) {
        Stack<Statement> Stack = new Stack<>();

        for (int j = exprsn.length() - 1; j >= 0; j--) {

            // Push operand to Stack
            // To convert exprsn[j] to digit subtract
            // '0' from exprsn[j].
            if (isOperand(exprsn.charAt(j)))
                Stack.push(new AriphmethicValue((double) (exprsn.charAt(j) - 48)));

            else {

                // Operator encountered
                // Pop two elements from Stack
                Statement o1 = Stack.peek();
                Stack.pop();
                Statement o2 = Stack.peek();
                Stack.pop();

                // Use switch case to operate on o1
                // and o2 and perform o1 O o2.
                switch (exprsn.charAt(j)) {
                    case '+':
                        PlusOperation plusOperation = new PlusOperation(o1, o2);
                        Stack.push(plusOperation);
                        break;
                    case '-':
                        MinusOperation minusOperation = new MinusOperation(o1, o2);
                        Stack.push(minusOperation);
                        break;
                    case '*':
                        MulOperation mulOperation = new MulOperation(o1, o2);
                        Stack.push(mulOperation);
                        break;
                    case '/':
                        DivOperation divOperation = new DivOperation(o1, o2);
                        Stack.push(divOperation);
                        break;
                }
            }
        }

        return Stack.peek();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isSeparator(String token) {
        return token.equals(SEPARATOR);
    }

    private boolean isOpenBracket(String token) {
        return token.equals("(");
    }

    private boolean isCloseBracket(String token) {
        return token.equals(")");
    }

    private boolean isOperator(String token) {
        return OPERATORS.contains(token);
    }

    private byte getPrecedence(String token) {
        if (token.equals("+") || token.equals("-")) {
            return 1;
        }
        return 2;
    }

    public void parse(String expression) {
        // cleaning stacks
        stackOperations.clear();
        stackRPN.clear();

        // make some preparations
        expression = expression.replace(" ", "").replace("(-", "(0-")
                .replace(",-", ",0-");
        if (expression.charAt(0) == '-') {
            expression = "0" + expression;
        }
        // splitting input string into tokens
        StringTokenizer stringTokenizer = new StringTokenizer(expression,
                OPERATORS + SEPARATOR + "()", true);

        // loop for handling each token - shunting-yard algorithm
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (isSeparator(token)) {
                while (!stackOperations.empty()
                        && !isOpenBracket(stackOperations.lastElement())) {
                    stackRPN.push(stackOperations.pop());
                }
            } else if (isOpenBracket(token)) {
                stackOperations.push(token);
            } else if (isCloseBracket(token)) {
                while (!stackOperations.empty()
                        && !isOpenBracket(stackOperations.lastElement())) {
                    stackRPN.push(stackOperations.pop());
                }
                stackOperations.pop();
            } else if (isNumber(token)) {
                stackRPN.push(token);
            } else if (isOperator(token)) {
                while (!stackOperations.empty()
                        && isOperator(stackOperations.lastElement())
                        && getPrecedence(token) <= getPrecedence(stackOperations
                        .lastElement())) {
                    stackRPN.push(stackOperations.pop());
                }
                stackOperations.push(token);
            }
        }
        while (!stackOperations.empty()) {
            stackRPN.push(stackOperations.pop());
        }

        // reverse stack
        Collections.reverse(stackRPN);
    }
}
