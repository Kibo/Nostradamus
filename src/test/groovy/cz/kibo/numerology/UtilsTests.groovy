package cz.kibo.numerology;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

class UtilsTests extends GroovyTestCase{
		
	void testGetNumberOfLetter(){
		
		assert 1 == Utils.getNumberOfLetter( 'a' );
		assert 1 == Utils.getNumberOfLetter( 'j' );
		assert 1 == Utils.getNumberOfLetter( 's' );		
						
		assert 8 == Utils.getNumberOfLetter( 'h' );
		assert 8 == Utils.getNumberOfLetter( 'q' );
		assert 8 == Utils.getNumberOfLetter( 'z' );
		
		assert 9 == Utils.getNumberOfLetter( 'i' );
		assert 9 == Utils.getNumberOfLetter( 'r' );		
	}
	
	void testGetNumberOfWords(){
		def firstname = "Zdenek" 
		def lastname = "Dvorak"
				
		assert 11 == Utils.getNumberOfWords( firstname );
		assert 8 == Utils.getNumberOfWords( lastname );
		assert 55 == Utils.getNumberOfWords( "${firstname} ${lastname}" );
	}	
}
