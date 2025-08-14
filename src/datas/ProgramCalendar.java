package datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ProgramCalendar {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date data = Date.from(Instant.parse("2025-01-25T18:00:00Z"));
		System.out.println(sdf.format(data));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(cal.HOUR_OF_DAY, 5);
		data = cal.getTime();
		
		System.out.println(sdf.format(data));
		System.out.println("--------------------");
		
		int minute = cal.get(Calendar.MINUTE);
		int hour = 1 + cal.get(Calendar.HOUR);
		int second = cal.get(Calendar.SECOND);
		
	}

}
