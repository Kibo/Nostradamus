package cz.kibo.numerology

/**
 * Personal numerological indicators.
 *
 * @author Tomáš Jurman (tomasjurman@gmail.com)
 * @version 0.5.0
 **/
class Person implements Viable {
		
	private String name		
	private String dateOfBirth
		
	/**
	 * Class constructor.
	 * 
	 * @params	String name	person's name
	 * @params	String dateOfBirth	date of birth
	 */
	public Person(name, dateOfBirth){
		this.name = name
		this.dateOfBirth = dateOfBirth
	}

	@Override
	public int getNumberOfPerson() {		
		return Utils.getNumberOfWords( name )
	}

	@Override
	public int getNumberOfInnerNature() {
		return Utils.getNumnerOfVowels( name )
	}

	@Override
	public int getNumberOfOuterNature() {
		return Utils.getNumnerOfConsonants( name )
	}

	@Override
	public int getNumberOfDestiny() {		
		return Utils.getSumOfNumbers( dateOfBirth );
	}

	@Override
	public int getNumberOfDestinyPath() {			
		return Utils.numericalSum( [getNumberOfPerson(), getNumberOfInnerNature()] )
	}

	@Override
	public int getNumberOfGoalOfLive() {
		return Utils.numericalSum( [getNumberOfPerson(), getNumberOfDestiny()] )
	}

	@Override
	public int getNumberOfMotivationOfSoul() {		
		return Utils.getNumberOfFirstLetters( name );
	}
	
	public getName(){
		return name
	}
}
