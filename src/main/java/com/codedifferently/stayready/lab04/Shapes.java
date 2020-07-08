package com.codedifferently.stayready.lab04;

public class Shapes {
	
	public static void main (String args[]) {
		
		Shapes test = new Shapes();
		
		System.out.println(test.triangle());
		System.out.println(test.tableSquare());
		System.out.println(test.tableSquares(10));
		
		
	}

	
    public String triangle(){
    	
    	String result = "";
    	
        int n =5;
        
        int i, j;
        
        for(i = 0; i < n; i++){
        	
            for(j = 0; j<=i; j++)
            	
            {
                result+= "*";
            }
            
            result += "\n";
        }
        return result;
    }
    public String tableSquare(){
        int n = 4;
        int table[][] = new int[n][n];
        // get values
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                int val = (int) (x * y);
                table[x - 1][y - 1] = val;
            }
        }
        // Now print
        String result = "";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                result += String.format("%3d |", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        return result;
        
    }
    
    
    public String tableSquares(int n){
     
        int table[][] = new int[n][n];
        
        // get values
        for (int x = 1; x <= n; x++) {
        	
            for (int y = 1; y <= n; y++) {
            	
                int val = (int) (x * y);
                table[x - 1][y - 1] = val;
            }
        }
        // Now print
        String result = "";
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                result += String.format("%3d |", table[x - 1][y - 1]);
            }
            result += "\n";
        }
        return result;
    }
}
