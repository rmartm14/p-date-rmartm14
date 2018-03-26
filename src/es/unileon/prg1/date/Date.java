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
		if ( this.day == another.getDay() ){
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
		if(this.isSameYear(another)==true && this.isSameMonth(another)==true && this.isSameDay(another)==true){
			return true;
		}
		return false;
	}
	
	
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public String getMonthName(){
		String MonthName;
		MonthName=" ";
		switch(this.month){
			case 1:
				MonthName= "Enero";
			break;
			case 2:
				MonthName= "Febrero";
			break;
			case 3:
				MonthName= "Marzo";
			break;
			case 4:
				MonthName= "Abril";
			break;
			case 5:
				MonthName= "Mayo";
			break;
			case 6:
				MonthName= "Junio";
			break;
			case 7:
				MonthName= "Julio";
			break;
			case 8:
				MonthName= "Agosto";
			break;
			case 9:
				MonthName= "Septiembre";
			break;
			case 10:
				MonthName= "Octubre";
			break;
			case 11:
				MonthName= "Noviembre";
			break;			
			case 12:
				MonthName= "Diciembre";
			break;
			}
	return MonthName;
	}
	
	public boolean isDayOfTheMonthOk(){
	boolean ok;
	ok=false;
	switch (this.month){
	case 1:
	case 3: 
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		if(this.day<=31 && this.day>0){
		ok=true;
		}
	
	case 4:
	case 6:
	case 9:
	case 11:
		if(this.day<=30 && this.day>0){
		ok=true;
		}
	case 2:
		if(this.day<=28 && this.day>0){
		ok=true;
		}
	}
	return ok;
	}
	
}
