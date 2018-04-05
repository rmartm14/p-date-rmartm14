package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(20, 2, 2018);
		tomorrow = new Date(21, 3, 2018);
		
		
		if(today.isDayOfTheMonthOk()==true){
			System.out.println("El dia del mes es correcto");
		
		System.out.println("La fecha es: " + today.getDate() + "\n");
		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow) + "\n");
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow)+ "\n");
		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow)+ "\n");
		System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow)+ "\n");
		System.out.println("El nombre del mes es: " + today.getMonthName()+ "\n");
		System.out.println("La estacion en la que estas es " + today.getSeasonName()+ "\n");
		System.out.println("Los meses que quedan hasta final de año son:" + today.getMonthsRemaining() + "\n");		
		System.out.println("Los dias que quedan hasta final de mes son:" + today.getDatesRemaining() + "\n");		
		System.out.println("Los meses que tienen los mismos dias son :" + today.getMonthSameDays() + "\n");	
		System.out.println("Han pasado " + today.getDaysPassed() + " dias desde el comienzo de año" + "\n");	
		System.out.println("Han sido " + today.getRandomDate() + " intentos");
		
		
		}
		else{
			System.out.println("El dia del mes no es correcto");
		}


	}

}
