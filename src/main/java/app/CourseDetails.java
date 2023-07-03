package app;

import org.springframework.stereotype.Component;

@Component
public class CourseDetails implements Course {

    @Override
    public String getProgrammeName() {
        return "Full-Stack";
    }

}
