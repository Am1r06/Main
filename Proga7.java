import java.util.Scanner;
public class Proga7{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		while (!scanner.hasNextInt()){
			System.out.println("Ошибка:введите корректное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

        int k = scanner.nextInt();
		
		for (int i = 2; i<=9; i++){
			int ans = i*k;
			System.out.println(i+"*"+k+"="+ans);	
		} 
	}
}