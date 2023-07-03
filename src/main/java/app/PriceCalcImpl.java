package app;

import org.springframework.stereotype.Component;

@Component
public class PriceCalcImpl implements PriceCalc {
    @Override
    public String getPrice() {
        return "50000LKR";
    }
}
