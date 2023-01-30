package ru.stolyarov.springcourse.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stolyarov.springcourse.model.Coach;
import ru.stolyarov.springcourse.config.SportConfig;
import ru.stolyarov.springcourse.model.SwimCoach;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //читаем спринг-конфиг java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //получаем бин из контейнера
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);


        //вызываем метод на бине
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        //закрываем контекст
        context.close();
    }
}
