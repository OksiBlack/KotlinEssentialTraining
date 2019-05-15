import java.time.DayOfWeek;

/**
 * Created by oksana_cherniavskaia on 2019-05-14.
 */
public class SwitchTrial {
    public static void main(String[] args) {
        DayOfWeek day= DayOfWeek.MONDAY;

        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY                -> System.out.println(7);
            case THURSDAY, SATURDAY     -> System.out.println(8);
            case WEDNESDAY              -> System.out.println(9);
        }

    }
}
