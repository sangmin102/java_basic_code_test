public class test01 {
    public static void main(String[] args) {
        import java.util.scanner;

        class Absolute1 {
            public static void main(String[] args) {
                scanner stdIn = new Scanner(System.in);

                System.out.print("정수값:");
                int n = stdIn.nextInt();

                if (n >=0)
                    System.out.prinIn("절댓값은 "+ n + "입니다.");
                else
                    System.out.prinIn("절댓값은 "+ -n + "입니다.");
            }
        }
    }
}
