package xzy.manager.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext-dao.xml");

    }
}
