package oop.pet;

public class Whale {
//    int age; // 같은 패키지에 소속된 클래스에서 접근 가능
//    public String name;
    private int age;
    private String name;


    //-------생성자 : 클래스를 인스턴스화 할때 최초한번 실행되는것
    public Whale() {
        this(10);
    }

    public Whale(int age) {
        this(age, "John");
    }
    public Whale(int age, String name) {
        this.age = age;
        this.name = name;
    }







    //----------메소드------------
    public void swimming() {
        String test = "test"; //지역변수
        System.out.println("Swimming");
    }

    public int mySum (int a) {
        return a+ 1;
    }

    public int mySum(int a , int b) {
        return a+b;
    }

    public long mySum(long a, long b) {
        return a+b;
    }



}
