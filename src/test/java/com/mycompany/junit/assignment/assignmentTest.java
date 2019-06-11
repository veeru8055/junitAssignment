/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.assignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author viren
 */
public class assignmentTest {
    
    // TODO add test methods here.
    /*
    1. "A"=""
    2. "B"="B"
    3. "AA"=""
    4. "AB"="B"
    5. "ABCD"="BCD"
    6. "AABCDA"="BCDA"
    7. "BCAA"="BCAA"
    8. "BA"="B"
    9. "CAAB"="CAB"
    10. "CBBC"="CBBC"
    */
    JunitAssignment obj;
    @Before
    public void setUp(){
        obj=new JunitAssignment();
    }
    
    @Test
    public void test1(){
        assertEquals("", obj.removeA("A"));
    }
    
    @Test
    public void test2(){
        assertEquals("B", obj.removeA("B"));
    }
    
    @Test
    public void test3(){
        assertEquals("", obj.removeA("AA"));
    }
    
    @Test
    public void test4(){
        assertEquals("B", obj.removeA("AB"));
    }
    
    @Test
    public void test5(){
        assertEquals("BCD", obj.removeA("ABCD"));
    }
    
    @Test
    public void test6(){
        assertEquals("BCDA", obj.removeA("AABCDA"));
    }
    
    @Test
    public void test7(){
        assertEquals("BCAA", obj.removeA("BCAA"));
    }
    
    @Test
    public void test8(){
        assertEquals("B", obj.removeA("BA"));
    }
    
    @Test
    public void test9(){
        assertEquals("CAB", obj.removeA("CAAB"));
    }

    @Test
    public void test10(){
        assertEquals("CBBC", obj.removeA("CBBC"));
    }
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
