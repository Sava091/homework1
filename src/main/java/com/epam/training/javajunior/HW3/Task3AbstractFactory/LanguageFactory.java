package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Audio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Subs;

public abstract class LanguageFactory {
    public abstract Audio createAudio();
    public abstract Subs createSubs();
}
