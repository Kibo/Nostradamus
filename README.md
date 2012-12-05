# Nostradamus v.3.0

**Library for astrological and numerological calculations.**

Actual version contains the calculations for basic numerological indicators:

- Life path
- Expression
- Inner motivation
- Birth day
  
**Example:**

```
def person = new Person("John Lennon", new GregorianCalendar(1940, Calendar.OCTOBER, 9).getTime() )
println person.lifePath()
println person.expression()
```

**Usage:**

Build jar for your project.

```
gradle jar
```

**Documentation:**

Generate documentation for more information.

```
gradle groovydoc
```

**Demo:**

Web project [numerology-astrology](http://astrology-numerology.appspot.com/ "numerology-astrology") uses Nostradamus for calculating magic numbers.