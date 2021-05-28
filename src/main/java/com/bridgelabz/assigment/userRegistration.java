package com.bridgelabz.assignment;
import java.util.*;
public class userRegistration {
    boolean validateFirstName(String firstName){
        Pattern regex=Pattern.compile("^[A-Z][a-z]{3,}");
        return regex.matcher(firstName).matches;

    }

    boolean validateLastName(String lastName){
        Pattern regex=Pattern.compile("^[A-Z][a-z]{3,}");
        return regex.matcher(lastName).matches;
    }

    boolean validateEmail(String email){
        String regex=" ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$ " ;
        return boolean b=Pattern.compile(regex).matcher(email).matches();
    }

    boolean validatePhone(String phoneNo){
        String regex= "//d{2} //d{10}";
        return b=Pattern.compile(regex).matcher(email).matches();
    }

    boolean validatePassword(String password){

    }

    public static void main(String[] args) {
    Pattern firstName=Pattern.compile([A-Z])
    }
}