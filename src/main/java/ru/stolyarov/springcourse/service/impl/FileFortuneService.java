package ru.stolyarov.springcourse.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.stolyarov.springcourse.service.FortuneService;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class FileFortuneService implements FortuneService {
    @Value("${path.to.fortunes.file}")
    private String pathToFile;

    @Value("${name.of.fortunes.file}")
    private String fileName;

    private final List<String> fortunes = new ArrayList<>();

    private final Random random = new Random();

    @PostConstruct
    public void init() {
        File file = new File(pathToFile, fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                fortunes.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getFortune() {
        return fortunes.get(random.nextInt(fortunes.size()));
    }

}
