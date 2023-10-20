package com.qiyao.oopbasic;

/**
 * @ClassName Test
 * @Description OOP 入门测试
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/10/20
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        System.out.println(cat.shout());
    }
}

/**
 * 定义一个类，用于表示猫
 */
class Cat {
    private String name = "";
    /**
     * 声明一个私有字段表示猫叫的次数
     */
    private int shoutNum = 3;

    /**
     * 设置猫叫的次数
     */
    public void setShoutNum(int number){
        this.shoutNum = number;
    }

    public int getShoutNum() {
        return shoutNum;
    }

    public Cat() {
        this.name = "无名";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String shout() {
        String result = "";
        for(int  i = 0 ; i < this.shoutNum ; i++){
            result += "瞄~ ";
        }
        return "我的名字是 " + name + " 喵~ " + result;
    }


}
