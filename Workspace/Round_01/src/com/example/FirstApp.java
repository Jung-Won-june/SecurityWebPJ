
public class FirstApp {
	static {
		System.out.println("Static!");
	}
	public static void main(String[] ar) {
		System.out.println("Main!");
	}
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize!");
    }
}
