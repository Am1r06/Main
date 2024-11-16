import java.util.Scanner;
public class Programma{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два целых числа");
		while (!scanner.hasNextInt()){
			System.out.println("Ошибка,введите корректное целое число");
			scanner.next();
			System.out.println("Попробуйте снова");
		}

		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int sum = number1+number2;
		System.out.print(sum);

	}
}

























