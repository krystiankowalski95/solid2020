package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Square implements Figure{
    private double side;

    @Override
    public double calcArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }
}
