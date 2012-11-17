package cz.kibo.numerology;

import static org.junit.Assert.*;
import cz.kibo.numerology.conversionTable.ConversionTable
import cz.kibo.numerology.conversionTable.PythagoreanConversionTable
import groovy.util.GroovyTestCase;

class UtilsTests extends GroovyTestCase{
		
	void testNumericalSum(){	
										
		assert 1 == Utils.numericalSum( [1, 2, 3, 4] );				
		assert 3 == Utils.numericalSum( [6, 6] );	
		assert 9 == Utils.numericalSum( [3, 3, 3] );	
				
		assert 11 == Utils.numericalSum( [5, 6] );	
		assert 22 == Utils.numericalSum( [11, 11] );	
		assert 6 == Utils.numericalSum( [30, 3] );	
	}	
	
	void testVowels(){
		assert ["o","a"] == Utils.vowels( "tomas" )
		assert ["a", "e", "i", "o", "u", "y"] == Utils.vowels( "areriroruryr" )
	}	
	
	void testText2Ascii(){
		assert "Prilis zlutoucky kun upel dabelske ody" == Utils.text2Ascii( "Příliš žluťoučký kůň úpěl ďábelské ódy" )
	}
	
	void testText2Numbers(){		
		assert [2, 6, 4, 1, 1, 1, 3, 9, 4, 1, 5] == Utils.text2Numbers("tomas jurman", new PythagoreanConversionTable() )		
	}
}


