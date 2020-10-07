class Animal {
    public void sleep(){
        System.out.println("Animal.sleep");
    }
}

class Mouse extends Animal{
    public void sleep(){
        super.sleep();
        System.out.println("Mouse.sleep");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Animal a = new Mouse();
        a.sleep();
    }
}
