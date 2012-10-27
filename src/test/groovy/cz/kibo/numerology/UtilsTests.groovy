package cz.kibo.numerology;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

class UtilsTests extends GroovyTestCase{
		
	void testNumericalSum(){				
		assert 11 == Utils.numericalSum( [5, 6] );
		assert 1 == Utils.numericalSum( [1, 2, 3, 4] );		
	}
	
	void testGetNumberOfFirstLetters(){
		
		def nameA = "Zdenek Dvorak"
		def nameB = "A k m i"
		def nameC = "Ade kth muj ihy"
		
		assert 3 == Utils.getNumberOfFirstLetters( nameA );
		assert 7 == Utils.getNumberOfFirstLetters( nameB );
		assert 7 == Utils.getNumberOfFirstLetters( nameC );		
	}
		
	void testGetSumOfNumbers(){		
		def birdDateA = "18.12.1977"
		def birdDateB = "5.12.1929"
		
		assert 9 == Utils.getSumOfNumbers( birdDateA );
		assert 11 == Utils.getSumOfNumbers( birdDateB );		
	}
	
	void testGetNumnerOfConsonants(){
		def firstname = "Zdenek"
		def lastname = "Dvorak"
		
		assert 1 == Utils.getNumnerOfConsonants( firstname );
		assert 1 == Utils.getNumnerOfConsonants( lastname );
		assert 11 == Utils.getNumnerOfConsonants( "${firstname} ${lastname}" );
	}
	
	void testGetNumnerOfVowels(){
		def firstname = "Zdenek"
		def lastname = "Dvorak"
		
		assert 1 == Utils.getNumnerOfVowels( firstname );
		assert 7 == Utils.getNumnerOfVowels( lastname );
		assert 8 == Utils.getNumnerOfVowels( "${firstname} ${lastname}" );
	}
				
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
