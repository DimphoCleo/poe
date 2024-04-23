/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registerandloginpart1poe;

import static com.mycompany.registerandloginpart1poe.SpecialCharacters2.isSpecialCharacter;

/**
 *
 * @author RC_Student_lab
 */
public class Password2 {

    /**
     *
     * @param password
     * @return
     */
    public static boolean IsValidPassword(String password) {
        if (password.length()<8){
            return false;
        }
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacters = false;
         
    for (char c : password.toCharArray()) {
        if (Character.isUpperCase(c)) {
        hasCapitalLetter = true;
        }
    else if (Character.isDigit(c)) {
        hasNumber = true;
    }
    else if (isSpecialCharacter(c)) {
        hasSpecialCharacters = true;
    }
    }
    return hasCapitalLetter && hasNumber && hasSpecialCharacters;
    
}

    
    
}
