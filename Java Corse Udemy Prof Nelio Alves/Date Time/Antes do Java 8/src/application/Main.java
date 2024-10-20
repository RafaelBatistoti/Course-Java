package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//		Data de hoje
		Date currentDay = new Date();

		Date d01 = sdf1.parse("25/06/2024");
		Date d02 = sdf2.parse("25/06/2024 15:42:07");

		System.out.println(sdf2.format(currentDay));
		System.out.println();

//		***************** TRABALHANDO COM CALENDAR *****************

		Date d03 = Date.from(Instant.parse("2024-06-25T15:42:07Z"));

		System.out.println(sdf2.format(d03));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d03);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d03 = cal.getTime();
		System.out.println(sdf2.format(d03));

	}

}
