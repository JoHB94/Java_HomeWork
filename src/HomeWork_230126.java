import java.io.PrintStream;

public class HomeWork_230126 {

}

    //Q13.현실세계의 회원을 Member클래스로 모델링 하려합니다 회원의 데이터로는 이름,아이디,패스워드,나이가 있습니다
    //이 데이터를 가지는 Member클래스를 선언해보세요

class Member {
        String name;
        String id;
        String password;
        int age;
    //Q14. 13번 문제에서 작성한 Member 클래스에 생성자를 추가하려고 합니다.
    //다음과 같이 name필드와 id필드를 외부에서 받은 값으로 초기화 하도록 생성자를 선언해 보세요.
        Member (String name, String firstName) {}
        Member user1 = new Member("홍길동","hong");
    }

    //Q15.login() 메소드를 호출할 때 매개값:id,password 제공 logout()메소드 호출할 때 매개값:id 제공
    //다음 조건과 코드를 보고 MemberService 클래스에서 login(),logout() 메소드를 선언해보시오
class MemberService {
    String id;
    String password;
    boolean login(String id, String password) {
        if(id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }
    void logout(String id) {
        System.out.println(id+" 님이 로그아웃 되었습니다.");
    }
    //Q16 Println()메소드 오버로딩
    //Q17 정적멤버로 접근
    void printerTest() {
//        Printer printer = new Printer();
//        printer.println(10);
//        printer.println(true);
//        printer.println(5.7);
//        printer.println("홍길동");
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
    }
    //Q18 싱글톤 패턴을 사용해서 ShopService 클래스를 작성하시오
class ShopService {
    private static ShopService singleton  = new ShopService();
    private ShopService() {}
    static ShopService getInstance() {
        return singleton;
    }
    }
    class Q18 {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        void Q18() {
            if(obj1 == obj2) {
                System.out.println("같은 ShopService 입니다.");
            } else {
                System.out.println("다른 ShopService 입니다.");
            }
        }

    }



