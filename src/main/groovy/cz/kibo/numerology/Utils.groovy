package cz.kibo.numerology

import java.text.Normalizer;
import java.text.Normalizer.Form; 

/** 
 * Utility class for calculation of numerological indicators. 
 */
class Utils {
	
	static final MIN = 1;
	static final MAX = 9;
	static final VOWEL = ['a', 'e', 'i', 'o', 'u', 'y']
		
	/**
	 * Calculate numerical sum. 
	 * Result is in range 1..9 or master number 11, 22. Method is recursive.
	 *
	 * @param	List<Integer>	list of numbers		
	 * @return	Integer	single digit or master number 
	*/
	static numericalSum( numbers ){
		def sum = numbers.sum()
					
		//master numbers 11,22
		if( sum ==~ /([12])\1/){			
			return sum
		}
					
		// range 1..9
		if(sum <= MAX){
			return sum
		}
					
		numbers.clear()
		"${sum}".each{ number ->
			numbers << number.toInteger()
		}
		numericalSum( numbers )
	}
	
	/**
	 * Selects vowels from text.
	 *
	 * @param	String	text
	 * @return	List<String> vowels
	 */
	static vowels( text ){
		def cleanText = text2Ascii( text.toLowerCase() )
		
		def vowels = []
		cleanText.each{ letter ->
			if(VOWEL.contains(letter)){
				vowels << letter
			}
		}
		
		return vowels
	}
		
	/*
	 * Convert text to list of numbers.
	 *
	 * @param	String text
	 * @param	ConversionTable conversionTable
	 * @return	List<Integer> numbers	 
	 */
	static text2Numbers( text, conversionTable ){	
		def numbers = []
		text.each{ letter ->
			if(!letter.isAllWhitespace()){
				numbers << conversionTable.getNumberOfLetter( letter )
			}			
		}
		return numbers
	}
			
	/**
	 * Converts text to ascii
	 *
	 * @param	String	text
	 * @return	String	text converted to Ascii
	 */
	static text2Ascii( text ){
		return Normalizer.normalize(text, Form.NFD).replaceAll("[^\\p{ASCII}]","")
	}
}
