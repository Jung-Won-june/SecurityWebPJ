package whereismodule;

public class mod extends A{
	
	public static void main(String[] ar) {
		System.out.println("Main!");
	}
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize!");
    }
}

class A {
	static {
		System.out.println("Static!");
	}
}