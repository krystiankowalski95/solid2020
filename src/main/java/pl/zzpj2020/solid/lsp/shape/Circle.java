package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Circle implements Figure {
    private double radius;

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calcCircuit() {
        return 2*Math.PI*radius;
    }
}
