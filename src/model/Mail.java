/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;

/**
 *
 * @author carlo
 */
public class Mail {

    public String getMail(String email) {        
        return email.substring(email.lastIndexOf("@")+1,email.length()-1);
    }
    
}
