package cz.kibo.numerology

interface Viable {
	
	/**
	 * Calculates number of person.
	 * 
	 * @return	Integer	numerical sum of letters in the name
	 */
	int getNumberOfPerson()
		
	/**
	 * Calculates number of the inner nature.
	 *
	 * @return	Integer	numerical sum of vowels in the name
	 */
	int getNumberOfInnerNature()
	
	/**
	 * Calculates number of the outer nature.
	 *
	 * @return	Integer	numerical sum of consonants in the name
	 */
	int getNumberOfOuterNature()
		
	/**
	 * Calculates numerical sum of the birth date
	 *
	 * @return	Integer	numerical sum  of the birth date
	 */
	int getNumberOfDestiny()
	
	/**
	 * Calculates number of the path of destiny
	 *
	 * @return	Integer	numerical sum of numberOfDestiony + numberOfInnerNature
	 */
	int getNumberOfDestinyPath()
	
	/**
	 * Calculates number of goal of live
	 *
	 * @return	Integer	numerical sum of numberOfPerson + numberOfDestiony
	 */
	int getNumberOfGoalOfLive()
		
	/**
	 * Calculates number of motivation of the soul
	 *
	 * @return	Integer	numerical sum of the first letters in the name
	 */
	int getNumberOfMotivationOfSoul()
	
	/**
	 * Calculates personal number for actual year
	 *
	 * @return	Integer	number in range 1-9
	 */
	int getNumberForActualYear()
	
	/**
	 * Calculates personal number for actual month
	 *
	 * @return	Integer	number in range 1-9
	 */
	int getNumberForActualMonth()
}

