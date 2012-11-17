package cz.kibo.numerology

interface Viable {
	
	/**
	 * The Life Path is the major lesson to be learned in this life, the central focus of a person's existence.
	 * 
	 * The Life Path is derived by finding the sum of the month, day and year of birth and reducing that sum to a single digit or master number.
	 *
	 * @return	int	sum
	 */
	int lifePath()
	
	/**
	 * The Expression is a person´s potential natural abilities.
	 *
	 * The Expression is derived by finding the sum of the number values of all the letters in each name, 
	 * reducing this sum to a single digit or master number, then adding the sums of all the names together 
	 * and reducing that total to a single digit or master number.
	 *
	 * @return	int	sum
	 */
	int expression()
	
	/**
	 * The Inner Motivation. 
	 * Express what he wants to be, to have and to do.
	 *
	 * The Inner Motivation is derived by finding the sum of the number values of the vowels in each name, 
	 * reducing this sum to a single digit or master number, then adding the sums of all the names together 
	 * and reducing that total to a single digit or master number.
	 *
	 * @return	int	sum
	 */
	int innerMotivation()
		
	/**
	 * The Birthday is a sub-lesson to be learned in this life, a sub-focus on the life path.
	 *
	 * The Birthday is derived by reducing the day of birth to a single digit or master number.
	 *
	 * @return	int	sum
	 */
	int birthday()
}
