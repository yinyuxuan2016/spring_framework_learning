package org.yinyuxuan.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * lookup属性的使用
 * 如果要获取指定类型的bean，则可以使用lookup属性
 * 子类student和子类teacher继承父类user，并且都实现了父类的showMe方法
 * 若一个实类使用了父类的bean，该类在声明的时候要指定具体bean的返回类型，则会调用相应的bean功能
 * @Copyright: All Rights Reserved</p>
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("lookupTest.xml");
        GetBeanTest getBeanTest=(GetBeanTest) context.getBean("getBeanTest");
        getBeanTest.showMe();
    }
}
