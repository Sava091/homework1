package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import com.epam.training.javajunior.HW3.Task3AbstractFactory.LanguageFactory;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Audio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.EngAudio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.EngSubs;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Subs;

public class EngLanguageFactory extends LanguageFactory {
    public Audio createAudio() {
        return new EngAudio();
    }
    public Subs createSubs() {
        return new EngSubs();
    }
}
