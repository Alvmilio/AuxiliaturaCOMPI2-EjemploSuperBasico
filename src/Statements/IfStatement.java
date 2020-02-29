/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statements;

import Primitives.MBoolean;
import Misc.MAst;
import Misc.MAstNode;
import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class IfStatement implements MAstNode{

    int line;
    int column;
    MAstNode ifCondition;
    LinkedList<MAstNode> statements;
    
    public IfStatement(MAstNode ifCondition, LinkedList<MAstNode> statements, int line, int column)
    {
        this.ifCondition = ifCondition;
        this.statements = statements;
        this.line = line;
        this.column = column;
    }
    
    @Override
    public Object Execute(MAst ast) {
    
        Object condVal = this.ifCondition.Execute(ast);
        if(condVal instanceof MBoolean) ///Comprobamos que el tipo sea el correcto, y que sea true
        {
            if((Boolean)((MBoolean) condVal).getValue())//como ya validamos que fue un MBoolean, el valor interno siempre es de tipo boolean por lo que podemos castear tranquilamente
            {
                for(MAstNode statement : this.statements)
                {
                    statement.Execute(ast);
                }
            }
            else
                System.out.println("No se cumplió la condicion");
        }
        else ///Error
        {
            System.out.println("ERROR SEMANTICO, NUNCA REDUJO A BOOLEANO");
        }
        return null;
    }
    
    
    
}
