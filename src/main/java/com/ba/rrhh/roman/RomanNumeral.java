/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.rrhh.roman;

/**
 *
 * @author xavier.verges
 */
public class RomanNumeral {

    private String symbols;

    public RomanNumeral(int number) throws Exception {
        if (number < 1) {
            throw new Exception();
        }
    }
    
    public RomanNumeral(String symbols){
        this.symbols = symbols;
    }
    
    public static implicit operator int(RomanNumeral rn){
        switch(rn){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
        }
    }
}
