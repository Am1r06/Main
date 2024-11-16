import java.util.Scanner;
public class Progaaa{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два действительных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка:введите корректное действительное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

		
		double numb1 = scanner.nextDouble();
		double numb2 = scanner.nextDouble();
		
		if (numb1<=numb2){
			numb1=0;
			System.out.println(numb1 + " " + numb2);
		} else{
			System.out.println(numb1 + " " + numb2);
		} 
	}
}
/*номер 3