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
public class Rectangulo implements Shape {
    
    double ancho;
    double largo;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double getArea() {
        return ancho*largo;
    }
    
    
    
}
