package oop.Polymorphism;

public class ExPolymorphism {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        whale1.birth();
        whale1.swimming();
        Mammal whale2 = new Whale();
        whale2.birth();

        Whale mammal = (Whale) whale2;

        Mammal[] mammals = {new Whale(), new Mammal(), new Squirrel()};

        Whale testWhale = (Whale) mammals[0];
        testWhale.swimming();
    }

}

class Mammal {
    public void birth() {
        System.out.println("출산한다.");
    }
}

class Whale extends Mammal {
    public void swimming() {
        System.out.println("수영한다");
    }
}

class Squirrel extends Mammal {
    public void flying () {
        System.out.println("다람쥐 날다.");
    }
}