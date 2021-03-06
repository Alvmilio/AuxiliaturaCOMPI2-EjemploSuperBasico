/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statements;

import Misc.MAst;
import Misc.MAstNode;
import Primitives.MString;
import ejemplonivel0.InputPanel;

/**
 *
 * @author Asus
 */
public class PrintFunction implements MAstNode{

    MAstNode printable;
    int line;
    int column;

    public PrintFunction(MAstNode printable, int line, int column) {
        this.printable = printable;
        this.line = line;
        this.column = column;
    }
    
    
    
    
    
    @Override
    public Object Execute(MAst ast) {
        Object printableType = this.printable.Execute(ast);
        if(printableType instanceof MString)
        {
            Object valueToPrint = ((MString) printableType).getValue();
            System.out.println(valueToPrint);
            InputPanel.jTextPane3.setText(InputPanel.jTextPane3.getText()+"\n"+valueToPrint);
        }
        else
        {
            ///ERROR SEMANTICO, solo se pueden imprimir cadenas
        }
        return null;
    }
    
}
