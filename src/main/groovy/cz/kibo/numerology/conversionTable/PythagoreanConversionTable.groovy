package cz.kibo.numerology.conversionTable

/**
 * Pythagorean conversion table.
 *
 *<pre>
 *	1	2	3	4	5	6	7	8	9
 *	a	b	c	d	e	f	g	h	i
 *	j	k	l	m	n	o	p	q	r
 *	s	t	u	v	w	x	y	z
 *</pre>
 *
 * @author Tomas Jurman (tomasjurman@gmail.com)
 **/
class PythagoreanConversionTable implements ConversionTable{

	static Map TABLE = ["a":1,"b":2,"c":3,"d":4,"e":5,"f":6,"g":7,"h":8,"i":9,
				 		"j":1,"k":2,"l":3,"m":4,"n":5,"o":6,"p":7,"q":8,"r":9,
						"s":1,"t":2,"u":3,"v":4,"w":5,"x":6,"y":7,"z":8]
	
	@Override
	public int getNumberOfLetter(String letter) {				
		return TABLE[letter.toLowerCase()] != null ? TABLE[letter.toLowerCase()]: 0
	}
	
	@Override
	public String toString() {
		return "PythagoreanConversionTable";
	}	
}
