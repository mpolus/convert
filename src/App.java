import java.time.*;

public class App {

    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2001, 4, 2, 8, 30, 0);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId paris = ZoneId.of("Europe/Paris");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(paris);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);




    }


}