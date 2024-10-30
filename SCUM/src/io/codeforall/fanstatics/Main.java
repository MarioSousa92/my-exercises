package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine();

        int x = 5;
        MonoOperation square = num -> num * num;
        Integer resultSquare = Machine.performMonoOperation(square, 5);
        System.out.println("Square of 5: " + resultSquare);


        int a = 5;
        int b = 10;
        BiOperation add = (num1, num2) -> num1 + num2;
        Integer resultAdd = Machine.performBiOperation(add, 5, 10);
        System.out.println("Add of 5 e 10: " + resultAdd);

    }
}