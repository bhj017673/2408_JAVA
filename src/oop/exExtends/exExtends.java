package oop.exExtends;

public class exExtends {
    public static void main(String[] args) {

    }
}

class Mammal {
    protected String name;
    protected String residence;
    protected final int age;

    public Mammal () {
        this.age = 0;
    }

    public void breathe() {
        System.out.println(this.name + "가 폐호흡합니다.");
    }
}

class Whale extends Mammal {
    public Whale (String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    @Override
    public void breathe() {
        System.out.println("나는 나나나");
    }
}
