import java.util.Scanner;
public class Proga6{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите три действительных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка:введите корректное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

        double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
		
		if (a>1 && a<3) {
            System.out.println(a);
        }
		if (b>1 && b<3) {
            System.out.println(b);
        }
 
        if (c>1 && c <3) {
            System.out.println(c);
        } 
    }
}