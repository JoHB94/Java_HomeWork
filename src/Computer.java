public class Computer {

    //가변길이 매개변수를 갖는 메소드 선언
    int sum(int ...values) {
        int sum = 0;
        //values는 배열타입의 변수처럼 사용
        for(int i =0; i< values.length; i++) {
            sum += values[i];
        }
        //합산한 결과를 리턴
        return sum;
    }
}
