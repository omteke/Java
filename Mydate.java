package com.demotest;

public class Mydate {
	
				private int day;
				private int month;
				private int year;
				
				public Mydate(int day,int month,int year )
				{
					this.day = day;
					this.month = month;
					this.year = year;
				}
				
				public int getday(){
					return day;
				}
				public void setday(int day) {
					this.day = day;
				}
				public int getmonth(){
					return month;
				}
				public void setmonth(int month) {
					this.month = month;
				}
				public int getyear(){
					return year;
				}
				public void setyear(int year) {
					this.year = year;
				}
				@Override
				public String toString() {
					return String.format("%02d-%02d-%04d", day, month, year);
				}
}

