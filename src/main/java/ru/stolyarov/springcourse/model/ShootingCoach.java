package ru.stolyarov.springcourse.model;

import ru.stolyarov.springcourse.service.FortuneService;

public class ShootingCoach implements Coach{
    private final FortuneService fortuneService;

    public ShootingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "You must shoot 10 times every day!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
