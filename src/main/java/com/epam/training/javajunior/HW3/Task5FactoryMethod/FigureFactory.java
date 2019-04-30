package com.epam.training.javajunior.HW3.Task5FactoryMethod;

import com.epam.training.javajunior.HW3.Task5FactoryMethod.Figures.*;

import java.util.Random;

public class FigureFactory {
    private Figure[] figures;
    private Random rnd;

    public FigureFactory() {
        figures = new Figure[]{
                new FigureL(),
                new SuperFigureL(),
                new FigurePipe(),
                new SuperFigurePipe(),
                new FigureSquare(),
                new SuperFigureSquare(),
                new FigureT(),
                new SuperFigureT(),
                new FigureZ(),
                new SuperFigureZ()
        };
        rnd = new Random();
    }

    public Figure createFigure() {
        final int figureNumber = rnd.nextInt(figures.length);
        return figures[figureNumber];
    }
}
