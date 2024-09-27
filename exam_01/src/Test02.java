import java.util.Scanner;  // import 구문은 클래스 선언 위에 있어야 함

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);  // 스캐너 객체 생성

        System.out.print("정숫값: ");  // 입력을 받기 전에 적절한 안내
        int n = stdIn.nextInt();  // 사용자로부터 정수 입력

        if (n >= 0)
            System.out.println("절댓값은 " + n + "입니다.");
        else
            System.out.println("절댓값은 " + -n + "입니다.");
    }
}