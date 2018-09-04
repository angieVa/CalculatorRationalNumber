package modelo;

import Generic.RationalNumber;

public class Calculator {
	
	private int numerator;
	private int denominator;
	
	public Calculator() {

	}
	
	
	public void multiplyRacional(int num1, int den1, int num2, int den2) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		RationalNumber<Number> Rational2 = new RationalNumber<Number>(num2,den2);
		
		Rational1.multiplyRational(Rational2);
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();
		
		
		
		
	}
	
	
	public void AddRational(int num1, int den1, int num2, int den2) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		RationalNumber<Number> Rational2 = new RationalNumber<Number>(num2,den2);
		
		Rational1.addRational(Rational2);
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();
		

	}
	
	public void SubstractRational(int num1, int den1, int num2, int den2) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		RationalNumber<Number> Rational2 = new RationalNumber<Number>(num2,den2);
		
		Rational1.substractRational(Rational2);
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();
		

	}
	
	public void divideRational(int num1, int den1, int num2, int den2) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		RationalNumber<Number> Rational2 = new RationalNumber<Number>(num2,den2);
		
		Rational1.divideRational(Rational2);
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();

	}
	
	public void simplifyRational(int num1, int den1) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		
		Rational1.simplifyRational();
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();

	}
	
	public void squaredRational(int num1, int den1) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		
		Rational1.squaredRational();
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();

	}
	
	public void RationalInverse(int num1, int den1) {
		
		RationalNumber<Integer> Rational1 = new RationalNumber<Integer>(num1,den1);
		
		Rational1.rationalInverse();;
		
		this.numerator = Rational1.getNumerator().intValue();
		this.denominator = Rational1.getDenominator().intValue();

	}
	
	
	


	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}


	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}


	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	

}
