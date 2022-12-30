package com.brigelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
    public  void validFirstName() {
        Matcher matcher = pattern.matcher("Shital");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }

}
