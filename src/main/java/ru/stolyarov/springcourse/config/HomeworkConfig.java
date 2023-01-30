package ru.stolyarov.springcourse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.stolyarov.springcourse.model.Coach;
import ru.stolyarov.springcourse.model.ShootingCoach;
import ru.stolyarov.springcourse.model.SwimCoach;
import ru.stolyarov.springcourse.service.FortuneService;
import ru.stolyarov.springcourse.service.impl.AdditionalFortuneService;
import ru.stolyarov.springcourse.service.impl.SadFortuneService;

@Configuration
@PropertySource("classpath:application.properties")
public class HomeworkConfig {
    @Bean
    public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
                                         @Value("${printed.logger.level}") String printedLoggerLevel) {

        return new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
    }

    //define bean for our sad fortune service
    @Bean
    public FortuneService additionalFortuneService() {
        return new AdditionalFortuneService();
    }

    //define bean for our swim coach and inject dependency
    @Bean
    public Coach shootingCoach() {
        return new ShootingCoach(additionalFortuneService());
    }
}
