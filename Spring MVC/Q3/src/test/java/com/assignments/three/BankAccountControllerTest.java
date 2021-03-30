package com.assignments.three;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountControllerTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BankAccountController controller = (BankAccountController) context.getBean("controller");
        System.out.println(controller.getBalance(1));
    }


    @Test
    void getBalance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BankAccountController controller = (BankAccountController) context.getBean("controller");
        assertEquals(10000,controller.getBalance(1));
    }

}