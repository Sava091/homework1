package com.epam.training.javajunior.HW3.Task6Strategy;

import com.epam.training.javajunior.HW3.Task6Strategy.Characters.Character;
import com.epam.training.javajunior.HW3.Task6Strategy.MovingTypes.Movable;

import java.util.ArrayList;
import java.util.List;

public class CharacterSquad implements Squad {

    List<Character> charactersList = new ArrayList<>();
    Movable movable;

    public CharacterSquad(Movable movable) {
        this.movable = movable;
    }


    @Override
    public void addCharacter(Character character) {
        charactersList.add(character);
    }

    @Override
    public void deleteCharacter(Character character) {
        charactersList.remove(character);
    }

    @Override
    public void move() {
        for (Character character: charactersList) {
            character.setMoveType(movable);
            character.move();
        }
    }
}
