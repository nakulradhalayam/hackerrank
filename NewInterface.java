@FunctionalInterface
public interface NewInterface {

	public int add();
	default public int add(int a) {
		return 0;
	}
	public default int addd(int a)
	{
		return a;
		
	}
	
}
