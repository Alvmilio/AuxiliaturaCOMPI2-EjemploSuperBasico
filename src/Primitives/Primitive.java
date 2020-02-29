/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitives;

import Misc.MAst;
import Misc.MAstNode;

/**
 *
 * @author Asus
 */
public class Primitive{
    
    Object value;

    public Primitive(Object value) {
        this.value = value;
    }
    
    public Object getValue()
    {
        return this.value;
    }

}
