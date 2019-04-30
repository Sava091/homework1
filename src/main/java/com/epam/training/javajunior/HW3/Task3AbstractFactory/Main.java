package com.epam.training.javajunior.HW3.Task3AbstractFactory;

import java.util.Scanner;

//import static com.epam.training.javajunior.HW3.Task3AbstractFactory.LanguageList.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your language - ENG, RUS, UA");
        Scanner scanner = new Scanner(System.in);
        LanguageFactory languageFactory;
        while (true) {
            String userInput = scanner.nextLine();
            languageFactory = createFactory(userInput);
            if (languageFactory != null) {
                break;
            }
            throw new IllegalArgumentException();
        }
        Movie movie = new Movie(languageFactory.createAudio(), languageFactory.createSubs());
        movie.playMovie();
    }

    private static LanguageFactory createFactory(String LanguageList) {
        switch (LanguageList.toUpperCase()) {
            case "ENG":
                return new EngLanguageFactory();
            case "RUS":
                return new RuLanguageFactory();
            case "UA":
                return new UaLanguageFactory();
            default:
                return null;
        }
    }
}

