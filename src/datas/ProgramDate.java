package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {
		
		System.out.println(new Date());
		System.out.println(new Date(0L));
		System.out.println(new Date(System.currentTimeMillis()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date data = sdf.parse("12/12/2025 12:12:12");
		System.out.println(sdf.format(data));
		
		// ISO 8601 no padrão UTC: yyyy-MM-ddTHH:mm:ssZ
		// Exemplo: 2025-08-06T09:42:19Z
		var dataFromIso = Date.from(Instant.parse("2025-11-18T19:30:45Z"));
		System.out.println(dataFromIso);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println(sdf.format(data));
		System.out.println(sdf1.format(data));
	}

}
