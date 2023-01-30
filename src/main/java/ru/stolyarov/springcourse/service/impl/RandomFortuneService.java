package ru.stolyarov.springcourse.service.impl;

import org.springframework.stereotype.Component;
import ru.stolyarov.springcourse.service.FortuneService;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private final String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private final Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
