package com.shrbank;

/**
 * Created by user on 2017/4/8.
 */
class Person{   //此处类的属性不能设置为public
    private String name;
    private int age;  //设置变量的属性为private

    //接下来一段代码是可以自动生成的，主要是解决当变量设置为private状态时，在main方法中调用变量的问题

    /******************************************/

    public String getName() {   //public定义getName()获取方法，定义为String类型，然后返回name
        return name;
    }

    public void setName(String name) {   //public定义setName()设置方法，然后给name赋值
        this.name = name;
    }

    public int getAge() {   //public定义getAge()获取方法，定义为int类型，然后返回age
        return age;
    }

    public void setAge(int age) {   //public定义setAge()设置方法，并且可以对age的值进行判断
        if (age>=0&&age<=150){
            this.age = age;
        }
    }

    /******************************************/

    public void tell(){               //设置输出函数
        System.out.println("姓名："+getName()+" 年龄："+getAge());
    }

}
public class HelloAnniversaryDay {      //主类包含main()方法，并且可以在main()方法中调用各类函数，并且可以设置函数的参数

    public static void main(String[] args) {

        Person per = new Person();
        per.setName("Jon");
        per.setAge(30);
        per.tell();

    }

}
