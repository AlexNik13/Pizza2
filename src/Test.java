class test2{
    public int x = 5;
    menuTest menu = new menuTest();
    void test(){
        menu.menu(this);
    }
}

class menuTest{

    void menu (test2 test2){
        test2.x = 6;
        test2.x++;
    }
}

public class Test {

    public static void main(String[] args) {
        test2 newTest2 = new test2();
        System.out.println(newTest2.x);
        newTest2.test();
        System.out.println(newTest2.x);

    }
}
