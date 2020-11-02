public class App {

    public static void main(String[] args)
    {
		 /*
		  Parametresi ile aldığı int türden bir sayının 10'luk Harshad sayısı olup olmadığını test eden
		  isHarshad isimli NumberUtil metodu yazınız ve test ediniz.
		  Açıklamalar:
		  - Eğlence Matematiğnde Harshad sayı (Niven sayı) basamakları toplamına tam bölünebilen tam sayılara denir.
		  */
        IsHarshadTest.run();
    }
}

class IsHarshadTest {
    public static void run()
    {
        for (int i = 1; i < 100; i++)
            System.out.println(i + "-" + NumberUtil.isHarshad(i));
    }
}

class NumberUtil {
    public static int getDigitsSum(int val)
    {
        if (val == 0)
            return 0;

        int sum = 0;

        while(val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return Math.abs(sum);
    }

    public static boolean isHarshad(int val)
    {
        if (val <= 0)
            return false;

        return val % getDigitsSum(val) == 0;
    }
}