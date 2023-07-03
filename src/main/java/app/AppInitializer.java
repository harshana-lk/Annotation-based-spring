package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Course course = appContext.getBean("courseDetails", Course.class);
        System.out.println(course.getProgrammeName());
        System.out.println(course.CalculateCost());
    }
}
