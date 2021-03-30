package com.assignments.one;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {



    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer");

        System.out.println(customer);
    }

    @Test
    public void getCustomerId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer");

        assertEquals(1,customer.getCustomerId());
    }

}