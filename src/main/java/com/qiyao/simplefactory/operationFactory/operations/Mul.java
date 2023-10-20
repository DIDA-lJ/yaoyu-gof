package com.qiyao.simplefactory.operationFactory.operations;

import com.qiyao.simplefactory.operationFactory.Operation;

/**
 * @ClassName Mul
 * @Description 乘法实现类
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/21
 */
public class Mul extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
