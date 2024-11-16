import java.util.Scanner;
public class Proga{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два вещественных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка,введите корректное целое число");
			scanner.next();
			System.out.println("Попробуйте снова");
		}

        double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		if(num1==num2){
			System.out.println("числа равны");
		}
		else{
			System.out.println("числа не равны");
		}
	}
}

