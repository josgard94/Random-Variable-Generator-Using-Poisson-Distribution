/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribucionpoisson;

import java.math.BigInteger;

/**
 * Esta clase hereda todas los metodos de la interface RandomVariableMethods.
 * @author ediaz@tamps.cinvestav.mx
 */
public class MethodPoisson implements RandomVariableMethods{

    /**
     * Este metodo implemeta la distribución de Poisson.
     * @param k Numero de ocurrencias del evento o fenomeno
     * @param lambda Parametro positivo que representa el numero de veces 
     * que se espera que ocurra el fenomeno durante un intervalo de dado.
     * @return 
     */
    @Override
    public double DistribucionPoison(int lambda, int k) 
    {
        double k_fac = getFactorial(k);
        double P =  ((Math.pow(lambda,k)*Math.exp(-lambda))/k_fac);
        return P;
    }
    
    @Override
    public double[] obtainRandomVariables(int cardinalidad, int lambda) {
        
        double [] X  = new double[cardinalidad];
        int k ;
            for(int i = 0; i < cardinalidad;i++)
            {
                k = 0;
                
                double u = Math.random();
                double F = DistribucionPoison(lambda,k);
                while(true)
                {
                    k++;
                    F = F + DistribucionPoison(lambda,k);
                    if(F>u)
                    {
                        break;
                    }
                }
                X[i] = k;
                
            }

        return X;
    }
    
    
    /**
     * Metodo recursivo el cual le calcula el factorial a un numero n.
     * @param n es el numero al que se le calculara el factorail.
     * @return  regresa el factorial del numero cuando el caso base se cumple.
     */
    @Override
    public int getFactorial(int n)
    { 
        if(n < 2)
        {
            return 1;
        }
        else
        {
            return n * getFactorial(n-1);
        }
                
        
    }
    
}

