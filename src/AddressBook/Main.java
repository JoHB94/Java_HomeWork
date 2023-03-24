package AddressBook;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        AddressBook addressBook = new AddressBook();

        //파일에서 이름과 전화번호 정보 읽어오기
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\whgus\\phoneBook\\name.txt"))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                addressBook.addName(line);
            }
        }catch (FileNotFoundException e) {
            //파일이 없는 경우
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\whgus\\phoneBook\\number.txt"))) {
            String line;
            while ((line = reader.readLine()) !=null) {
                addressBook.addPhone(line);
            }
        }catch (FileNotFoundException e) {
            //파일이 없는 경우
        }

        //스캐너 입력받기
        Scanner startScanner = new Scanner(System.in);
        System.out.println("---------전화번호부 입니다.---------");
        System.out.println("이름 조회를 원하시면 1번을");
        System.out.println("전화번호 조회를 원하시면 2번을");
        System.out.println("등록을 원하시면 3번을 눌러주세요.");
        System.out.println("종료 하시려면 4번을 눌러주세요.");
        int x = startScanner.nextInt();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            switch (x) {
                case 1:
                {
                    System.out.println("이름을 입력 해 주십시오.");
                    String inputData1 = scanner.nextLine();
                    String result1 = addressBook.searchByName(inputData1);
                    System.out.println("이름 :" + inputData1);
                    System.out.println("전화번호 :" + result1);
                    System.out.println();}
                    break;
                case 2:
                {
                    System.out.println("번호를 입력 해 주십시오.");
                    String inputData2 = scanner.nextLine();
                    String result2 = addressBook.searchByPhone(inputData2);
                    System.out.println("이름 :" + result2);
                    System.out.println("전화번호 :" + inputData2);
                    System.out.println();}
                    break;

                case 3: {

                    System.out.println("전화번호부 등록입니다.");
                    System.out.println("이름: " + scanner.nextLine());
                    String inputName = scanner.nextLine();
                    addressBook.addName(inputName);

                    System.out.println("전화번호: ");
                    String inputPhone = scanner.nextLine();
                    addressBook.addPhone(inputPhone);

                    //파일에 저장하기
                    try (BufferedWriter nameWriter = new BufferedWriter(new FileWriter("C:\\Users\\whgus\\phoneBook\\name.txt", true))) {
                        nameWriter.write(inputName);
                        nameWriter.newLine();
                    }

                    try (BufferedWriter numberWriter = new BufferedWriter(new FileWriter("C:\\Users\\whgus\\phoneBook\\number.txt", true))) {
                        numberWriter.write(inputPhone);
                        numberWriter.newLine();
                    }
                }
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
            x = startScanner.nextInt();


        }


    }
}
