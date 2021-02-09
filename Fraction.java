class Fraction {
   private int num, den;
   
   //constructors
   public Fraction() {
       this.num = 1;
       this.den = 2;
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
   
   //accessors
   public int getNum() {
       return this.num;
   }
   
   public int getDen() {
       return this.den;
   }
   
   public String toString() {
       return this.num + "/" + this.den;
   }
   
   public double toDouble() {
       double num = this.num;
       double den = this.den;
       return num / den;
   }
   
   //mutators
   public void reduce() {
    if (num != 0) {
       int gcf = GCF(num,den);
       num /= gcf;
       den /= gcf;
    }
   }
   
   public void setNum(int num) {
       this.num = num;
   }
   
   public void setDen (int den) {
       if (den != 0) this.den = den;
       else System.out.println("Error, denominator cannot be 0");
   }
   
   //Static methods
   public static Fraction multiply(Fraction a, Fraction b) {
       int newNum = a.num * b.num;
       int newDen = a.den * b.den;
       Fraction f = new Fraction(newNum, newDen);
       f.reduce();
       return f;
   }
   
   public static Fraction divide(Fraction a, Fraction b) {
       int newNum = a.num * b.den;
       int newDen = a.den * b.num;
       if (newDen == 0) {
           System.out.println("Error, denominator cannot be 0, set to 1");
           newDen = 1;
       }
       Fraction f = new Fraction(newNum, newDen);
       f.reduce();
       return f;
   }
   
   public static Fraction add(Fraction a, Fraction b) {
       int anewNum = a.num * b.den;
       int bnewNum = b.num * a.den;
       int anewDen = a.den * b.den;
       int bnewDen = b.den * a.den;
       Fraction f = new Fraction(anewNum + bnewNum, anewDen);
       f.reduce();
       return f;
   }
   
   public static Fraction substract(Fraction a, Fraction b) {
       int anewNum = a.num * b.den;
       int bnewNum = b.num * a.den;
       int anewDen = a.den * b.den;
       int bnewDen = b.den * a.den;
       Fraction f = new Fraction(anewNum - bnewNum, anewDen);
       f.reduce();
       return f;
   }
   
   //helpers
   private int GCF(int num , int den) {
     num = Math.abs(num);
     den = Math.abs(den);
       while (num != den) {
         if (num > den) num -= den;
         if (den > num) den -= num;
     }
     return num;
   }
}