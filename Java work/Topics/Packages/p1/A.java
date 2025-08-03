package p1;
public class A {
	protected void myfunA() {
		System.out.println("Hello");
	}
	class B{
		 void myfunB() {
			A ref=new A();
			ref.myfunA();		
		}
	}
	class C extends A{
		 void myfunC() {
			C ref=new C();
			ref.myfunC();
			
		}
	}
	

}