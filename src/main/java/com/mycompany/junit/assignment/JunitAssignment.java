/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.assignment;

/**
 *
 * @author viren
 */
public class JunitAssignment {
    String removeA(String string){
        int stringLength=string.length();
        if(stringLength<2){
            if(string.equals("A"))
                return "";
            else
                return string;
        }
        else{
            
            if(string.charAt(0)=='A'){
                if(string.charAt(1)=='A')
                    return ""+string.subSequence(2, stringLength);
                else
                    return ""+string.subSequence(1, stringLength);
                
            }
            if(string.charAt(1)=='A'){
                if(stringLength==2)
                    return ""+string.charAt(0);
                else
                    return ""+string.charAt(0)+string.subSequence(2, stringLength);
            }
        }
        return string;
    }
}
