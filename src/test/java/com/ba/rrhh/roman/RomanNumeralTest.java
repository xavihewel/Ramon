/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.rrhh.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author xavier.verges
 */
public class RomanNumeralTest {
    
    @Test(expected = Exception.class)
    public void control_onlyPositive(){
        
    }
    
    @Test
    public void Case1(){
        assertEquals(new RomanNumeral("I"), 1);
        assertEquals(new RomanNumeral("II"), 2);
        assertEquals(new RomanNumeral("III"), 3);
        
        assertNotEquals(new RomanNumeral("V"), 1);
    }
}
