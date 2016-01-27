package model;

import java.util.Calendar;


/**
 *
 * @author jwardell
 */
public class WelcomeService {

    private final Calendar cal = Calendar.getInstance();
    private String timeOfDay = "greeting";
    
    public String getTimeOfDay() {
        int currentHour = cal.get(Calendar.HOUR_OF_DAY);
        if (currentHour < 12) {
            timeOfDay = "morning";
        } else if (currentHour >= 12 && currentHour < 17) {
            timeOfDay = "afternoon";
        } else if (currentHour >= 17 && currentHour < 24) {
            timeOfDay = "evening";
        }
        return timeOfDay;
    }
    
    public String getGreeting(String name) {
        return "Good " + getTimeOfDay() + " " + name + "! Welcome.";
    }
}
