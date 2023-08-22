/**
 * Name: AssignmentTest.java
 *
 * Student Name;
 * Student Number:
 */
package question2;

public class AssignmentTest {
	public static void main(String[] args) {
  		//Test Rational class here
		Rational k = new Rational(4,5);
		System.out.println(k);
		Rational k1 = new Rational(20,8);
        System.out.println(k1);
        System.out.println(new Rational(-3,-4));
        Rational addAnswer = k.add(k1);
        System.out.println(addAnswer); // Answer should be 33/10
        Rational subAnswer = k.sub(k1);
        System.out.println(subAnswer); // Answer should be -17/10
        Rational multAnswer = k.mult(k1);
        System.out.println(multAnswer); // Answer should be 2/1
        Rational multByAnswer = k.multBy(3);
        System.out.println(multByAnswer); // Answer should be 12/5
        Rational divAnswer = k.div(k1);
        System.out.println(divAnswer); // Answer should be 8/25
        Rational divByAnswer = k.divBy(7);
        System.out.println(divByAnswer); // Answer should be 4/35
	}
}