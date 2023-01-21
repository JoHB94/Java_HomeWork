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
    public static void splitEx() {
        String board = " 1, 자바학습, 참조타입 String을 학습합니다, 홍길동";

        String [] tokens = board.split(",");

        //인덱스 별로 읽기
        System.out.println("번호" + tokens[0]);
        System.out.println("제목" + tokens[1]);
        System.out.println("내용" + tokens[2]);
        System.out.println("성명" + tokens[3]);
        System.out.println();

        //for문을 이용한 읽기
        for(int i =0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
    public static void arrTest() {
        int[] scores;
        scores = new int[]{83,90,71};
        int sum1 = 0;
        for(int i =0; i<3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);
        printItem(new int[] {83,90,71});
    }

    public static void printItem(int[] scores) {
        for(int i =0; i<3; i++) {
            System.out.println("score [" + i + "]: " + scores[i]);
        }
    }
     public static void multipleArr() {
        int[][] scores = {
                {80,90,96},
                {76,88}
        };
         System.out.println("배열의 길이(학급 수): " +scores.length);
         System.out.println("2차원 배열의 길이(첫 반의 학생 수): " + scores[0].length);
         System.out.println("2차원 배열의 길이(둘째 반의 학생 수): " + scores[1].length);

         //첫번째 반의 세번 째 학생의 점수 읽기
         System.out.println("1반 3번 학생의 점수는: " + scores[0][2]);
         System.out.println("2반 1번 학생의 점수는: " + scores[1][0]);

         //1반의 평균점수 구하기
         int Class1Sum = 0;
         for(int i =0; i < scores[0].length;i++) {
             Class1Sum += scores[0][i];
         }
         double Class1Avg = (double) Class1Sum / scores[0].length;
         System.out.println("1반의 평균점수: " + Class1Avg);
         System.out.println(scores[0].length);


         //전체 학생의 평균 구하기
         int totalStudent = 0;
         int totalSum = 0;
         //scores.length = 학급의 수
         //scores[0] = 1반의 성적 배열
         //score[i].length = 각 학급의 학생 수
         // 총 학생의 수: 학급의 수 만큼 학생의 수를 누적 합.
         //학생들의 점수 총합: 총 학생의 수 만큼 점수를 누적 합.
         for(int i = 0; i <scores.length;i++) {
             totalStudent += scores[i].length;
             for(int j = 0; j< scores[i].length; j++) {
                totalSum += scores[i][j];
             }
             double totalAvg = (double) totalSum / totalStudent;
             System.out.println("전체 학생의 평균은: " + totalAvg);
         }
    }
    public static void classScores() {

        //두9 반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3];
        //배열 항목 초기값 출력
        //mathScores.length : 1차원 배열의 수 (각 반의 수)
        //mathScores[i].length : 2차원 배열의 수 (각반의 학생 수)
        //mathScores[i][j] : i 반 j번 학생의 점수
        for (int i = 0; i < mathScores.length; i ++) {
            for(int j =0; j< mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + j + "]:" + mathScores[i][j]);
            }
        }
        System.out.println();
        //배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        //전체 학생의 수학평균 구하기
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i =0; i< mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for(int j =0; j< mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 수학 평균: " + totalMathAvg);
        //각 반의 학생 수 가 다를 경우 점수 저장을 위한 2차원 배얼 생성 1반은 2명 2반은 3명
        int[][] englishScores = new int [2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        //배열 항목 초기값
        for(int i =0; i <englishScores.length; i++) {
            for(int j =0; j <englishScores.length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "]" + englishScores[i][j] );
            }
        }
        System.out.println();
        //배열 항복 값 변경
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;
        //전체 학생의 영어 평균점수 구하기
        totalStudent = 0;
        int totalEnglishSum = 0;
        for(int i =0; i < englishScores.length; i ++) {
            totalStudent += englishScores[i].length;
            for(int j = 0; j< englishScores[i].length; j++) {
                totalEnglishSum += englishScores[i][j];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 영어 평균점수:" + totalEnglishAvg);
    }
    public static void arrayCopy1() {
        int[] oldArray = {1,2,3};

        int[] newArray = new int[5];
        for(int i=0; i<oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        for(int i=0; i<newArray.length; i++) {
            System.out.println(newArray[i] + ",");
        }
    }
    public static void arrayCopy2() {
        String[] oldStrArray = {"java","array","copy"};
        String[] newStrArray = new String[5];
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
        for(int i =0; i<newStrArray.length; i++) {
            System.out.println(newStrArray[i]+",");
        }
    }
    public static void advancedFor() {
        int[] scores = {95,71,84,93,87};
        int sum = 0;
        for(int sore : scores ) {
            sum = sum + sore;
        }
        System.out.println("점수 총합:" + sum);
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 :" + avg);
    }
    public static void changeFor() {
        //일반 for문
        int[] prices = {1000,1500,2000,3000};
        int sum = 0;
        for(int i =0; i < prices.length; i++) {
            sum += prices[i];
        }
        System.out.println("일반 for문: " + sum);
        //향상된 for문

        int sum2 =0;
        for(int price : prices) {
            sum2 = sum2+ price;
        }
        System.out.println("향상된 for문:" + sum2);
    }
}
