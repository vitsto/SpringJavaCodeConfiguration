package ru.stolyarov.springcourse.model;

import org.springframework.beans.factory.annotation.Value;
import ru.stolyarov.springcourse.model.Coach;
import ru.stolyarov.springcourse.service.FortuneService;

public class SwimCoach implements Coach {
    private final FortuneService fortuneService;
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim!Swim!Swim! You should have more practice!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
