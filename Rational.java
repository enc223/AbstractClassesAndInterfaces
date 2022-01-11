
/* Class to model the entitiy Rational which impliments comparable and extends number
 * @author Emma Chiusano
 * @verson 0.1
 * Date of Creation: 14 September, 2021
 * Last Date Modified: 21 September, 2021
 * */
public class Rational extends Number implements Comparable<Rational>{
	//data members
	private int numerator;
	private int denominator;
	//constructors
	/*default constructor
	no parameters
	initializes numerator and denominator*/
	public Rational() {
		numerator=0;
		denominator=1;
	}
	/*default constructor
	@param int n int d
	@ return none*/
	public Rational(int n, int d) {
		numerator=n;
		denominator=d;
	}
	//getters
	/*Getter for the numerator
	* @param no parameters
	* @return the numerator*/
	public int getNumerator() {
		return numerator;
	}
	/*Getter for the denominaotr
	* @param no parameters
	* @return the denominator*/
	public int getDenominator() {
		return denominator;
	}
	//setters
	/*Setter for the numerator
	 * @param int n
	 * @return no return*/
	public void setNumerator(int n) {
		numerator=n;
	}
	/*Setter for the denominaotr
	 * @param int d
	 * @return no return*/
	public void setDenominator(int d) {
		denominator=d;
	}
	//methods
	/*Method to get the rational information
	 * @param no parameters
	 * @return formatted string containing the value of the data members*/
	public String toString() {
		reduce();
		if (numerator==0) {
			return "0";
		}else if(denominator==1) {
			return ""+numerator;
		}else if (denominator < 0) {
			return (-numerator)+"/"+(-denominator);
		}else if (numerator==denominator) {
			return "1";
		}else {
			return numerator + "/" + denominator;
		}
	}
	/*Method to add fractions
	 * @param rational r
	 * @return result of operation*/
	public Rational add(Rational r) {
		int sumN=this.numerator*r.denominator+this.denominator*r.numerator;
		int sumD=this.denominator*r.denominator;
		Rational result=new Rational(sumN, sumD);
		result.reduce();
		return result;
	}
	/*Method to subtract fractions
	 * @param rational r
	 * @return result of operation*/
	public Rational sub(Rational r) {
		int subN=this.numerator*r.denominator-this.denominator*r.numerator;
		int subD=this.denominator*r.denominator;
		Rational result=new Rational(subN, subD);
		result.reduce();
		return result;
	}
	/*Method to multiply fractions
	 * @param rational r
	 * @return result of operation*/
	public Rational mult(Rational r) {
		int multN=this.numerator*r.numerator;
		int multD=this.denominator*r.denominator;
		Rational result=new Rational(multN, multD);
		result.reduce();
		return result;
	}
	/*Method to divide fractions
	 * @param rational r
	 * @return result of operation*/
	public Rational div(Rational r) {
		int divN=this.numerator * r.denominator;
		int divD=this.denominator * r.numerator;
		Rational result=new Rational(divN, divD);
		result.reduce();
		return result;
	}
	/*Method to reduce fractions
	 * @param rational r
	 * @return reduced fraction*/
	private void reduce() {
		int g= gcd();
		numerator /=g;
		denominator /=g;
	}
	/*Method to find the gcd of fractions
	 * @param rational r
	 * @return gcd*/
	private int gcd() {
		int g=1;
		int min=Math.min(numerator,  denominator);
		for (int i=2; i<=min; i++) {
			if (numerator %i == 0 && denominator %i ==0) {//i is a common divosor
				g=i;
			}
		}
			return g;
	}
	@Override
	/*Method to give an integer fraction
	 * @param none
	 * @return result of operation*/
	public int intValue() {
		return numerator/denominator;
	}
	/*Method to give a long fraction
	 * @param none
	 * @return result of operation*/
	public long longValue() {
		return (long) (numerator/denominator);
	}
	/*Method to give a float fraction
	 * @param none
	 * @return result of operation*/
	public float floatValue() {
		return (float) (numerator/denominator);
	}
	/*Method to give a double fraction
	 * @param none
	 * @return result of operation*/
	public double doubleValue() {
		return (double) numerator/denominator;
	}
	/*Method to compare fractions
	 * @param none
	 * @return 0 if they are equal, 1 if the first is bigger, -1 if the second is bigger*/
	public int compareTo(Rational r) {
		if (this.doubleValue()==r.doubleValue()) {
			return 0;
		}else if (this.doubleValue()>r.doubleValue()) {
			return 1;
		} else {
			return -1;
		}
	}

}
