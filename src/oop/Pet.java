package oop;

import oop.pet.Whale;

public class Pet {
    public static void main(String[] args) {
        Whale whale = new Whale();
        Whale whale2 = new Whale(20);
        Whale whale3 = new Whale(30, "meerkat");

        sum = whale.mySum(1,2);
    System.out.printIn(sum);
    }
}
// 파라미터 - 메소드를 정의할때 외부로 전달받는 값을 지정하는 변수
// 아규먼트 - 메소드를 호출할때 전달하는 값