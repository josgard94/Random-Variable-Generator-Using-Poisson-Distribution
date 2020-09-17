/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribucionpoisson;

/**
 *
 * @author ediaz@tamps.cinvestav.mx
 */
public class MakeMethod 
{
    /**
     * Permite la creacion de nuevos objetos, mediante el metodo factory.
     * @param methodType String que contiene el nombre del metodo de variable aleatoria que se creara como un nuevo objeto.
     * @return Un nuevo objeto generado por factory en este caso un metodo de variable aleatoria.
     */
    public RandomVariableMethods getMethod(String methodType)
    {
        if(methodType.equalsIgnoreCase("poisson"))
        {
            return new MethodPoisson();
        }
        return null;
    }
}
