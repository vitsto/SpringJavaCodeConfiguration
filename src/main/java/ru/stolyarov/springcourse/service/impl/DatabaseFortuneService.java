package ru.stolyarov.springcourse.service.impl;

import org.springframework.stereotype.Component;
import ru.stolyarov.springcourse.service.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
