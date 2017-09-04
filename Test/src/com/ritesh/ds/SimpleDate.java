package com.ritesh.ds;

public class SimpleDate {

	protected int year = 0;
	protected int month = 0;
	protected int day = 0;

	public SimpleDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public static SimpleDate getFirstDayOfNextQuater(SimpleDate date) {
		int quarter = (date.getMonth()) / 3 + 1;
		int month = quarter * 3 + 1;
		int year = date.getYear();
		if (month > 12) {
			year++;
			month = month % 12;
		}

		return new SimpleDate(year, month, 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDate sd = new SimpleDate(2000, 2, 10);
		SimpleDate result = getFirstDayOfNextQuater(sd);
		System.out.println(result.getDay() + " " + result.getMonth() + " " + result.getYear());
	}
}
