# Nostradamus v.0.2

**Library for astrological and numerological calculations.**

Actual version contains the calculations for basic numerological indicators:

- Number of person
- Inner nature
- Outer nature
- Number of destiny
- Destiny path
- Goal of life
- Motivation of soul

  
**Example:**

```
def person = new Person("John Lennon", new GregorianCalendar(1940, Calendar.OCTOBER, 9).getTime() )
println person.getNumberOfPerson()
println person.getNumberOfDestiny()
```

**Usage:**

Buld jar for your project.

```
gradle jar

```

**Documentation:**

Generate documentation for more information.

```
gradle groovydoc

```
