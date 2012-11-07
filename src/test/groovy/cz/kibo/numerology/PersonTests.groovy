package cz.kibo.numerology;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

import org.junit.After;
import org.junit.Before;

class PersonTest extends GroovyTestCase{
	
	def person
	
	@Before
	public void setUp() throws Exception {		
		person = new Person("Milan Brunclík", new GregorianCalendar(1955, Calendar.FEBRUARY, 10).getTime())					
	}

	@After
	public void tearDown() throws Exception {
		person = null
	}
	
	void testGetNumberOfPerson(){
		assert 4 == person.getNumberOfPerson()
	}
	
	void testGetNumberOfInnerNature(){
		assert 22 == person.getNumberOfInnerNature()
	}
	
	void testGetNumberOfOuterNature(){
		assert 9 == person.getNumberOfOuterNature()
	}
	
	void testGetNumberOfDestiny(){
		assert 5 == person.getNumberOfDestiny()
	}
	
	void testGetNumberOfDestinyPath(){
		assert 8 == person.getNumberOfDestinyPath()
	}
	
	void testGetNumberOfGoalOfLive(){
		assert 9 == person.getNumberOfGoalOfLive()
	}
	
	void testGetNumberOfMotivationOfSoul(){
		assert 6 == person.getNumberOfMotivationOfSoul()
	}	
	
	void testGetFirstname(){
		assert 6 == person.getNumberOfMotivationOfSoul()
	}
	
	void testSetActualYear(){
		assert new Date().getAt(Calendar.YEAR) == person.getActualYear()
		
		def tenYearLater = new Date().minus( 365 * 10 ).getAt( Calendar.YEAR )
		person.setActualYear( tenYearLater )
		
		assert tenYearLater == person.getActualYear()
	}
	
	void testSetActualMonth(){
		assert new Date().getAt(Calendar.MONTH) == person.getActualMonth()
								
		person.setActualMonth( Calendar.JANUARY )		
		assert Calendar.JANUARY == person.getActualMonth()
		
		person.setActualMonth( Calendar.DECEMBER )
		assert Calendar.DECEMBER == person.getActualMonth()
	}
	
	void testGetNumberForYear(){						
		person.setActualYear(1955)
		assert person.getNumberOfDestiny() == person.getNumberForActualYear()
		
		person.setActualYear(1997)
		assert 2 == person.getNumberForActualYear()
		
		person.setActualYear(2012)
		assert 8 == person.getNumberForActualYear()
	}
	
	void testGetNumberForMonth(){				
		person.setActualYear(2012)
		
		person.setActualMonth( Calendar.JANUARY )
		assert 9 == person.getNumberForActualMonth()
		
		person.setActualMonth( Calendar.MARCH )
		assert 2 == person.getNumberForActualMonth()
		
		person.setActualMonth( Calendar.DECEMBER )
		assert 2 == person.getNumberForActualMonth()
	}
}
