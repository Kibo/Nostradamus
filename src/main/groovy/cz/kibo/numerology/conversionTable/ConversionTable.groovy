package cz.kibo.numerology.conversionTable

interface ConversionTable {
		
	/**
	 * Determines the numerical value of the letter.
	 * 
	 * @param	String letter
	 * @return	int	numerical value of letter
	 * @throws	IllegalArgumentException	letter is not in table.
	 */
	public int getNumberOfLetter( String letter )

}
