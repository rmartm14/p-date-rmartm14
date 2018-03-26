package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/*
	*
	* Nos devuelve los dias, meses y años
	*
	* Para cualquier cosa, date.getDay(); es la sintaxis
	*/
	
	
	public int getDay(){		
		return this.day;
	}	
	
	public int getMonth(){
		return this.month;
	}	
	
	public int getYear(){
		return this.year;
	}
	
	/*
	* Compara la fecha entre diferentes variables: El año, el dia, el mes o todo
	*
	* La sintaxis de utilizacion es Date1.isSameDay(otraFecha);
	*/
	
	boolean isSameDay(Date another){
		if ( this.Day == another.getDay() ){
			return true;
		}
		return false;
	}
	
	boolean isSameMonth(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	
	boolean isSame(Date another){
		if(this.Date.isSameYear==true || this.Date.isSameMonth==true || this.Date.isSameDay==true){
			return true;
		}
		return false;
	}
	
	
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

}
