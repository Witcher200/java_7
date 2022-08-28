public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(m1(1, 2));
        System.out.println(m1(11, 18));
        System.out.println(m1(5, 5));
        System.out.println(m2(5));
        System.out.println(m3(4));
        System.out.println(m4(5));
    }

    public static boolean m1(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean m2(int a) {
        if (a > 0) {
            return true;
        } else if (a < 0) {
        }
        return false;
    }

    public static boolean m3(int a) {
        if (a < 0) {
            return true;
        } else if (a > 0) {
        }
        return false;
    }

    public static boolean m4(int a) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Я очень люблю арбузы!!!");
        }
        return false;
    }
}


