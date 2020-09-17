/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribucionpoisson;

import java.util.Scanner;
/**
 *
 * @author ediaz@tamps.cinvestav.mx
 */
public class Estadistica 
{

    /**
     * Este es el metodo principal de la aplicacion
     * Esta aplicacion tiene como principal tarea generar
     * variables aleatorias mediante la distribución de Poisson,
     * se implemento el patron de diseño factory con el fin de
     * generar una apliacacion que a futuro pueda ser escalable
     * en la cual se puedan incluir nuevos metodos de distribución.
     * @param args a la aplicación no se le pasa ningun parametro por argumento.
     */
    public static void main(String[] args) 
    {
        MakeMethod poisson = new MakeMethod();
        
        System.out.println("Distribución Poisson");
        System.out.println("Valor de lambda: ");
        
        Scanner valorlambda = new Scanner(System.in);
        
        int lambda = valorlambda.nextInt();
        RandomVariableMethods method = poisson.getMethod("poisson");
        
        double [] variables = method.obtainRandomVariables(20,lambda);
        
        for(int i = 0; i < variables.length;i++)
        {
            System.out.println(variables[i]);
        }        
    }
    
}
