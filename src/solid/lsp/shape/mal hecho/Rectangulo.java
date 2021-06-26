/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp2.shape;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public double getArea(){
        return largo*ancho;
    }
    
}
