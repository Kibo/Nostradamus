package cz.kibo.examples

import cz.kibo.numerology.*;

class PersonalNumerologicalCalculationsExample {

	static main(args) {
		
		def person = new Person("John Lennon", "9.10.1940")
		println """
			Personal number:	${person.getNumberOfPerson()}
			Destiny number:		${person.getNumberOfDestiny()}
			
			Inner natural:		${person.getNumberOfInnerNature()}
			Outer natural:		${person.getNumberOfOuterNature()}

			Destiny path:		${person.getNumberOfDestinyPath()}
			Goal of live:		${person.getNumberOfGoalOfLive()}

			Motivation of soul:	${person.getNumberOfMotivationOfSoul()}			
		"""
	
	}

}
