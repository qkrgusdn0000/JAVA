import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        System.out.printf("정수를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1 = num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum1);
        System.out.printf("정수를 입력하세요:");
        num = sc.nextInt();
        sum1 += num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum1);
        System.out.printf("정수를 입력하세요:");
        num = sc.nextInt();
        sum1 += num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum1);
        System.out.printf("정수를 입력하세요:");
        num = sc.nextInt();
        sum1 += num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum1);
        System.out.printf("정수를 입력하세요:");
        num = sc.nextInt();
        sum1 += num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum1);
    }
}
