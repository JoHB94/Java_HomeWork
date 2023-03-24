package Sort;

import java.util.Arrays;

public class StringSort {

    public static void sorting(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].compareTo(data[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            //-> i번째 인덱스와 최솟값 인덱스의 자리 교체.
            String temp = data[i];
            data[i] = data[minIdx];
            data[minIdx] = temp;

        }
    }

    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "zebra", "lion", "tiger", "wolf", "donkey"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(i + 1 + "번째 동물은" + animals[i] + "입니다.");
        }
        System.out.println("-------------sorting---------------");
// --------------------sorting--------------------------------------------
        sorting(animals);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(i + 1 + "번째 동물은" + animals[i] + "입니다.");
        }
    }

}

