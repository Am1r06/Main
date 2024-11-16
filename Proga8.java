import java.util.Scanner;
public class Proga8{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 4 действительных числа");
		while (!scanner.hasNextDouble()){
			System.out.println("Ошибка:введите корректное число");
			scanner.next();
			System.out.print("Попробуйте снова: ");
		}	
 		double a,b,c,d;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
				
		
		if (a<=b && b<=c && c<=d){
			System.out.println(""+d+" "+d+" "+d+" "+d);
		} else if (a>b && b>c && c>d){
			System.out.println(""+a+" "+b+" "+c+" "+d);
		}else{
			System.out.println(""+(a*a)+" "+(b*b)+" "+(c*c)+" "+(d*d));
		} 
	}
}