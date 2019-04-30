package com.epam.training.javajunior.HW3.Task10Memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.setCell('0',1,0);
        game.setCell('X',1,1);
        game.setCell('X',2,2);
        System.out.println(game);

        Screenshot screenshot = game.save();

        game.setCell('0',2,1);
        game.setCell('X',2,0);
        game.setCell('0',0,0);
        System.out.println(game);

        game.restore(screenshot);
        System.out.println(game);
    }
}
