package com.epam.training.javajunior.HW3.Task5FactoryMethod;

import com.epam.training.javajunior.HW3.Task5FactoryMethod.Figures.Figure;

public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        for (int i = 0; i < 5; i++) {
            Figure figure = factory.createFigure();
            figure.print();
        }
    }
}
