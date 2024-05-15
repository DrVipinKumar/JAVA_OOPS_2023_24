import sum.Sum;
import mul.Multiply;
import cal.Div;
import cal.Sub;
class Calc
{
public static void main(String args[]){
 Sum s1 =new Sum();
 s1.getSum(23,45);
 Multiply m1 =new Multiply();
 m1.getMultiply(23,45);
 Div d1 =new Div();
 d1.getDiv(100,2);
 Sub sb1=new Sub();
 sb1.getSub(12,4);
}
}