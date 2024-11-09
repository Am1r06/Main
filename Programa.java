import java.util.Scanner;
public class Programa {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число от 0 до 100");
		while (!scanner.hasNextInt()){
			System.out.println("Ошибка:введите корректное целое число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}


		int score = scanner.nextInt();
		if (score >= 0 && score <= 59){
			System.out.println("Неудовлетворительно");
			}else if(score >= 60 && score <= 74){
				System.out.println("Удовлетворительно");
		    }else if (score >= 75 && score <= 89){
			    System.out.println("Хорошо");
			}else{
				System.out.println("Отлично");
			} 


		
	}
}