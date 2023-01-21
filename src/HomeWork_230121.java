import java.util.Scanner;

public class HomeWork_230121 {
    public static void Q6(){
        int[][] array = {
                {95,86},
                {93,92,96},
                {78,83,93,87,88}
        };
        //1차원배열 인덱스의 수
        System.out.println(array.length);
        //3번째 인덱스의 길이
        System.out.println(array[2].length);
    }

    public static void Q7(){
    //최댓값을 출력하는 코드를 작성하시오
    int[] array = {1,5,3,8,2};
        int j = 0;
    for (int i =0; i<array.length; i++) {
        if(array[i] > j) {
            j = array[i];
        }
        }
        System.out.println(j);
    }
    public static void Q8() {
        //전체 합과 평균을 구하시오
        int num =0;
        int sum =0;
        int[][] array = {
                {95,86},
                {93,92,96},
                {78,83,93,87,88}
        };
        for(int i =0; i<array.length;i++) {
            num += array[i].length;
            for(int j=0; j<array[i].length;j++) {
                sum += array[i][j];
            }
        }
        Double avg = (double) sum / num;
        System.out.println("전체합: "+sum);
        System.out.println("평균: "+avg);
    }
    public static void Q9() {
        //while문과 Scanner의 nextLine()메소드를 이용해 최고점수, 평균점수 출력
        Scanner scanner = new Scanner(System.in);
        int students=0;
        int highestScore =0;
        int sum =0;
        int avg =0;
        int[] scores = new int[3];
        int input;
        //1을 선택시 학생수를 출력
        while (true) {
            input = scanner.nextInt();
            System.out.println("1.학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료");
            if(input == 1) {
                students = scores.length;
                System.out.println("선택>" + input);
                System.out.println("학생수>" +students);
            }
            //2를 선택시 압력받을 인덱스와 스캐너출력
             else if (input ==2) {
                System.out.println("선택>" + input);

                 for (int i =0; i<scores.length; i++) {
                     int input2 = scanner.nextInt();
                     System.out.println("scores[" + i + "]: " + input2);
                     scores[i] = input2;
                 }

            }
             //3을 선택시 점수배열 리스트 출력
             else if (input ==3) {
                for(int i= 0; i<scores.length; i++) {
                    System.out.println("scores[" + 1 + "]: " + scores[i]);
                }
            }
             else if (input ==4){
                System.out.println("선택: " + input);
                for (int i =0; i<scores.length; i++) {
                    if(scores[i] > highestScore) {
                        highestScore = scores[i];
                    }
                    sum += scores[i];
                    avg = sum / scores.length;
                }
                System.out.println("최고점수: " + sum);
                System.out.println("평균점수: " + avg);
            }
             else {
                System.out.println("선택>" + input);
                System.out.println("프로그램 종료");
                 break;
            }
        }
    }
}
