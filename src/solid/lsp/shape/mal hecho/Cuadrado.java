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
public class Cuadrado extends Rectangulo {
    
    public Cuadrado(double lado) {
        super(lado, lado);
    }
    
    @Override
    public void setLargo(double lado) {
        super.setLargo(lado);
        super.setAncho(lado);
    }

    @Override
    public void setAncho(double lado) {
        super.setLargo(lado);
        super.setAncho(lado);
    }

}
