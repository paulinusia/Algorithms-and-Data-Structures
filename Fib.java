
import java.util.*;
import java.math.*;

public class Fib
{
     BigInteger F1= new BigInteger("1");
     BigInteger F2= BigInteger.ONE;
     BigInteger F3 = BigInteger.ONE;
     BigInteger val = BigInteger.ONE;
     BigInteger current = new BigInteger("0");

     public String iterFib3 (int n) {
         BigInteger[] series = new BigInteger[n];
         
         if (n<0) return "error";
             for(int i=0; i<n; i++){
                if(i<3) {
             series[i] = val; 
             
        }else{ 
                current = F1.add(F2).add(F3);
                F1 = F2;
                F2 = F3;
                F3 = current;
                series[i] = current;
                
                }
           
        }
        //System.out.println(Arrays.toString(series));
            return series.toString();
    } 

    public String recFib3(int n){
        if (n<0) return "error";
        if (n<3){ 
            return val.toString();
        }else{ 
          return recFib3(n-1) + recFib3(n-2) + recFib3(n-3);
    }
} 
}


