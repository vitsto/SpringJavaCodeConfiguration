package ru.stolyarov.springcourse.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stolyarov.springcourse.config.SportConfig;
import ru.stolyarov.springcourse.model.Coach;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //читаем спринг-конфиг java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //получаем бин из контейнера
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach swimmingCoach = context.getBean("swimCoach", Coach.class);

        //вызываем метод на бине
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(swimmingCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyFortune());

        //закрываем контекст
        context.close();
    }
}
