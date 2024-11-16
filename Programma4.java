import java.util.Scanner;
public class Programma4{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите три действительных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка:введите корректное действительное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}

		double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
 
        if (a>=0) {
            double d = a * a;
            System.out.println(d);
        }
		if (b>=0) {
            double y = b * b;
            System.out.println(y);
        }
 
        if (c>=0) {
            double z = c * c;
            System.out.println(z);
        } 
    }
}