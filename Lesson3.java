public class Lesson3 
{ 
	static int aClassVariable = 0;
	static Object[] someList = new Object[] {"Hello, world!", 42, null, false, 'a'};

	public static void main(String[] args)
	{ 
		int aMethodVariable = 10;

		if (aClassVariable == 0 && aMethodVariable == 10)
		{ 
			for (Object o : someList)
			{ 
				exampleMethod(o);
			} 
		} 
	} 
	
	private void exampleMethod(Object o)
	{ 

	} 
	
	private static class NestedClass
	{ 

	} 
} 
