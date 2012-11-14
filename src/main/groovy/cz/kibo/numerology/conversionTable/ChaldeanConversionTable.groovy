package cz.kibo.numerology.conversionTable

import java.util.Map;

/**
 * Chaldean conversion table.
 *
 *<pre>
 *	1	2	3	4	5	6	7	8
 *	a	b	c	d	e	u	o	f
 *	i	k	g	m	h	v	z	p
 *	j	r	l	t	n	w
 *	q		s		x
 *	y
 *</pre>
 *
 * @author Tomas Jurman (tomasjurman@gmail.com)
 **/
class ChaldeanConversionTable implements ConversionTable{

	static Map TABLE = ["a":1,"b":2,"c":3,"d":4,"e":5,"u":6,"o":7,"f":8,
				 		"i":1,"k":2,"g":3,"m":4,"h":5,"v":6,"z":7,"p":8,
						"j":1,"r":2,"l":3,"t":4,"n":5,"w":6,
						"q":1,		"s":3,		"x":5,
						"y":1]
	
	@Override
	public int getNumberOfLetter(String letter) {				
		try{
			return TABLE[letter.toLowerCase()];
		}catch(Exception e){
			throw new IllegalArgumentException("${letter} is not in table.")
		}
	}
	
	@Override
	public String toString() {
		return "ChaldeanConversionTable";
	}	
}