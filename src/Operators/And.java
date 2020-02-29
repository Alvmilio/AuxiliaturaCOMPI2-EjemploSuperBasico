/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import Primitives.MBoolean;
import Misc.MAst;
import Misc.MAstNode;
import Misc.TypeValidator;

/**
 *
 * @author Asus
 */
public class And extends BinaryOperator implements MAstNode {

    
    public And(MAstNode leftOperand, MAstNode rightOperand, int line, int column)
    {
        super(leftOperand, rightOperand, line, column);
    }
        
    @Override
    public Object Execute(MAst ast) {
    
       Object leftVal = this.leftOperand.Execute(ast);
       Object rightVal = this.rightOperand.Execute(ast);
       if(TypeValidator.areValidTypes(leftVal, rightVal, TypeValidator.Operand.Logical))
       {
           return new MBoolean((Boolean)((MBoolean)leftVal).getValue() && (Boolean)((MBoolean)rightVal).getValue());
       }
       else
       {
           ///ERROR SEMANTICO, TIPOS INVALIDOS PARA OPERADOR LOGICO AND
       }
       return false;
    }
    
}
