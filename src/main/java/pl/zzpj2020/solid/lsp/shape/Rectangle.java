package pl.zzpj2020.solid.lsp.shape;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Figure {

    private double height;
    private double width;

    @Override
    public double calcArea() {
        return height*width;
    }

    @Override
    public double calcPerimeter() {
        return 2*height+2*width;
    }
}
