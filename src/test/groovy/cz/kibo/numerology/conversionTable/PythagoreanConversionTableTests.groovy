package cz.kibo.numerology.conversionTable;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

import org.junit.After;
import org.junit.Before;

import org.junit.Test

class PythagoreanConversionTableTests extends GroovyTestCase{
		
	ConversionTable ct
	
	@Before
	public void setUp() throws Exception {
		ct = new PythagoreanConversionTable()
	}

	@After
	public void tearDown() throws Exception {
		ct = null
	}
	
	void testLargeAlphabet(){
		assert 1 == ct.getNumberOfLetter("A");
		assert 1 == ct.getNumberOfLetter("J");
		assert 1 == ct.getNumberOfLetter("S");
		
		assert 8 == ct.getNumberOfLetter("H");
		assert 8 == ct.getNumberOfLetter("Q");
		assert 8 == ct.getNumberOfLetter("Z");
		
		assert 9 == ct.getNumberOfLetter("I");
		assert 9 == ct.getNumberOfLetter("R");
	}
	
	void testSmallAlphabet(){
		assert 2 == ct.getNumberOfLetter("b");
		assert 2 == ct.getNumberOfLetter("k");
		assert 2 == ct.getNumberOfLetter("t");
		
		assert 7 == ct.getNumberOfLetter("g");
		assert 7 == ct.getNumberOfLetter("p");
		assert 7 == ct.getNumberOfLetter("y");	
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
