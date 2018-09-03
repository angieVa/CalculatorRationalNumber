package Generic;

public class RationalNumber<T extends Number> implements IRationalNumber<RationalNumber<Number>> {
	
	
	private T numerator;
	private T denominator;
	
	
	public RationalNumber(T numerator, T denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}


	@Override
	public void addRational(RationalNumber<Number> rationalToBeAdded) {
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(denominator.longValue() ==  rationalToBeAdded.getDenominator().longValue()) {
				
				this.numerator = (T)Long.valueOf(numerator.longValue() + rationalToBeAdded.getNumerator().longValue()); 
				
			}else {
				
				this.numerator = (T)Long.valueOf(multiply(numerator, (T)rationalToBeAdded.getDenominator()).longValue() + multiply(denominator, (T)rationalToBeAdded.getNumerator()).longValue()); 
				this.denominator = (T)Long.valueOf(multiply(denominator, (T)rationalToBeAdded.getDenominator()).longValue());
				
			}
			
		}else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(denominator.intValue() ==  rationalToBeAdded.getDenominator().intValue()) {
				
				this.numerator = (T)Integer.valueOf(numerator.intValue() + rationalToBeAdded.getNumerator().intValue()); 

			}else {
				
				this.numerator = (T)Integer.valueOf(multiply(numerator, (T)rationalToBeAdded.getDenominator()).intValue() + multiply(denominator, (T)rationalToBeAdded.getNumerator()).intValue()); 
				this.denominator = (T)Integer.valueOf(multiply(denominator, (T)rationalToBeAdded.getDenominator()).intValue());
				
			}
			
			
		}else if(numerator instanceof Short && denominator instanceof Short) {

			if(denominator.shortValue() ==  rationalToBeAdded.getDenominator().shortValue()) {
				
				this.numerator = (T)Short.valueOf((short) (numerator.shortValue() + rationalToBeAdded.getNumerator().shortValue())); 
				
			}else {
				
				this.numerator = (T)Short.valueOf((short) (multiply(numerator, (T)rationalToBeAdded.getDenominator()).shortValue() + multiply(denominator, (T)rationalToBeAdded.getNumerator()).shortValue())); 
				this.denominator = (T)Short.valueOf(multiply(denominator, (T)rationalToBeAdded.getDenominator()).shortValue());	
			}
			
		}
			
		
		simplifyRational();

		
	}


	@Override
	public void substractRational(RationalNumber<Number> rationalToBeSubstracted) {
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(denominator.longValue() ==  rationalToBeSubstracted.getDenominator().longValue()) {
				
				this.numerator = (T)Long.valueOf(numerator.longValue() - rationalToBeSubstracted.getNumerator().longValue()); 
				
			}else {
				
				this.numerator = (T)Long.valueOf(multiply(numerator, (T)rationalToBeSubstracted.getDenominator()).longValue() - multiply(denominator, (T)rationalToBeSubstracted.getNumerator()).longValue()); 
				this.denominator = (T)Long.valueOf(multiply(denominator, (T)rationalToBeSubstracted.getDenominator()).longValue());
				
			}
			
		}else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(denominator.intValue() ==  rationalToBeSubstracted.getDenominator().intValue()) {
				
				this.numerator = (T)Integer.valueOf(numerator.intValue() - rationalToBeSubstracted.getNumerator().intValue()); 

			}else {
				
				this.numerator = (T)Integer.valueOf(multiply(numerator, (T)rationalToBeSubstracted.getDenominator()).intValue() - multiply(denominator, (T)rationalToBeSubstracted.getNumerator()).intValue()); 
				this.denominator = (T)Integer.valueOf(multiply(denominator, (T)rationalToBeSubstracted.getDenominator()).intValue());
				
			}
			
			
		}else if(numerator instanceof Short && denominator instanceof Short) {

			if(denominator.shortValue() ==  rationalToBeSubstracted.getDenominator().shortValue()) {
				
				this.numerator = (T)Short.valueOf((short) (numerator.shortValue() - rationalToBeSubstracted.getNumerator().shortValue())); 
				
			}else {
				
				this.numerator = (T)Short.valueOf((short) (multiply(numerator, (T)rationalToBeSubstracted.getDenominator()).shortValue() - multiply(denominator, (T)rationalToBeSubstracted.getNumerator()).shortValue())); 
				this.denominator = (T)Short.valueOf(multiply(denominator, (T)rationalToBeSubstracted.getDenominator()).shortValue());	
			}
			
		}
			
		
		simplifyRational();

	}


	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {
		// TODO Auto-generated method stub
		
		this.numerator = multiply(numerator, (T)rationalFactor.getNumerator());
		this.denominator =  multiply(denominator, (T)rationalFactor.getDenominator());
		
		simplifyRational();
	}


	private T multiply(T n1, T n2) {
		// TODO Auto-generated method stub
		
		T number = null;
		
		if(n1 instanceof Long) {
			
			number = (T) Long.valueOf(n1.longValue()*n2.longValue());
		}else if(n1 instanceof Integer) {
			
			number = (T) Integer.valueOf(n1.intValue() * n2.intValue());
			
			
		}else if(n1 instanceof Short) {
			
			number = (T) Short.valueOf((short) ((short)n1.shortValue()*(short)n2.shortValue()));
			
			
		}
		
		return number;
	}


	@Override
	public void divideRational(RationalNumber<Number> rationalQuocient) {
		
		this.numerator = multiply(numerator, (T)rationalQuocient.getDenominator());
		this.denominator =  multiply(denominator, (T)rationalQuocient.getNumerator());
		
		simplifyRational();
	}
	
	
	public void simplifyRational() {

		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(Math.abs(numerator.longValue()) == Math.abs(denominator.longValue())) {
				this.numerator = (T) Long.valueOf(numerator.longValue() / Math.abs(numerator.longValue()));
				this.denominator = (T) Long.valueOf(denominator.longValue() / Math.abs(denominator.longValue()));
				
			}else {
				
			
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.longValue()%2 == 0 && denominator.longValue()%2 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 2);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 2);
					
				}	
				
				else if(numerator.longValue()%3 == 0 && denominator.longValue()%3 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 3);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 3);
					
				}
				
				else if(numerator.longValue()%5 == 0 && denominator.longValue()%5 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 5);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 5);
					
				}
				
				else if(numerator.longValue()%7 == 0 && denominator.longValue()%7 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 7);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 7);
					
				}
				
				else {
					
					stop = true;
					
				}
			}
			}
			
		}
		
		else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(Math.abs(numerator.intValue()) == Math.abs(denominator.intValue())) {
				this.numerator = (T) Integer.valueOf(numerator.intValue() / Math.abs(numerator.intValue()));
				this.denominator = (T)Integer.valueOf(denominator.intValue() / Math.abs(denominator.intValue()));
				
			}else {
			
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.intValue()%2 == 0 && denominator.intValue()%2 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 2);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 2);
					
				}	
				
				else if(numerator.intValue()%3 == 0 && denominator.intValue()%3 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 3);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 3);
					
				}
				
				else if(numerator.intValue()%5 == 0 && denominator.intValue()%5 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 5);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 5);
					
				}
				
				else if(numerator.intValue()%7 == 0 && denominator.intValue()%7 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 7);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 7);
					
				}
				
				else {
					
					stop = true;
					
				}
				
			}
			}	
		}
		
		else if(numerator instanceof Short && denominator instanceof Short) {
	
			if(Math.abs(numerator.shortValue()) == Math.abs(denominator.shortValue())) {
				this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / Math.abs(numerator.shortValue())));
				this.denominator = (T)Short.valueOf((short) (denominator.shortValue() / Math.abs(denominator.shortValue())));
				
			}else {
				
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.shortValue()%2 == 0 && denominator.shortValue()%2 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 2));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 2));
					
				}	
				
				else if(numerator.shortValue()%3 == 0 && denominator.shortValue()%3 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 3));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 3));
					
				}
				
				else if(numerator.shortValue()%5 == 0 && denominator.shortValue()%5 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 5));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 5));
					
				}
				
				else if(numerator.shortValue()%7 == 0 && denominator.shortValue()%7 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 7));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 7));
					
				}
				
				else {
					
					stop = true;
					
				}
				
			}
			
		}
		}
	
	}


	@Override
	public void rationalInverse() {
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(numerator.longValue() != 0) {
				T temp = numerator;
				this.numerator = denominator;
				this.denominator = temp;
			}
			
		}else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(numerator.intValue() != 0) {
				T temp = numerator;
				this.numerator = denominator;
				this.denominator = temp;
			}
			
		}else if(numerator instanceof Short && denominator instanceof Short) {

			if(numerator.shortValue() != 0) {
				T temp = numerator;
				this.numerator = denominator;
				this.denominator = temp;
			}
		}
		
		
		simplifyRational();
	}


	@Override
	public void squaredRational() {
		
		if(this.numerator instanceof Long) {
			
		this.numerator = (T)(Long.valueOf(numerator.longValue() * numerator.longValue()));
		this.denominator = (T)(Long.valueOf(denominator.longValue() * denominator.longValue()));
		
	}else if(this.numerator instanceof Integer) {
		
		this.numerator = (T)(Integer.valueOf(numerator.intValue() * numerator.intValue()));
		this.denominator = (T)(Integer.valueOf(denominator.intValue() * denominator.intValue()));
		
		
	}else if(this.numerator instanceof Short) {
		
		this.numerator = (T)(Short.valueOf((short) (numerator.shortValue() * numerator.shortValue())));
		this.denominator = (T)(Short.valueOf((short) (denominator.shortValue() * denominator.shortValue())));
		
	}
		simplifyRational();
		
	}


	@Override
	public Number getNumerator() {
		// TODO Auto-generated method stub
		return numerator;
	}


	@Override
	public Number getDenominator() {
		// TODO Auto-generated method stub
		return denominator;
	}
	
	
	
	
	

}
