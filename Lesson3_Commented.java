public class Lesson3 // <- Class scope identifier
{ // Class scope start "{"
	
	// "Things" are written in the class scope, like variables...	
	static int aClassVariable = 0;
	static Object[] someList = new Object[] {"Hello, world!", 42, null, false, 'a'};

	// methods...
	public static void main(String[] args)
	{ // "main" method scope start
	
		// In method scopes, all scopes are treated as "instruction" scopes for
		// conditions and loops and such

		if (aClassVariable == 0)
		{ // Condition scope start

			for (Object o : someList)
			{ // Loop scope start
				exampleMethod(o);
			} // Loop scope end

		} // Condition scope end

	} // "main" Method scope end


	// more methods...
	private void exampleMethod(Object o)
	{ // "exampleMethod" method scope start

	} // "exampleMethod" method scope end


	// and even classes nested inside the given class
	private static class NestedClass
	{ // "NestedClass" class scope start

	} // "NestedClass" class scope end
} // Class scope end "}"

// All in all, this class's structure is 
// class start
// - "main" method start
// - - if statement start
// - - - for loop start
// - - - for loop end
// - - if statement end
// - "main" method end
// - "exampleMethod" method start
// - "exampleMethod" method end
// - "NestedClass" class start
// - "NestedClass" class end
// class end
