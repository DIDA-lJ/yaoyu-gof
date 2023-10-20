package com.qiyao.simplefactory.operationFactory.operations;

import com.qiyao.simplefactory.operationFactory.Operation;

/**
 * @ClassName Div
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/21
 */
public class Div extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为 0!");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
