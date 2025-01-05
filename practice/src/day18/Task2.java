package day18;

public class Task2 {

    public static void main(String[] args) {
        long num = 717771237;
        System.out.println(count7(num));
    }

    public static int count7(long x) {
        if (x == 0)
            return 0;
        int p = 0;
        if (x % 10 == 7)
            p += 1;
        return count7(x / 10) + p;
    }

}
