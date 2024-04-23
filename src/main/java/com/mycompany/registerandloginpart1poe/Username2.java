/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registerandloginpart1poe;

/**
 *
 * @author RC_Student_lab
 */
public class Username2 {
    //create username class using a boolean

    /**
     *
     * @param username
     * @return
     */
    public static boolean isValidUsername (String username){
        return username != null && username.length() <5 && username.contains ("_");
    }
    
}
