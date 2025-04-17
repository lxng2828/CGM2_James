package l9_AutomatedTestingAndTDD;

public class NextDayCalculator {

    private static boolean kiemTraNamNhuan(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    private static int layNgayTrongThang(int month, int year) {
        switch (month) {
            case 2:
                return kiemTraNamNhuan(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    public static String layNgayTiepTheo(int day, int month, int year) {
        if (year <= 0) {
            return "nam khong hop le";
        }
        if (month < 1 || month > 12) {
            return "thang khong hop le";
        }
        int daysInCurrentMonth = layNgayTrongThang(month, year);
        if (day < 1 || day > daysInCurrentMonth) {
            return "ngay khong hop le";
        }

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (day < daysInCurrentMonth) {
            nextDay++;
        } else {
            nextDay = 1;
            if (month < 12) {
                nextMonth++;
            } else {
                nextMonth = 1;
                nextYear++;
            }
        }

        return nextDay + "/" + nextMonth + "/" + nextYear;
    }
}
