package dev.prathmesh.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appC.xml");
        Question object = (Question) context.getBean("forQuestion");
        object.ShowQuestion();
    }

}
