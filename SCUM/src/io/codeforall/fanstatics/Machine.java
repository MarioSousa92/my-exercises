package io.codeforall.fanstatics;

public class Machine {
    // Method for MonoOperation
    public static int performMonoOperation(MonoOperation operation, int operand) {
        return operation.operate(operand);
    }

    // Method for BiOperation
    public static int performBiOperation(BiOperation operation, int operand1, int operand2) {
        return operation.operate(operand1, operand2);
    }
}