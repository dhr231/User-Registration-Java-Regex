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
        String regex=" ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$ "
        Pattern regex=Pattern.compiler()
    }

    public static void main(String[] args) {
    Pattern firstName=Pattern.compile([A-Z])
    }
}