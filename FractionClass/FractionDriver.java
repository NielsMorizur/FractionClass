class FractionDriver {
    public static void main(String[] args) {
       Fraction frac = new Fraction();
       System.out.println(frac);
       
       Fraction f1 = new Fraction(-4,2);
       Fraction f2 = new Fraction(1,4);
       
       Fraction answer = Fraction.multiply(f1,f2);
       System.out.println(answer);
    }
}
