/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribucionpoisson;

import java.math.BigInteger;

/**
 * Esta clase contiene los diferentes metodos de distribucion de variable aleatoria
 * a implementar.
 * @author ediaz@tamps.cinvestav.mx
 *
 */
public interface RandomVariableMethods 
{
    double DistribucionPoison(int lambda, int k);
    int getFactorial(int k);
    double [] obtainRandomVariables(int cardinalidad, int lambda );
}
