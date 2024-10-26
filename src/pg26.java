public class pg26 {
    public static int q1(int n) {
        if (n <= 1) {
            return n;
        }
        return n + q1(n - 1);
    }

    public static int q2(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * q2(n - 1);
    }

    public static int q3(int n) {
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return q3(n - 1);
        }
        return n * q3(n - 2);
    }

    public static int q4(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + q4(n / 10);
    }

    public static int q5(int n, int m) {
        if (n < m) {
            return 0;
        }
        return 1 + q5(n - m, m);
    }

    public static int q6(int n, int m) {
        if (n < m) {
            return n;
        }
        return q6(n - m, m);
    }

    public static boolean q7(int x, int y) {
        if (x < y) {
            return false;
        }
        if (x == y) {
            return true;
        }
        return q7(x - y, y);
    }

    //q8- d has to be 2 at first:
    public static boolean q8(int n, int d) {

        if (n < 2) {
            return false;
        }
        if (n % d == 0) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        return q8(n, d + 1);
    }


    public static boolean q9(int n) {
        if (n < 10) {
            return true;
        }
        int lastDigit = n % 10;
        int nextLastDigit = (n / 10) % 10;
        if ((lastDigit % 2) != (nextLastDigit % 2)) {
            return false;
        }
        return q9(n / 10);
    }
}