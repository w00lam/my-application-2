package pack1;

import pack2.B;

public class A {
    //메소드
    public void method() {
        System.out.println("A-method 실행");

        //B 클래스 사용
        B b = new B();
        b.method();
    }
}
