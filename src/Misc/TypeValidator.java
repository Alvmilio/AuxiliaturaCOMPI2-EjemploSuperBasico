/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import Primitives.MBoolean;
import Primitives.MInteger;

/**
 *
 * @author Asus
 */
public class TypeValidator {
    
    
    
    
    public enum Operand
    {
        Logical,
        Math,
        Relational
    };
    
    
    public static boolean areValidTypes(Object leftOp, Object rightOp, Operand operand)
    {
        if(operand == Operand.Logical)
        {
            if(leftOp instanceof MBoolean && rightOp instanceof MBoolean)
                return true;
            return false;
        }
        else if(operand == Operand.Relational)
        {
            ///Por motivos de ejemplo acá asumo que solo tenemos == en relacionales y que solo vienen enteros
            if(leftOp instanceof MInteger && rightOp instanceof MInteger)
                return true;
            return false;
        }
        return false;
    }
    
}
