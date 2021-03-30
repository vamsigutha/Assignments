package com.assignments.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Question question = (Question)context.getBean("question");

        assertEquals(1,question.getQuestionId());

        System.out.println("Answers in List");
        System.out.println(question.getAnswersInList());
        System.out.println("Answers in Set");
        System.out.println(question.getAnswersInSet());
        System.out.println("Answers in Map");
        System.out.println(question.getAnswersInMap());



    }

    @Test
    void getQuestionId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Question question = (Question)context.getBean("question");

        assertEquals(1,question.getQuestionId());
    }



}