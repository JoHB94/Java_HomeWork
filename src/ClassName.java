public class ClassName {
    //인스턴스 필드와 메소드 선언
    int fileld1;
    void method1() {}
    //정적 필드와 메소드 선언
    static int field2;
    static void method2(){}
    //정적 블록선언

    //정적 메소드선언
    static void Method3() {
       //객체생성
        ClassName obj = new ClassName();
        //인스턴스 멤버 사용
        obj.fileld1 = 10;
        obj.method1();
    }
}
