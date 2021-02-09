class FractionDriver {
    public static void main(String[] args) {
       Fraction frac = new Fraction();
       System.out.println(frac.toDouble());
       
       Fraction f1 = new Fraction(2,2);
       Fraction f2 = new Fraction(1,4);
       
       Fraction multiplied = Fraction.multiply(f1,f2);
       System.out.println(multiplied);
       
       Fraction f3 = new Fraction(1,2);
       Fraction f4 = new Fraction(1,4);
       Fraction divided = Fraction.divide(f3,f4);
       System.out.println(divided);
       
       Fraction f5 = new Fraction(3,2);
       Fraction f6 = new Fraction(1,4);
       Fraction added = Fraction.add(f5,f6);
       System.out.println(added);
       
       Fraction f7 = new Fraction(5,2);
       Fraction f8 = new Fraction(-3,4);
       Fraction substracted = Fraction.substract(f7,f8);
       System.out.println(substracted);
    }
}
