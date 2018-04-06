package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year) {
		
		if(month<1 || month>12){
		this.month=0;
		}
		if(isValidDay(this.day,this.month)==false){
		this.day=0;
		}
		
		else{
		this.day = day;
		this.month = month;
		this.year = year;
		}
	
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
	
	public String getDate() {
		
		String aDate;
		aDate= this.day + "/" + this.month + "/" + this.year;
		return aDate;
	}
	
	private boolean isValidDay (int day, int month){
	int max=0;
	boolean valid;
	valid=false;
	
	if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12){
	max=31;
	}
	else if(this.month==4 || this.month==6 || this.month==9 || this.month==11){
	max=30;
	}
	else if (this.month==2) {
	max=28;
	}
	
	if(day<=max){
	valid=true;
	}
	else{
	valid=false;
	}
	return valid;
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
	ok=true;
	
	switch (this.month){
	case 1:
	case 3: 
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		if(this.day>31 && this.day<0){
		ok=false;
		}
	break;
	
	case 4:
	case 6:
	case 9:
	case 11:
		if(this.day>30 && this.day<0){
		ok=false;
		}
	break;
	case 2:
		if(this.day>28 && this.day<0){
		ok=false;
		}
	
	
	}
	return ok;

	
	
}
	public String getSeasonName () {
	String SeasonName;
	
	SeasonName=" ";
	
	switch(this.month) {
	case 12:
	case 1:
	case 2:
	case 3:
		SeasonName="Invierno";
		
	break;
	
	case 4:
	case 5:
	case 6:
		SeasonName="Primavera";
		
	break;
	
	case 7:
	case 8:
	case 9:
		SeasonName="Verano";
	
	break;
	
	case 10:
	case 11:
		SeasonName="Otoño";
		
	break;
	}
	return SeasonName;
}
	public String getMonthsRemaining () {
	
		String MonthsRemaining;
		MonthsRemaining=" ";
	
		int mes=this.month +1;
	
		
		
		for(int i=mes;i<13;i++){		
		Date otra;
		otra= new Date(this.day, mes, this.year);	
			MonthsRemaining =MonthsRemaining.concat(" " + otra.getMonthName());
			mes=mes+1;
	
		}
		return MonthsRemaining;

	}
	

	public String getDatesRemaining () {
	
		String DatesRemaining;
		DatesRemaining=" ";
		int day;
		day=this.day;
		
		switch (this.month) {
		case 1:
		case 3: 	
		case 5:	
		case 7:
		case 8:
		case 10:
		case 12:
		
			for(int i=this.day;i<32;i++) {
			Date otra1;
				otra1= new Date(day, this.month, this.year);
			DatesRemaining = DatesRemaining.concat(" " + otra1.getDate());
			day=day+1;
			}
		break;
	
		case 4:
		case 6:
		case 9:
		case 11:
		
			for(int i=this.day;i<30;i++) {
			Date otra1;
				otra1= new Date(day, this.month, this.year);
			DatesRemaining = DatesRemaining.concat(" " + otra1.getDate());
			day=day+1;
			
			}
		break;
		
		case 2:
			for(int i=this.day;i<28;i++){
			Date otra1;
				otra1= new Date(day, this.month, this.year);
			DatesRemaining = DatesRemaining.concat(" " + otra1.getDate());
			day=day+1;
			}
		break;
	
		}

		
		return DatesRemaining;

	

	}

	public String getMonthSameDays(){
	
	String MonthSameDays;
	MonthSameDays=" ";
	
	if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12){
	MonthSameDays="Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
	}
	else if(this.month==4 || this.month==6 || this.month==9 || this.month==11){
	MonthSameDays="Abril, Junio, Septiembre y Noviembre";
	}
	else{
	MonthSameDays="Febrero";
	}
	
	return MonthSameDays;
	}

	
	public int getDaysPassed() {
	int DaysPassed;
	DaysPassed=this.day;
	int mes=this.month;
	
	switch(mes) {
	case 1:
		DaysPassed= this.day;
		break;
	case 2:
		DaysPassed= DaysPassed + 31;
		break;
	case 3:
		DaysPassed= DaysPassed +31+28;
		break;
	case 4:
		DaysPassed=DaysPassed + 31+28+31;
		break;
	case 5:
		DaysPassed=DaysPassed + 31+28+31+30;
		break;
	case 6:
		DaysPassed=DaysPassed + 31+28+31+30+31;
		break;
	case 7:
		DaysPassed=DaysPassed + 31+28+31+30+31+30;
		break;
	case 8:
		DaysPassed=DaysPassed + 31+28+31+30+31+30+31;
		break;
	case 9: 
		DaysPassed=DaysPassed + 31+28+31+30+31+30+31+31;
		break;
	case 10:
		DaysPassed=DaysPassed + 31+28+31+30+31+30+31+31+30;
		break;
	case 11:
		DaysPassed=DaysPassed + 31+28+31+30+31+30+31+31+30+31;
		break;
	case 12:
		DaysPassed=DaysPassed + 31+28+31+30+31+30+31+31+30+31+30;
		break;
	
	
	}
	
	return DaysPassed;

}	
public int getlastDayMonth(int meses){
int lastDay=0;
meses=this.month;

switch(meses){
	case 1:
	case 3: 
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		lastDay=31;
	break;
	
	case 4:
	case 6:
	case 9:
	case 11:
		lastDay=30;
	break;
	case 2:
		lastDay=28;
	
	
	}
return lastDay;

}
public int getRandomDate(){
		int cont, day, month;
		cont=0; day=1; month=1;
		Date random;
		random =new Date(day,month,this.year);
		do{
			random.month=(int)(Math.random()*12)+1;
			random.day=(int)(Math.random()*(this.getlastDayMonth(month)))+1;
			cont = cont +1;
		}while(this.isSame(random)==false);
		return cont;

/*
Ahora hecho con while
	
while(random.isSame(Date)==false)
random.day=(int) (Math.random() * this.getlastDayMonth(this.month)) +1;
random.month=(int) (Math.random()*12 )+1;
cont=cont + 1;
}


return cont;
*/
}
	
public String getWeekDay(){
int day1, mes1;
String WeekDay;
WeekDay=" ";
day1=1;
mes1=1;
Date dateone= new Date(day1,mes1, this.year);
Date Date = new Date(this.day,this.month,this.year);

	
//day1= lunes

	if(Date.getDaysPassed()%7==0){
		WeekDay=WeekDay + "Lunes";
	}
	if(Date.getDaysPassed()%7==1){
		WeekDay=WeekDay + "Martes";
	}
	if(Date.getDaysPassed()%7==2){
		WeekDay=WeekDay + "Miercoles";
	}
	if(Date.getDaysPassed()%7==3){
		WeekDay=WeekDay + "Jueves";
	}
	if(Date.getDaysPassed()%7==4){
		WeekDay=WeekDay + "Viernes";
	}
	if(Date.getDaysPassed()%7==5){
		WeekDay=WeekDay + "Sabado";
	}
	if(Date.getDaysPassed()%7==6){
		WeekDay=WeekDay + "Domingo";
	}
	

return WeekDay;


}
	}

