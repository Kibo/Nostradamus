package cz.kibo.numerology

import java.text.Normalizer;
import java.text.Normalizer.Form; 

/**
 * Utility class for calculation of some numerological indicators.
 * 
 * @author Tomas Jurman (tomasjurman@gmail.com)
 * @version 0.1.0
 **/
class Utils {
	
	static final MIN = 1;
	static final MAX = 9;
	static final VOWEL = ['a', 'e', 'i', 'o', 'u', 'y']
		
	/**
	 * Calculates the numerical sum of first letters in text.
	 *
	 * @param	String	text
	 * @return	Integer	numerical sum of first letters. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static getNumberOfFirstLetters( text ){
		def numbers = []
		def words = text.toLowerCase().split(" ")
		words.each{ word ->			
			numbers << getNumberOfLetter( word[0] )
		}
		
		return numericalSum( numbers )
	}
	
	/**
	 * Calculates the sum of numbers from date.	 
	 *
	 * @param	Date	dateOfBirth
	 * @return	Integer	sum of numbers. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static getSumOfDate( dateOfBirth ){
		
		//24.12.2012 convert to 24122012
		def dateOfBirthAsString = String.format('%td%<tm%<tY', dateOfBirth)
		
		def numbers = []
		dateOfBirthAsString.each{ letter ->
			if(letter.isInteger()){
				numbers << letter.toInteger()
			}			
		}
		
		return numericalSum( numbers )	 
	}
	
	/**
	 * Calculates the numerical sum of consonants in text.	
	 *
	 * @param	String	text
	 * @return	Integer	numerical sum of consonants. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static getNumnerOfConsonants( text ){
		def cleanText = cleanPunctuation( text.toLowerCase() )
		
		def numbers = []
		cleanText.each{ letter ->
			if( !VOWEL.contains(letter)){
				numbers << getNumberOfLetter( letter )
			}
		}
		
		return numericalSum( numbers )		
	}
		
	/**
	 * Calculates the numerical sum of vowels in text.	
	 *
	 * @param	String	text
	 * @return	Integer	numerical sum of vowels. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static getNumnerOfVowels( text ){
		def cleanText = cleanPunctuation( text.toLowerCase() )
		
		def numbers = []
		cleanText.each{ letter ->
			if(VOWEL.contains(letter)){
				numbers << getNumberOfLetter( letter )
			}
		}
		
		return numericalSum( numbers )
	}
		
	/**
	 * Calculates the numerical sum of letters in text.	 
	 *
	 * @param	String	text		 
	 * @return	Integer	numerical sum of letters. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static getNumberOfWords( text ){
		def cleanText = cleanPunctuation( text.toLowerCase() )
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
	
	/**
	 * Calculate numerical sum
	 * Method is recursive.
	 *
	 * @param	List<Integer>	list of numbers
	 * @return	Integer	numerical sum. Result is in range 1..9 except double numbers: 11, 22, ..99.
	 */
	static numericalSum( numbers ){
					
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
