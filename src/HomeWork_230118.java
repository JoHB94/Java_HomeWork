import java.util.Scanner;

public class HomeWork_230118 {

    //for 문을 이용하여 1부터 100까지의 정수중에서 3의 배수의 총 합을 출력하는 코드를 작성해 보세요.

    public static void Q3() {
        int sum = 0;
        for(int i = 1; i<= 100; i++) {
            if(i%3 == 0) {
                sum+= i;
            }
        }
        System.out.println("1부터 100까지의 정수중 3의 배수의 합은" + sum);
    }
    public static void Q4() {

        while (true) {
            int x = (int)(Math.random()*5 +1);
            int y = (int)(Math.random()*5 +1);
            System.out.println("("+x+","+y+")");
            if(x+y==5) {
                break;
            }
        }

    }
    public static void Q5() {
        for(int x=0; x<=10; x++) {
            for(int y=0; y<=10; y++) {
                if(4*x + 5*y == 60) {
                    System.out.println("x:" + x + "," + "y:" + y);
                }
            }
        }
    }
    public static void Q6() {
        for(int i=1; i<=5; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Q7() {
        Scanner scanner = new Scanner(System.in);
        int balance=0;
        int input;
        //1을 선택시 예금, 2를 선택시 출금, 3을 선택시 잔액, 4를 선택시 종료
        while (true) {
            System.out.println("1.입금 2.출금 3.잔고 4.종료");
           input = scanner.nextInt();

            if(input == 1) {
                System.out.print("예금액>");
                input = scanner.nextInt();
                balance += input;
                System.out.println(input+"을 입금하셨습니다.");
                System.out.println("현재 잔액은" + balance +"원 입니다." );
            }
            else if(input == 2) {
                System.out.println("출금액");
                input = scanner.nextInt();
                balance -= input;
                System.out.println(input+"을 출금했습니다.");
                System.out.println("현재 잔액은" + balance +"원 입니다." );
            }
            else if(input == 3) {
                System.out.println("잔액은" + balance+ "원 입니다.");
            }
            else {
                break;
            }
        }

        System.out.println(scanner.nextLine());
        
    }
}
