# Nostradamus v.0.1.1

**Library for astrological and numerological calculations.**

Actual version contains the calculations for basic numerological indicators:

- Number of person
- Inner nature
- Outer nature
- Number of destiny
- Destiny path
- Goal of life
- Motivation of soul

  
**Usage:**

```
def person = new Person("John Lennon", "9.10.1940")
println """
	Personal number:	${person.getNumberOfPerson()}
	Destiny number:		${person.getNumberOfDestiny()}
	
	Inner natural:		${person.getNumberOfInnerNature()}
	Outer natural:		${person.getNumberOfOuterNature()}

	Destiny path:		${person.getNumberOfDestinyPath()}
	Goal of live:		${person.getNumberOfGoalOfLive()}

	Motivation of soul:	${person.getNumberOfMotivationOfSoul()}	
```
