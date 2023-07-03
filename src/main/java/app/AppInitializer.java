package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        CourseDetails course = appContext.getBean("courseDetails", CourseDetails.class);
        System.out.println(course.getProgrammeName());
        System.out.println(course.CalculateCost());
        System.out.println(course.getDate());
    }
}
