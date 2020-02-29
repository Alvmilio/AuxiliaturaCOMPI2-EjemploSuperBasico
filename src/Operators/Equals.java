/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import Misc.MAst;
import Misc.MAstNode;
import Misc.TypeValidator;
import Primitives.MBoolean;
import Primitives.MInteger;

/**
 *
 * @author Asus
 */
public class Equals extends BinaryOperator implements MAstNode{

    public Equals(MAstNode leftOperand, MAstNode rightOperand, int line, int column)
    {
        super(leftOperand, rightOperand, line, column);
    }
    @Override
    public Object Execute(MAst ast) {
    
        Object leftVal = this.leftOperand.Execute(ast);
        Object rightVal = this.rightOperand.Execute(ast);
        if(TypeValidator.areValidTypes(leftVal, rightVal, TypeValidator.Operand.Relational))
        {
            boolean retVal = (Integer)((MInteger)leftVal).getValue() == (Integer)((MInteger)rightVal).getValue() ? true : false;
            return new MBoolean(retVal);
        }
        else
        {
            ///ERROR SEMANTICO, TIPOS INVALIDOS PARA OPERADOR LOGICO AND
        }
        return false;
    }
    
}
