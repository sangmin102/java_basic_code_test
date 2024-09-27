import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사용자에게 값을 입력받는 부분을 명확히 수정
        System.out.print("변수 A의 값을 입력하세요: ");
        int a = stdIn.nextInt();  // 변수 A 입력

        System.out.print("변수 B의 값을 입력하세요: ");
        int b = stdIn.nextInt();  // 변수 B 입력

        // 약수 판별 조건
        if (a % b != 0)
            System.out.println("B는 A의 약수가 아닙니다.");
        else
            System.out.println("B는 A의 약수입니다.");
    }
}