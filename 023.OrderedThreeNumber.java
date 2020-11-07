import java.util.Scanner;

public class App {
	
	public static void main(String[] args)
	{
		/*
			- Klavyeden alınan Int türden üç sayı arasındaki büyüklük küçüklük ilişkisini küçükten büyüğe doğru < ve =
			sembolleriyle gösteriniz:
			Açıklama : Program üç tane Int türden sayı isteyecek, aralarındaki ilişkiyi ekranda gösterecektir.
			örnek :
			Giriş : 10 20 30
			Yanıt : 10 < 20 < 30s
			Giriş : 30 10 20
			Yanıt : 10 < 20 < 30
			Giriş : 10 10 15
			Yanıt : 10 = 10 < 15
			Giriş : 40 50 50
			Yanıt : 40 < 50 = 50
			- Parametresi ile aldığı Int türden 3 sayıdan ortancasına geri dönen mid isimli fonksiyonu yazınız ve test ediniz.
		 */
		DisplayOrderedThreeNumberApp.run();
	}
}

class DisplayOrderedThreeNumberApp {
	public static int max(int a, int b, int c)
	{
		return Math.max(a, Math.max(b, c));
	}
	
	public static int mid(int a, int b, int c)
	{
		if (a <= b && b <= c || c <= b && b <= a)
			return b;
		
		if (b <= a && a <= c || c <= a && a <= b)
			return a;
		
		return c;
	}
	
	public static int min(int a, int b, int c)
	{
		return Math.min(a, Math.min(b, c));
	}
	
	public static void display(int a, int b, int c)
	{
		int min = min(a, b, c);
		int mid = mid(a, b, c);
		int max = max(a, b, c);
		
		if (min < mid)
			System.out.printf("%d < %d", min, mid);
		else
			System.out.printf("%d = %d", min, mid);
		
		if (mid < max)
			System.out.printf(" < %d%n", max);
		else
			System.out.printf(" = %d%n", max);
	}
	
	public static void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		int a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("İkinci sayıyı giriniz: ");
		int b = Integer.parseInt(scanner.nextLine());

		System.out.print("Üçüncü sayıyı giriniz: ");
		int c = Integer.parseInt(scanner.nextLine());
		
		display(a, b, c);
	}
}