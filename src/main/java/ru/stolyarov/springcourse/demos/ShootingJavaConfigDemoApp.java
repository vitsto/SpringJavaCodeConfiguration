package ru.stolyarov.springcourse.demos;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stolyarov.springcourse.config.HomeworkConfig;
import ru.stolyarov.springcourse.config.SportConfig;
import ru.stolyarov.springcourse.model.Coach;
import ru.stolyarov.springcourse.model.SwimCoach;

public class ShootingJavaConfigDemoApp {
    public static void main(String[] args) {

        //читаем спринг-конфиг java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeworkConfig.class);

        //получаем бин из контейнера
        Coach theCoach = context.getBean("shootingCoach", Coach.class);


        //вызываем метод на бине
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //закрываем контекст
        context.close();
    }
}
