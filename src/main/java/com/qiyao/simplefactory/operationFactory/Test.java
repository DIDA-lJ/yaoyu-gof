package com.qiyao.simplefactory.operationFactory;

/**
 * @ClassName Test
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/21
 */
public class Test {
    public static void main(String[] args) {
        String strOperate = "+";
        double numberA = 123.0;
        double numberB = 456.0;
        Operation operation = OperationFactory.createOperate(strOperate);
        System.out.println(operation.getResult(numberA, numberB));
    }
}
