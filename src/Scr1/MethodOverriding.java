package Scr1;

public class MethodOverriding {
    public void m1()
    {
        System.out.println("Ii is a parent class");
    }
}
class B extends MethodOverriding
{
    @Override
    public void m1() {
        {
            System.out.println("Child class");
        }
        void m2(){
            System.out.println("sub class");
        }
     class Main
        {
            void main(String[]args){
                B r=new B();
                r.m1();r.m1();
            }
        }
    }
}




