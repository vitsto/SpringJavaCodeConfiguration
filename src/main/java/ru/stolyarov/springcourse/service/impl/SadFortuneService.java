package ru.stolyarov.springcourse.service.impl;

import ru.stolyarov.springcourse.service.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
