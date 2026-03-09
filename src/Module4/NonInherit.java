package Module4;

public class NonInherit {    void show() {
    System.out.println("Final class method");
}
}

class FinalClassDemo {
    public static void main(String args[]) {
        NonInherit obj = new NonInherit();
        obj.show();
    }
}
