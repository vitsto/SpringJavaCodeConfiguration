package ru.stolyarov.springcourse.model;

import org.springframework.beans.factory.annotation.Value;
import ru.stolyarov.springcourse.service.FortuneService;

public interface Coach {
    String getDailyWorkout();
    String getDailyFortune();

}
