import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) { // 1
        List<Integer> result = new ArrayList<>(); // 2

        for (int i = 0; i < timesList.size(); i++) { // 3.1, 3.2, 3.3 (IF)
            int hr = timesList.get(i).getHours(); // 4
            int min = timesList.get(i).getMinutes(); // 5
            int sec = timesList.get(i).getSeconds(); // 6
            if (hr < 0 || hr > 24){ // 7 (IF)
                if (hr < 0){ // 7.1 (IF)
                    throw new RuntimeException("The hours are smaller than the minimum"); // 7.2
                }
                else { // 7.3
                    throw new RuntimeException("The hours are grater than the maximum");
                }
            }
            else if (hr < 24) { // 8 (IF)
                if (min < 0 || min > 59) // 8.1 (IF)
                    throw new RuntimeException("The minutes are not valid!"); // 8.2
                else { // 8.3
                    if (sec >= 0 && sec <= 59) // 8.3.1 (IF)
                        result.add(hr * 3600 + min * 60 + sec); // 8.3.2
                    else // 8.3.3
                        throw new RuntimeException("The seconds are not valid");
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) { // 9 (IF)
                result.add(hr * 3600 + min * 60 + sec); // 10
            }
            else { // 11
                throw new RuntimeException("The time is greater than the maximum");
            }
        }
        return result; // 12
    } // 13
}