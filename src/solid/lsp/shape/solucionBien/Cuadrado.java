/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp2.solucionBien;

/**
 *
 * @author Alexis
 */
public class Cuadrado implements Shape{
    
    double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }
    
    
    
    
}
