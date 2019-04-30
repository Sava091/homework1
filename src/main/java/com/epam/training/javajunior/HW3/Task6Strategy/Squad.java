package com.epam.training.javajunior.HW3.Task6Strategy;

import com.epam.training.javajunior.HW3.Task6Strategy.Characters.Character;

public interface Squad {

    void addCharacter(Character character);

    void deleteCharacter(Character character);

    void move();
}
