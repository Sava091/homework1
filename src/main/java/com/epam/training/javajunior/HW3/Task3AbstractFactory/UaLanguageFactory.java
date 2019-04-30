package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Audio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Subs;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.UaAudio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.UaSubs;

public class UaLanguageFactory extends LanguageFactory{
    public Audio createAudio() {
        return new UaAudio();
    }
    public Subs createSubs() {
        return new UaSubs();
    }
}
