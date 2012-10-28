package cz.kibo.numerology

import groovy.util.GroovyTestSuite
import junit.framework.Test
import junit.framework.TestSuite
import junit.textui.TestRunner
import org.codehaus.groovy.runtime.ScriptTestAdapter

public class AllTestsSuite extends TestSuite{
	
	private static final String TEST_ROOT = "src/test/groovy/cz/kibo/numerology/";
	
	public static TestSuite suite() throws Exception {
		TestSuite suite = new TestSuite();
		GroovyTestSuite gsuite = new GroovyTestSuite();		
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "PersonTests.groovy"));
		suite.addTestSuite(gsuite.compile(TEST_ROOT + "UtilsTests.groovy"));		
		return suite;
	}
}
