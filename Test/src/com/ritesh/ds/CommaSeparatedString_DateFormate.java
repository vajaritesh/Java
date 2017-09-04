package com.ritesh.ds;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommaSeparatedString_DateFormate {

	public static void main(String[] args) {

		String temp = "ritesh";
		temp = "vaja";
		System.out.println("String Pool: " + temp);

		String tokens[] = { "Ritesh", "Vaja" };
		System.out.println();
		StringBuffer commaSeparated = new StringBuffer();

		for (String token : tokens) {
			if (!commaSeparated.toString().isEmpty()) {
				commaSeparated.append(",");
			}
			commaSeparated.append("\"" + token + "\"");
		}

		System.out.println("Comma Separated String: " + commaSeparated);
		System.out.println();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Calendar cal1 = Calendar.getInstance();
		System.out.println("Current Date Time : " + dateFormat.format(cal1.getTime()));
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 0);
		System.out.println(cal.getTime());

	}

}
