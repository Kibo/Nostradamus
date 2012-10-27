package cz.kibo.examples

import cz.kibo.numerology.*;

class PersonNumerology {

	static main(args) {
						
		def person = new Person("John Lennon", new GregorianCalendar(1940, Calendar.OCTOBER, 9).getTime() )
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
