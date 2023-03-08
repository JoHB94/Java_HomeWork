package AddressBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------전화번호부 입니다.---------");
        System.out.println("이름 조회를 원하시면 1번을");
        System.out.println("전화번호 조회를 원하시면 2번을");
        System.out.println("등록을 원하시면 3번을 눌러주세요.");
        System.out.println("종료 하시려면 4번을 눌러주세요.");
        int x = scanner.nextInt();
        while (true) {
            switch (x) {
                case 1:
                    System.out.println("이름을 입력 해 주십시오.");
                    String inputData1 = scanner.nextLine();
                    String result1 = addressBook.searchByName(inputData1);
                    System.out.println("이름 :" + inputData1);
                    System.out.println("전화번호 :" + result1);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("번호를 입력 해 주십시오.");
                    String inputData2 = scanner.nextLine();
                    String result2 = addressBook.searchByPhone(inputData2);
                    System.out.println("이름 :" + result2);
                    System.out.println("전화번호 :" + inputData2);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("전화번호부 등록입니다.");
                    System.out.println("이름: " + scanner.nextLine());
                    String inputName = scanner.nextLine();
                    addressBook.addName(inputName);

                    System.out.println("전화번호: ");
                    String inputPhone = scanner.nextLine();
                    addressBook.addPhone(inputPhone);
                    break;
            }
            if (x == 4) {
                break;
            }
            System.out.println();
            System.out.println("이름 조회를 원하시면 1번을");
            System.out.println("전화번호 조회를 원하시면 2번을");
            System.out.println("등록을 원하시면 3번을 눌러주세요.");
            System.out.println("종료 하시려면 4번을 눌러주세요.");
            x = scanner.nextInt();
            scanner.nextLine();

        }


    }
}
