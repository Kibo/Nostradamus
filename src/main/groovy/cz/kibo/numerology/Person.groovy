package cz.kibo.numerology

import cz.kibo.numerology.conversionTable.ConversionTable
import cz.kibo.numerology.conversionTable.PythagoreanConversionTable

/**
 * Personal numerological indicators.
 **/
class Person implements Viable {
			
	private String name
	private Date dateOfBirth
	private ConversionTable conversionTable
		
	/**
	 * Class constructor.
	 * 
	 * @params	String fullname	
	 * @params	Date dateOfBirth
	 */
	public Person( name, dateOfBirth ){
		this(name, dateOfBirth, new PythagoreanConversionTable())
	}
	
	/**
	 * Class constructor.
	 *
	 * @param	String fullname
	 * @param	Date dateOfBirth
	 * @param	ConversionTable conversionTable
	 */
	public Person( name, dateOfBirth, conversionTable ){
		this.name = name
		this.dateOfBirth = dateOfBirth
		this.conversionTable = conversionTable
	}
	
	@Override
	public int lifePath() {
		//24.12.2012 convert to 24122012
		def dateOfBirthAsString = String.format('%td%<tm%<tY', this.dateOfBirth)

		def numbers = []
		dateOfBirthAsString.each{ letter ->
			if(letter.isInteger()){
				numbers << letter.toInteger()
			}
		}

		return Utils.numericalSum( numbers )	
	}

	@Override
	public int expression() {
		def text = Utils.text2Ascii( this.name.toLowerCase() )
		def numbers = Utils.text2Numbers( text, this.conversionTable )		
		return Utils.numericalSum( numbers )
	}

	@Override
	public int innerMotivation() {
		def text = Utils.text2Ascii( this.name.toLowerCase() )
		def vowels = Utils.vowels( text ) 
		def numbers = Utils.text2Numbers( vowels, this.conversionTable )
		return Utils.numericalSum( numbers )
	}

	@Override
	public int birthday() {
		def day = dateOfBirth.getAt( Calendar.DAY_OF_MONTH )
		return Utils.numericalSum( [day] )
	}
	
	//-- GETER/ SETTER ---------------------------
	public String getName(){
		return this.name
	}
		
	public Date getDateOfBirth(){
		return this.dateOfBirth
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
