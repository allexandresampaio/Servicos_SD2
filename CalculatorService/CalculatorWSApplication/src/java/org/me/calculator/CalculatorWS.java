/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author alunoifba
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i + j;
        return k;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i - j;
        return k;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "mult")
    public int mult(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i * j;
        return k;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i / j;
        return k;
    }
}
