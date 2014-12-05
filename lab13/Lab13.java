public class Lab13 {
    
    public static void array_print(int array[][]){
        
        
        
        for (int i = 0; i < 5; i++){
            
            for (int k = 0; k < array[i].length; k++){
                System.out.print(array[i][k]+ " ");
            }
            
            System.out.println();
            
        }
        
    }
    
    public static void main(String[] args){
        
        int lower = -1;
        int temp = -1;
        
        int array [] [] = new int [5] [];
        
        for (int i = 0; i < 5; i++) {
            
            array [i] = new int [i*3 + 5];
            
        }
        
        for (int i = 0; i < 5; i++){
            
            for (int k = 0; k < array[i].length; k++){
                array[i][k]= (int)(40*Math.random());
            }
            
        }
        
        array_print(array);
        
        //selection sorting
        for (int i = 0; i < 5; i++){
            
            for (int k = 0; k < array[i].length; k++){
                
                lower = k;
                
                for (int c = k + 1; c < array[i].length; c++){
                    
                    if (array[i][lower] > array[i][c]) lower = c;
                    
                }
                
                temp = array[i][k];
                array[i][k] = array[i][lower];
                array[i][lower] = temp;
                
                
            }
        }
        
        System.out.println();
        
        array_print(array);
        
    }
    
}