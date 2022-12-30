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
    public  void validContactNumber() {

        Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher("91 4567890987");
        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
    public void validPasswordRule1(){
        Pattern pattern = Pattern.compile("^[a-z]{8,}+$");
        Matcher matcher = pattern.matcher("shitallkarad");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    public void validPasswordRule2() {
        Pattern pattern = Pattern.compile("^([A-Z]?[a-z]{8,})$");
        Matcher matcher = pattern.matcher("Shitallkarad");
        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}


