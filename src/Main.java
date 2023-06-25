import models.Holyday;

public class Main {
    public static void main(String[] args) {
        Holyday holiday = new Holyday();
        holiday.checkExistsHoliday("02/02/2023");
        holiday.returnAllHolidays();
    }
}