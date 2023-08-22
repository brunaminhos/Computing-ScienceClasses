/**
 * Name: Rational.java
 *
 * Student Name;
 * Student Number:
 */
package question2;

class Rational implements Operations{
	private int num,den;

	public Rational(int n, int d){//assume d != 0
        if(n < 0 && d < 0){
        	n = -n; d = -d;
        } else if(d < 0){
        	n = -n; d = -d;
        }

        //ensures that d never negative and n positive e.g. 1/-2 is changed to -1/2
        int g = gcd(Math.abs(n), Math.abs(d));
        num = n/g;
        den = d/g;
	}

	public Rational(int n){
		num = n; den = 1;
	}

	public int num(){
		return num;
	}

	public int den(){
		return den;
	}

    // adds fraction to fraction
    public Rational add(Rational input){
        return new Rational(num*input.den+den*input.num, den*input.den);
    }

    // subtracts fraction from fraction
    public Rational sub(Rational input){
        return new Rational((num*input.den)-(den*input.num), den*input.den);
    }

    // multiplies fraction by fraction
    public Rational mult(Rational input){
        return new Rational(num*input.num, den*input.den);
    }

    // multiplies fraction by int
    public Rational multBy(int input) {
        return new Rational(num*input, den*1);
    }
    
    // divides fraction by fraction
    public Rational div(Rational input){
        return new Rational(num*input.den, den*input.num);
    }

    // divides fraction by int
    public Rational divBy(int input){
        return new Rational(num*1, den*input);
    }

    // verify fraction equals fraction
    public boolean eq(Rational input){
        if(num==input.num && den==input.den){
            return true;
        }
        else{
            return false;
        }
    }
    
	public String toString(){
		return num+"/"+den;
	}

	private int gcd(int a, int b){
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
}