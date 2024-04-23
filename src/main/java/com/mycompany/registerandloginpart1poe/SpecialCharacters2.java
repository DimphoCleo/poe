/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registerandloginpart1poe;

/**
 *
 * @author RC_Student_lab
 */
public class SpecialCharacters2 {

    /**
     *
     * @param c
     * @return
     */
    public static boolean isSpecialCharacter (char c ) {
        String specialCharacters = "!@#$%^&*()_-+=";
        return specialCharacters.indexOf(c)  != -1;
    }
}
