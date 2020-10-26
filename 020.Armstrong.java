public class Main {

    public static void main(String[] args) {
        //Armstrong
    }
}

class Test {

    public static void armstrongRun()
    {
        for (int n = 0; n <= 9999999; n++) {
            if (csd.NumberUtil.isArmstrong(n))
                System.out.println(n);
        }
    }
}

class NumberUtil {
    public static boolean isArmstrong(int val)
    {
        return getPowSum(val) == val;
    }

    public static int getPowSum(int val)
    {
        int n = getDigitCount(val);
        int sum = 0;

        while (val != 0) {
            sum += pow(val % 10, n);
            val /= 10;
        }

        return sum;
    }

    public static int getDigitCount(int val)
    {
        int count = 0;

        while (val != 0) {
            count++;
            val /= 10;
        }
        return count;
    }

    public static int pow(int a, int b)
    {
        int val = 1;

        for (int i = 0; i < b; i++)
            val = val * a;

        return val;
    }
}