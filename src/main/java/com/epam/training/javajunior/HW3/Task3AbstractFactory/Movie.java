package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Audio;
import com.epam.training.javajunior.HW3.Task3AbstractFactory.Languages.Subs;

public class Movie {

    Audio audio;
    Subs subs;

    public Movie(Audio audio, Subs subs) { // передавать не фабрику a аудио и сабс, а визов перенести на уровень више
        this.audio = audio;
        this.subs = subs;
    }
    public void playMovie(){
        System.out.println("Movie is playing with :");
        System.out.println(audio.getAudio());
        System.out.println(subs.getSubs());
    }
}
