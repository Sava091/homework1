package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Audio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.RuAudio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.RuSubs;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Subs;

public class RuLanguageFactory extends LanguageFactory {
    public Audio createAudio() {
        return new RuAudio();
    }
    public Subs createSubs() {
        return new RuSubs();
    }
}
