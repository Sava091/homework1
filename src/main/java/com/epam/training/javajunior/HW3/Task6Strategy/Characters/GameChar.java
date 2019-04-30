package com.epam.training.javajunior.HW3.Task6Strategy.Characters;

import com.epam.training.javajunior.HW3.Task6Strategy.MovingTypes.Movable;

public class GameChar implements Character{

    private String name;
    private CharacterType characterType;
    private Movable move;

    public GameChar(String name, CharacterType characterType, Movable move){
        this.name = name;
        this.characterType = characterType;
        this.move = move;
    }

    @Override
    public void setMoveType(Movable move) {
        this.move = move;
    }

    @Override
    public void move() {
        System.out.println(name + move.getMoveType());
    }
}
