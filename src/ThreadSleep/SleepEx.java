package ThreadSleep;

import java.awt.Toolkit;
public class SleepEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<10; i ++) {
            toolkit.beep();
            try {
                Thread.sleep(3000); //3초 간 일시정지
            } catch (InterruptedException e) {

            }
        }
    }
}
