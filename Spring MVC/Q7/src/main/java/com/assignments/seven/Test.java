package com.assignments.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MarkSheet markSheet = (MarkSheet) context.getBean("marksheet1");
        System.out.println(markSheet.getResultMessage());

        Section section = (Section) context.getBean("section");
        System.out.println(section.getStudentFailedInMathList());
        System.out.println((section.getStudentNames()));

    }
}
