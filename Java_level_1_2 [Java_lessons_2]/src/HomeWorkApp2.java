public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(m1(1, 2));
        System.out.println(m1(11, 18));
        System.out.println(m1(5, 5));
        System.out.println(2);
        m2(5);
        m2(-4);
        m2(0);
        System.out.println(3);
        System.out.println(m3(4));
        System.out.println(m3(-4));
        System.out.println(4);
        m4("Я очень люблю арбузы!!!",5);
        m4("Finish",1);
    }

    public static boolean m1(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static  void m2(int a) {
        if (a >= 0) {
        System.out.println("Положительное");
        } else if (a < 0) {
            System.out.println("Отрицательное");
        }
    }

    public static boolean m3(int a) {
        if (a < 0) {
        return true;
        } else  {
            return false;
        }

    }

    public static void  m4(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
}


