package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));
		System.out.println("El nombre del mes es: " + today.getMonthName());
		
		if(today.isDayOfTheMonthOk()==true){
			System.out.println("El dia del mes es correcto");
		}
		else{
			System.out.println("El dia del mes no es correcto");
		}

	}

}
