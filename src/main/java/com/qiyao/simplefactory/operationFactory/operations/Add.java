package com.qiyao.simplefactory.operationFactory.operations;

import com.qiyao.simplefactory.operationFactory.Operation;

/**
 * @ClassName Add
 * @Description 加法实现类
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/21
 */
public class Add extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
