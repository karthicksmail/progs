abstract class BaseClass {
	abstract public void fun1();
}

class DerivedClass extends BaseClass{
	public void fun1() {
		System.out.print("Hello");
	}

	public void fun2() {
		System.out.println(" World" );
	}
}

class DerivedClassImpl {
	public static void main(String[] args) {
		BaseClass b1 = new DerivedClass();
		b1.fun1();
		DerivedClass d1 = new DerivedClass();
		d1.fun2();
	}
}
