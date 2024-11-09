import java.util.Scanner;
public class Programm {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 2 вещественных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка:введите корректное вещественное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		if (number1>number2){
			System.out.println("первое число максимальное");
		}
		else{
			System.out.println("второе число максимальное");
		}
		
	}
}


