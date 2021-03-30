package com.assignments.four;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountControllerTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        BankAccountController controller = context.getBean(BankAccountController.class);
        System.out.println(controller.getBalance(2));
    }

    @Test
    void getBalance() {
    }

    @Test
    void fundTransfer() {
    }
}