/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import Misc.MAst;
import Misc.MAstNode;

/**
 *
 * @author Asus
 */
public class Addition extends BinaryOperator implements MAstNode {

    public Addition(MAstNode leftOperand, MAstNode rightOperand, int line, int column)
    {
        super(leftOperand, rightOperand, line, column);
    }
    
    @Override
    public Object Execute(MAst ast) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
