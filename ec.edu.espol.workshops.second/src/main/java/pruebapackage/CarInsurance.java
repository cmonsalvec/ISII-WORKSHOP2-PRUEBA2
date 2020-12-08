package pruebapackage;

public class CarInsurance {
	private char Gen;
	private char Marry;
	private int Age;
	private int base = 700;
	private int premium;
	
	public void setGen(char gen) {
		if ((gen == 'f') || (gen == 'm')) {
			Gen = Character.toUpperCase(gen);
		}else if ((gen == 'F') || (gen == 'M')) {
			Gen = gen;
		}else System.out.println("Gender only can be F or M");
	}
	
	public void setMarry(char marry) {
		if ((marry == 'y') || (marry == 'n')) {
			Marry = Character.toUpperCase(marry);
		}else if ((marry == 'Y') || (marry == 'N')) {
			Marry = marry;
		}else System.out.println("Marry state only can be Y(Yes) or N(Not)");
	}

	public void setAge(int age) {
		if ((age < 0) || (age > 80)) {
			System.out.println("Age should be upper 0 and lower 80");
		}else Age = age;
	}

	public void CalculatePremium(){
			if ((Age < 25) && (Gen == 'M') && (Marry == 'N')) {
				premium = base + 1500;
			} else if ((Gen == 'F') || (Marry == 'Y')) {
					premium = base - 200;
				}else if ((Age >= 45) || (Age < 65)){
					premium = base - 100;
				}else 
					premium =  (-1);			
	}
	public int getPrevium() {
		return premium;
	}
}

