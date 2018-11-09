/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.editor.operadores.suma;

import org.editor.operadores.api.Calcula;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author sdist
 */
@ServiceProvider(service=Calcula.class)
public class Divide implements Calcula{
    @Override
    public String calculo(double oper1, double oper2) {
        if(oper2==0){
            return "Operación no permitida, división entre 0";
        }else{
            double res = oper1/oper2;
            return oper1 + " / "+ oper2 + " = " + res;
        }        
    }
}
