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
public class MInteger extends Primitive implements MAstNode{
    
    public MInteger(Object value) {
        super(value);
    }

    @Override
    public Object Execute(MAst ast) {
        return this;
    }
    
    
    
}
