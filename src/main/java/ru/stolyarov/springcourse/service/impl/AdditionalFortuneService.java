package ru.stolyarov.springcourse.service.impl;

import ru.stolyarov.springcourse.service.FortuneService;

public class AdditionalFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "A person of words and not deeds is like a garden full of weeds.";
    }
}
