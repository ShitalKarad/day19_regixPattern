package com.brigelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public  void validFirstName() {
         Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Shital");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    public  void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Shital");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    public void  validEmail(){

            Pattern pattern = Pattern.compile("^(.+)@(.+)$");
            Matcher matcher = pattern.matcher("shitalkarad24@gmail.com");
            if (matcher.matches()){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }

