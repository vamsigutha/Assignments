package com.assignments.ten;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());

        //we achieved this with the help of application context aware
        student.setAddress();
        System.out.println(student.getAddress());

    }
}
