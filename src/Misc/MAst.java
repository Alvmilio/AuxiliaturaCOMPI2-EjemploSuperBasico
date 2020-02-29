/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class MAst implements MAstNode{
    
    public LinkedList<MAstNode> mainBody;

    public MAst(LinkedList<MAstNode> mainBody)
    {
        this.mainBody = mainBody;
    }
    
    @Override
    public Object Execute(MAst ast) {
        for(MAstNode statement : this.mainBody)
        {
            statement.Execute(ast);
        }
        return null;
    }
    
}
