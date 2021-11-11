/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.rmi.cliente;

/**
 *
 * @author Intel
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("Java application !!!");
        Operation o = new Operation();
        int a = 10;
        int b = 2;
        System.out.println("suma: " + o.suma(a, b));
        System.out.println("diferencia: " + o.diferencia(a, b));
        System.out.println("producto: " + o.producto(a, b));
        System.out.println("cociente: " + o.cociente(a, b));
    }
}
