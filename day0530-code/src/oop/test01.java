package oop;

/*
类的继承格式：
class 父类{
}
class 子类 extends 父类{
}
*/

public class test01 {
    public static void main(String[] args) {
       Animal a=new Animal();
       a.eat();
       Dog d=new Dog();
       d.eatTest();
    }
}

class Animal{
    void eat(){
        System.out.println("animal : eat");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog : eat");
    }
    void eatTest(){
        this.eat(); //this 调用父类

        // 如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
        // 当需要在子类中调用父类的被重写方法时，要使用 super 关键字。当需要在子类中调用父类的被重写方法时，要使用 super 关键字。

        super.eat(); //super 调用父类
    }
}
