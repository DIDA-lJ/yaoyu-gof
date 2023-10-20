package com.qiyao.simplefactory.operationFactory;

import com.qiyao.simplefactory.operationFactory.operations.Add;
import com.qiyao.simplefactory.operationFactory.operations.Div;
import com.qiyao.simplefactory.operationFactory.operations.Mul;
import com.qiyao.simplefactory.operationFactory.operations.Sub;

/**
 * @ClassName OperationFactory
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/21
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
            default:
                System.out.println("不支持该运算！");
                break;
        }
        return operation;
    }
}
