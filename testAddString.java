package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junitstring = new JUnitFunctions();
		String result = junitstring.addStrings("capston", "project");
		assertEquals("capstonproject", result);
	}

}
