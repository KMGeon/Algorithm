package practice.beak;

public class Main {
    public static void main(String[] args) {
        test test = new test();
        test.te();
        test test2 = new foo();
        test2.te();
        foo testss = (foo)new test();
        testss.te();
    }
}

class test{
    void te() {
        System.out.println("true = " + true);
    }
}

class foo extends test{
    @Override
    void te() {
        System.out.println("false = " + false);
    }
}