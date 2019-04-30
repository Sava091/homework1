package com.epam.training.javajunior.HW3.Task6Strategy;

import com.epam.training.javajunior.HW3.Task6Strategy.Characters.Character;
import com.epam.training.javajunior.HW3.Task6Strategy.Characters.CharacterType;
import com.epam.training.javajunior.HW3.Task6Strategy.Characters.GameChar;
import com.epam.training.javajunior.HW3.Task6Strategy.MovingTypes.FlyType;
import com.epam.training.javajunior.HW3.Task6Strategy.MovingTypes.TwoInOneType;
import com.epam.training.javajunior.HW3.Task6Strategy.MovingTypes.WalkType;


public class Main {
    public static void main(String[] args) {
        Character[] charaters = {
                new GameChar("Azog", CharacterType.ORC, new WalkType()),
                new GameChar("Zuldgin", CharacterType.TROLL, new WalkType()),
                new GameChar("Gefest", CharacterType.PEGASUS, new TwoInOneType()),
                new GameChar("Legolas", CharacterType.ELF, new WalkType()),
                new GameChar("Zepesh", CharacterType.VAMPIRE, new WalkType()),
                new GameChar("Kelaina", CharacterType.HARPY, new FlyType()),
        };

        for (Character character : charaters) {
            character.move();
        }
        CharacterSquad avengers = new CharacterSquad(new FlyType());
        avengers.addCharacter(new GameChar("Azog", CharacterType.ORC, new WalkType()));
        avengers.addCharacter(new GameChar("Zuldgin", CharacterType.TROLL, new WalkType()));
        avengers.addCharacter(new GameChar("Legolas", CharacterType.ELF, new WalkType()));
        System.out.println("Magic power");
        avengers.move();

    }
}
