package CountingSundays;

/**
 * Created by u120987 on 04/03/2016.
 */
public class CountingSundays {
    public static void main(String[] args) {
        int sundayCount = 0;

        for (int i = 1901; i <= 2000; i++) {
            for (int j = 1; j <= 12; j++) {
                if (dayOfDate(1,j,i) == "Sunday") {
                    sundayCount++;
                }
            }
        }

        System.out.println(sundayCount);
    }

    public static boolean isLeapYear (int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
        else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String dayOfDate (int day, int month, int year) {
        int monthNum, lastTwoDigOfYear, lastTwoDigOfYearDiv4, century, centMod4;

        switch (month) {
            case 1:
                if (isLeapYear(year)) {
                    monthNum = 6;
                } else {
                    monthNum = 0;
                }
                break;
            case 2:
                if (isLeapYear(year)) {
                    monthNum = 2;
                } else {
                    monthNum = 3;
                }
                break;
            case 3:
                monthNum = 3;
                break;
            case 4:
                monthNum = 6;
                break;
            case 5:
                monthNum = 1;
                break;
            case 6:
                monthNum = 4;
                break;
            case 7:
                monthNum = 6;
                break;
            case 8:
                monthNum = 2;
                break;
            case 9:
                monthNum = 5;
                break;
            case 10:
                monthNum = 0;
                break;
            case 11:
                monthNum = 3;
                break;
            case 12:
                monthNum = 5;
                break;
            default: monthNum = 0;
                break;
        }

        lastTwoDigOfYear = year%100;
        lastTwoDigOfYearDiv4 = lastTwoDigOfYear/4;
        century = year/100;
        century = century%10;
        centMod4 = century%4;

        int val = day+monthNum+lastTwoDigOfYear+lastTwoDigOfYearDiv4+centMod4;

        String dayOut;
        switch(val%7) {
            case 0:
                dayOut = "Saturday";
                break;
            case 1:
                dayOut = "Sunday";
                break;
            case 2:
                dayOut = "Monday";
                break;
            case 3:
                dayOut = "Tuesday";
                break;
            case 4:
                dayOut = "Wednesday";
                break;
            case 5:
                dayOut = "Thursday";
                break;
            case 6:
                dayOut = "Friday";
                break;
            default:
                dayOut = "Unknown";
                break;
        }

        return dayOut;

    }
}

