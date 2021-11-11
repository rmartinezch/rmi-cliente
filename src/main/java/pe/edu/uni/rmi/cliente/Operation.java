/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.rmi.cliente;

/**
 * Basic operations
 * @author Intel
 */
public class Operation {
    
    public int suma(int a, int b) {
        return a + b;
    }
    public int diferencia(int a, int b) {
        return a - b;
    }
    public int producto(int a, int b) {
        return a * b;
    }
    public int cociente(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }
    
}
