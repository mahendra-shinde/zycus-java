package com.mahendra.demo1;

public class UDate {
	private int date = 1, month = 1, year = 2018;
	
	//Set of STATIC Constants
	public static final int SHORT_DATE = 1;
	public static final int LONG_DATE = 5;
	public static final int NORMAL_DATE = 3;
	private static final String[] MONTH_NAMES = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOMBER","NOVEMBER","DECEMBER"};
	private static final String[] MONTH_NAME_SHORT = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	//Default date style is NORMAL DATE
	private static int dateStyle = NORMAL_DATE;
	
	//Defined a static method to change date style
	public static void setDateStyle(int style) {
		dateStyle = style;
	}
	
	
	public UDate(int date, int month, int year) {
		if (year >= 1970 && year <= 2018) {
			this.year = year;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		}
		int maxDays = 31; // default MAX for Days in month
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			maxDays = 30;
		}
		if (month == 2) {
			if (isLeap()) {
				maxDays = 29;
			} else
				maxDays = 28;
		}
		if (date >= 1 && date <= maxDays)
			this.date = date;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UDate other = (UDate) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	public String toString() {
		switch(UDate.dateStyle) {
		case NORMAL_DATE:
			return date+", "+ MONTH_NAME_SHORT[month-1]+" "+year;
			
		case SHORT_DATE:
			return date+"/"+month+"/"+year;
		
		case LONG_DATE:
			return year+", "+MONTH_NAMES[month-1]+" "+date;
		default:
			return date+", "+ MONTH_NAME_SHORT[month-1]+" "+year;	
		}
	}
	
	private boolean isLeap() {
		return (this.year % 100 == 0 && this.year % 400 == 0) || (this.year % 100 != 0 && this.year % 4 == 00);
		/*
		 * if(this.year %100 == 0 && this.year %400==0) return true; else if(this.year%4
		 * == 0) return true; return false;
		 */ }
}
