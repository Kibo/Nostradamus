package cz.kibo.numerology

/**
 * Personal numerological indicators.
 *
 * @author Tomas Jurman (tomasjurman@gmail.com)
 * @version 0.5.0
 **/
class Person implements Viable {
			
	private String name
	private Date dateOfBirth
	private int actualYear
	private int actualMonth
		
	/**
	 * Class constructor.
	 * 
	 * @params	String firstname
	 * @params	String lastname
	 * @params	Date dateOfBirth
	 */
	public Person( name, dateOfBirth){
		this.name = name		
		this.dateOfBirth = dateOfBirth
		
		def now = new Date()
		this.actualYear = now.getAt( Calendar.YEAR )
		this.actualMonth = now.getAt( Calendar.MONTH )
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
		return Utils.getSumOfDate( dateOfBirth );
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
	
	@Override
	public int getNumberForActualYear() {			
		return Utils.getSumOfDate( new GregorianCalendar( 
			this.actualYear, 
			dateOfBirth.getAt(Calendar.MONTH), 
			dateOfBirth.getAt(Calendar.DATE))
		.getTime(), false);
	}
	
	@Override
	public int getNumberForActualMonth() {			
		return Utils.numericalSum( [getNumberForActualYear(), this.actualMonth + 1], false)
	}
	
	//-- GETER/ SETTER ---------------------------
	public String getName(){
		return this.name
	}
		
	public Date getDateOfBirth(){
		return this.dateOfBirth
	}	
		
	/**
	 * Get actual year.
	 *
	 * @return	Integer	number in format: yyyy
	 */
	public int getActualYear(){
		return this.actualYear
	}
	
	/**
	 * Set actual year.
	 *
	 * @param	Integer	number in format: yyyy
	 */
	public void setActualYear( int year ){
		this.actualYear = year
	}
	
	/**
	 * Get actual month.
	 *
	 * @return	Integer	number in range 0-11
	 */
	 public int getActualMonth(){
		 return this.actualMonth
	 }
	
	/**
	* Set actual month.
	*
	* @param	Integer	number in range 0-11	
	*/
	public void setActualMonth( int month ){
		this.actualMonth = month
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person: " + name + " (" + String.format('%td-%<tm-%<tY', dateOfBirth) + ")";
	}		
}
