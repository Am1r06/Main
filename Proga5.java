import java.util.Scanner;
public class Proga5{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите положительное целое число");
		while (!scanner.hasNextInt()){
			System.out.println("Ошибка:введите корректное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

		int num = scanner.nextInt();
		int sum = 0;
		while (num >0){
			sum += num%10;
			num/=10;
		}
		System.out.println(sum); 
	}
}
