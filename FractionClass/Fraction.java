class Fraction {
   private int num, den;
   
   public Fraction() {
       this.num = 1;
       this.den = 1;
   }
   
   public Fraction(int n, int d) {
       this.num = n;
       if (d != 0) this.den = d;
       else {
           System.out.println("Error, denominator cannot be 0");
           this.den = 1;
       }
   }
   
   public Fraction(String f) {
       int slash = f.indexOf("/");
       this.num = Integer.parseInt(f.substring(0,slash));
       this.den = Integer.parseInt(f.substring(slash+1));
       if (den == 0) {
           System.out.println("Error, denominator cannot be 0");
           den = 1;
       }
   }
   
   public Fraction(Fraction f) { 
       this.num = f.num;
       this.den = f.den;
   }
}
