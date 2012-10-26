package cz.kibo.numerology

import java.text.Normalizer;
import java.text.Normalizer.Form; 

/**
 * Utility class for calculation of some numerological indicators.
 * 
 * @author Tomáš Jurman (tomasjurman@gmail.com)
 * @version 0.1.0
 **/
class Utils {
	
	static final MIN = 1;
	static final MAX = 9;
		
	/**
	 * Calculates the numerical sum of letters in the string.
	 * All words are in range 1..9 except double numbers: 11, 22, ..99.
	 *
	 * @param	String	words		 
	 * @return	Integer	numerical sum of the letters in the name
	 */
	static getNumberOfWords( words ){
		def cleanText = cleanPunctuation( words.toLowerCase() )
		def numbers = convertTextToNumbers( cleanText )				
		return numericalSum( numbers )
	}
		
	/**
	 * Retrieves the number of letter.
	 * All letters are in range 1..9
	 *
	 * @param	Char	letter
	 * @return	Integer	number of letter
	 */
	static getNumberOfLetter( letter ){			
		def idx = ('a'..'z').indexOf( letter );		
		return (idx % 9) + 1
	}
	
	/*-- PRIVATE METHODS --------------------------------------*/
	
	/*
	 * Convert text to ascii
	 * 
	 * @param	String	text
	 * @return	String	text converted to Ascii
	 */
	private static cleanPunctuation( text ){
		return Normalizer.normalize(text, Form.NFD).replaceAll("[^\\p{ASCII}]","")
	}
	
	/*
	 * Calculate numerical sum
	 * Result is in range 1..9 except double numbers: 11, 22, ..99.
	 * Method is recursive.
	 * 
	 * @param	List<Integer>	list of numbers
	 * @return	Integer	numerical sum
	 */
	private static numericalSum( numbers ){
					
		def sum = numbers.sum()
		
		//double numbers
		if( sum ==~ /(\d)\1/){
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
	
	/*
	 * Convert text to list of numbers.
	 * 
	 * @param	String	text
	 * @return	List<Integer>	numbers
	 */
	private static convertTextToNumbers( text ){
		def numbers = []
		text.each{ letter ->
			numbers << getNumberOfLetter( letter )
		}
		return numbers
	}
}
