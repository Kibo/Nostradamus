package cz.kibo.examples

import cz.kibo.numerology.*;

class PersonNumerology {

	static main(args) {
						
		def person = new Person("John Lennon", new GregorianCalendar(1940, Calendar.OCTOBER, 9).getTime() )
		println """
			${person.toString()}
			###############################################
			Life path:		${person.lifePath()}
			-----------------------------------------------
			Birth day:		${person.birthday()}
			-----------------------------------------------
			Expression:		${person.expression()}
			-----------------------------------------------			
			Inner motivation:	${person.innerMotivation()}							
		"""		
	}
}
