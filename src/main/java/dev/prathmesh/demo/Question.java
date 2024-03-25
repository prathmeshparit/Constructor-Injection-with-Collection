package dev.prathmesh.demo;

import java.util.List;

public class Question {
    private int number ;
    private String name;
    private List<String> answers;

    public Question(int number , String name, List<String> answers)
    {
        this.number =number;
        this.name =name;
        this.answers = answers;
    }


    public void ShowQuestion()
    {
        System.out.println(number + " " + name);
        for(String item : answers)
        {
            System.out.println(item);
        }
    }



}
