package orientacao.objetos.composicao.exercicios.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date parseDateFull(String date) throws ParseException {
		return sdf1.parse(date);
	}
	
	public static Date parseDate(String date) throws ParseException {
		return sdf2.parse(date);
	}
	
	public static String formatDateFull(Date date) {
		return sdf1.format(date);
	}
	
	public static String formatDate(Date date) {
		return sdf2.format(date);
	}

}
