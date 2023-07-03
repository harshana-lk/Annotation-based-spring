package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseDetails implements Course {
    private PriceCalc priceCalc;

    @Value("${course.date}")
    private int date;

    @Autowired
    public CourseDetails(PriceCalc priceCalc) {
        this.priceCalc = priceCalc;
    }

    @Override
    public String getProgrammeName() {
        return "Full-Stack";
    }

    @Override
    public String CalculateCost() {
        return priceCalc.getPrice();
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
