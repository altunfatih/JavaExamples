public class Main {
    public static void main(String [] args)
    {
        /*
        Teorem (Euclidean): Bir sayı karekökünden küçük olan hiç bir asal sayıya bölünemiyorsa asaldır.
	    (Çok hızlı asal sayı bulan program)
         */
        IsPrimeTest.run();
    }
}

class IsPrimeTest {
    public static void run()
    {
        for (int n = -10; n <= 100; ++n)
            if (NumberUtil.isPrime(n))
                System.out.printf("%d ", n);

        System.out.println();
        System.out.println(NumberUtil.isPrime(1_000_003));
    }
}

class NumberUtil {
    public static boolean isPrime(int val)
    {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        for (int i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}