package cz.kibo.numerology;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

import org.junit.After;
import org.junit.Before;

class PersonsTests extends GroovyTestCase{
	
	def person

	@Before
	public void setUp() throws Exception {		
		person = new Person("Milan Brunclík", "10.2.1955")		
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
}
