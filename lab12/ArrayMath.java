


public class ArrayMath{
    
    public static double[] addArrays(double [] A, double [] B){
    
    double x = 0.0;
    double y = 0.0;
    double z = 0.0;
    
    double output[];
    
    if (A.length >= B.length){
        
        output = new double [A.length];
        
        for (int i = 0; i < A.length; i++){
            
            x = A[i];
            
            if (i >= B.length) y = 0.0;
            else y = B[i];
            
            z = x + y;
            
            output[i] = z;
            
    }
    }
    
    else {
        
        output = new double [B.length];
        
        for (int i = 0; i < B.length; i++){
            
            x = B[i];
            
            if (i >= A.length) y = 0.0;
            else y = A[i];
            
            z = x + y;
            
            output[i] = z;
            
        }
    }
    
    return output;
    
}

public static Boolean equals (double A[], double B[]){
    
    if (A.length != B.length) return false;
    
    for (int i = 0; i < A.length; i++){
    
        if (A[i] != B[i]) return false;
    
    }
    
    return true;
    
}
    
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}

//output:

/*OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}*/