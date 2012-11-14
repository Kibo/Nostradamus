package cz.kibo.numerology.conversionTable

import groovy.util.GroovyTestCase;

import org.junit.After;
import org.junit.Before;

class ChaldeanConversionTableTests extends GroovyTestCase{
		
	ConversionTable ct
	
	@Before
	public void setUp() throws Exception {
		ct = new ChaldeanConversionTable()
	}

	@After
	public void tearDown() throws Exception {
		ct = null
	}
	
	void testLargeAlphabet(){
		assert 1 == ct.getNumberOfLetter("A");
		assert 1 == ct.getNumberOfLetter("I");
		assert 1 == ct.getNumberOfLetter("J");
		assert 1 == ct.getNumberOfLetter("Q");
		assert 1 == ct.getNumberOfLetter("Y");
		
		assert 3 == ct.getNumberOfLetter("C");
		assert 3 == ct.getNumberOfLetter("G");
		assert 3 == ct.getNumberOfLetter("L");
		assert 3 == ct.getNumberOfLetter("S");
		
		assert 5 == ct.getNumberOfLetter("E");
		assert 5 == ct.getNumberOfLetter("H");
		assert 5 == ct.getNumberOfLetter("N");
		assert 5 == ct.getNumberOfLetter("X");
	}
	
	void testSmallAlphabet(){
		assert 8 == ct.getNumberOfLetter("f");
		assert 8 == ct.getNumberOfLetter("p");	
	}
		
	void testNonsense(){
		
		shouldFail(IllegalArgumentException) {
			ct.getNumberOfLetter("");
		}
					
		shouldFail(IllegalArgumentException) {
			ct.getNumberOfLetter("ab");
		}
		
		shouldFail(IllegalArgumentException) {
			ct.getNumberOfLetter("1");
		}			
	}
}
