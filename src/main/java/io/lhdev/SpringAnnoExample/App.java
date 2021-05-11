package io.lhdev.SpringAnnoExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s21 = factory.getBean(Samsung.class);
        s21.config();

    }
}
