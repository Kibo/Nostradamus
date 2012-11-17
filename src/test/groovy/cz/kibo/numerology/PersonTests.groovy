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
	
	void testLifePath(){
		assert 5 == person.lifePath()
	}
	
	void testExpression(){
		assert 4 == person.expression()
	}
	
	void testInnerMotivation(){
		assert 22 == person.innerMotivation()
	}
	
	void testBirthday(){
		assert 1 == person.birthday()
	}	
}
