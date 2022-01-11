/*Class to test our rational program
 * @author Emma Chiusano
 * @verson 0.1
 * Date of Creation: 14 September, 2021
 * Last Date Modified: 21 September, 2021
 * */

import java.util.Random;
public class Test {
	public static void main(String[]args) {
		//part 1
		//creates an instance of the random class
		Random r=new Random();
		//initialize array
		Number [] numbers= new Number[10];
		//fills array with random
		for (int i=0; i<numbers.length;i++) {
			switch (i%5) {
				case 0://int
					numbers[i]=r.nextInt(100);
					break;
				case 1://long
					numbers[i]= (long) r.nextInt(10000);
					break;
				case 2://float
					numbers[i]= r.nextFloat()*1000;
					break;
				case 3://double
					numbers[i]= r.nextDouble()*1000000;
					break;
				case 4://rational
					numbers[i]=new Rational(r.nextInt(10),r.nextInt(10)+1);//dont want 0 as a random denominator
					break;
			}
		}
		//prints out our numbers and manipulates them
		System.out.println("List of Numbers:");
		System.out.println("Value\tInt Value\tDouble Value");
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i].toString()+"\t"+
								numbers[i].intValue()+"\t"+
								numbers[i].doubleValue());
		}
		//part 2
		//operations on numbers of type rational
		//create an array of fractions
		Rational [] fractions=new Rational[8];
		//initialize array
		//randomly generates fractions
		for (int i=0; i<fractions.length;i++) {
			fractions[i]=new Rational(r.nextInt(10)+1, r.nextInt(10)+1);
		}
		//print original fraction list
		//list is random
		System.out.println("Original List of Fractions:");
		for (int i=0; i<fractions.length; i++) {
			System.out.println(fractions[i].toString());
		}
		//show operations of fractions
		System.out.println("Operations of Fractions:");
			System.out.println(fractions[0]+" + "+fractions[1]+" = "+fractions[0].add(fractions[1]));//adds fracgtions
			System.out.println(fractions[2]+" - "+fractions[3]+" = "+fractions[2].sub(fractions[3]));//subtracts fractions
			System.out.println(fractions[4]+" * "+fractions[5]+" = "+fractions[4].mult(fractions[5]));//multiplies fractions
			System.out.println(fractions[6]+" / "+fractions[7]+" = "+fractions[6].div(fractions[7]));//divides fractions
			//sort fractions array
			java.util.Arrays.sort(fractions);;
			//print sorted array
			System.out.println("Sorted list of fractions:");
			for (int i=0; i<fractions.length; i++) {
				System.out.println(fractions[i].toString());
			}
			
	}
}
