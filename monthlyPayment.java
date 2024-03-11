
class monthlyPayment 
{
    double calcPayment(double P,double Y,double R)
    {
        double n=12*Y;
        double r=R/(12*100);
        return P*r/(1-Math.pow(Double.valueOf(1+r), Double.valueOf(-n)));
    }
    public static void main(String[] args) 
    {
        monthlyPayment mp=new monthlyPayment();
        System.out.println(mp.calcPayment(100000, 5, 10));
    }
}
