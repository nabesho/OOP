public class Ratio {
    private long num;    
    private long denom;  

    public Ratio(long num, long denom) {
        if (denom < 0) {
            num *= -1;
            denom *= -1;
        }
        long g = gcd(num, denom);    
        this.num = num / g;
        this.denom = denom / g;
    }

    private long gcd(long p, long q) {
      
    if(q == 0){
         return p;
    }else{
    return gcd(q, p % q);
        }
    }
    private Ratio multiply(long num, long denom) {
        long n = this.num * num ;
        long d = this.denom * denom ;
        return new Ratio(n, d);
    }
    private  Ratio add(long num, long denom) {
        long n = this.num * denom + num * this.denom ;
        long d = this.denom * denom ;
        return new Ratio(n, d);
    }

    public double doubleValue() {
        return (double)num / (double)denom;
    }

    public String toString() {
        if (denom == 1) {
            return Long.toString(num);
        } else {
            return num + "/" + denom;
        }
    }
    public boolean equals(Object obj) {
        if (obj instanceof Ratio) {
            Ratio r = (Ratio)obj;
            return denom == r.denom && num == r.num;
        } else {
            return false;
        }
    }

    public Ratio add(Ratio r) {
        return add(r.num, r.denom);
    }
    public Ratio subtract(Ratio r) {
        return add(-r.num,r.denom); 
    }
    public Ratio multiply(Ratio r) {
        return multiply(r.num, r.denom);
    }
    public Ratio divide(Ratio r) {
        return multiply(r.denom,r.num);
    }

    public Ratio add(long i) {
        return add(i, 1);
    }
    public Ratio subtract(long i) {
        return add(-i, 1);
    }
    public Ratio multiply(long i) {
        return multiply(i, 1);
    }
    public Ratio divide(long i) {
        return multiply(1, i) ;
    }
}
