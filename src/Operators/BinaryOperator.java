/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import Misc.MAstNode;

/**
 *
 * @author Asus
 */
public class BinaryOperator {
    
    public MAstNode leftOperand;
    public MAstNode rightOperand;
    int line;
    int column;

    public BinaryOperator(MAstNode leftOperand, MAstNode rightOperand, int line, int column) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.line = line;
        this.column = column;
    }
    
    
    
    
}
