//David Galaydick
//CSE2
//12/5/2014

//description

public class MatrixSorter{
    
    //a method that assembles the array
    public static int [][][] buildMat3d(){
        
        int array[][][] = new int [3][][];
        
        //puts together a 3D array where each slab has 
        //Slab*2 + 3 rows with
        //Slab + Row# + 1
        for (int s = 0; s < 3; s++){
            
            array [s] = new int [(s*2) + 3][];
            
            for (int j = 0; j < ((s*2) + 3); j++){
                
                array[s][j] = new int [s + j + 1];
                
            }
            
        }
        
        //fills every member of the array with 
        for (int s = 0; s < 3; s++){
            for (int j = 0; j < ((s*2) + 3); j++){
                for (int i = 0; i < (j+s+ 1); i++){
                    array[s][j][i] = (int)((Math.random()*99) + 1);
                }
            }
        }
        
        return array;
        
    }
    
    //method that prints a 3D array
    public static void show (int array [][][]){
        
        //fills every member of the array with 
        for (int s = 0; s < 3; s++){
            
            System.out.println("Slab" + (s + 1));
            System.out.println("------------------------------------------");
            
            for (int j = 0; j < ((s*2) + 3); j++){
                for (int i = 0; i < (j+s+ 1); i++){
                    System.out.print(array[s][j][i] + " ");
                }
                System.out.println();
            }
            
            System.out.println();
        }
        
    }
    
    //a method that finds the minimum value in the matrix
    public static int findMin(int array [][][]){
        
        //starts by assuming that the very first value is the min
        int min = array[0][0][0];
        
        for (int s = 0; s < 3; s++){
            for (int j = 0; j < ((s*2) + 3); j++){
                for (int i = 0; i < (j+s+ 1); i++){
                    //any lower values it finds become the new min
                    if (array[s][j][i] < min) min = array[s][j][i];
                }
            }
        }
        
        return min;
        
    }
    
    //sorts a two dimensional array
    public static void sort(int array[][]){
        
        int temp = 0;
        int lower = 0;
        
        //selection sorting the rows
        for (int i = 0; i < 5; i++){
            
            for (int k = 0; k < array[i].length; k++){
                
                lower = k;
                
                for (int c = k + 1; c < array[i].length; c++){
                    
                    if (array[i][lower] > array[i][c]) lower = c;
                    
                }
                
                //switching the values that need to be switched
                temp = array[i][k];
                array[i][k] = array[i][lower];
                array[i][lower] = temp;
                
                
            }
        }
        
        
        //I was only able to figure out how to insertion sort a collumn, not how to swap around 
        //the rows
        
        //10:53 - not happening, here's the next best thing
        
        
        //selecting the collumn to work with
        for (int c = 0; c < array[0].length; c++){
            
            //going down the collumn
            for (int i = 1; i < array.length; i++){
                
                //checking if current value is less than the one to its left
                if (array[i][0] < array[i - 1][0]){
                    
                    //if it is, start switching and everything beneath until the lowest is on the bottom
                    for (int j = i; j >= 1; j--){
                        
                        if (array[j][0] < array[j - 1][0]){
                            
                            //switching the values that need to be switched
                            temp = array[j][0];
                            array[j][0] = array[j - 1][0];
                            array[j - 1][0] = temp;
                            
                        }// end of if statement
                        
                    }//end of switching for loop
                    
                }//end of making sure switching is necessary if statement
                
            }//end of going down collumn loop
            
        }
        
        return;
        
    }
        
    
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
}