package com.interview.maze;

public class MazeProblem {
	 private static final int length = 10;
	 
	    private static boolean isSafeMove(int maze[][], int row, int column)
	    {
//	    	System.out.println("The value at ->"+row+","+column+" is "+maze[row][column]);
	    	 return (row >= 0 && row <length && column >= 0 &&
	                 column < length);
	    }
	    
	    private static boolean isValid(int x, int y,int shortestRoute[][],int maze[][])
	    {
	    	return !(maze[x][y] == 0 || shortestRoute[x][y] != 0);
	    }


	    // Find Shortest Possible Route

	    public static boolean  findShortestRoute(int maze[][], int row, int column,int shortestRoute[][])
	    {
	    	if (row == length - 1 && column == length - 1)
	        {
	            shortestRoute[row][column] = 1;
	            return true;
	        }
	 
	        // Check if maze[row][column] is valid
	        if (isSafeMove(maze, row, column) == true && isValid(row, column,shortestRoute,maze) )
	        {
	            
	            shortestRoute[row][column] = 1;
	 
	            /* Move forward direction */
	            if (findShortestRoute(maze, row + 1, column, shortestRoute))
	                return true;
	 
	            /* Move bottom direction*/
	            if (findShortestRoute(maze, row, column + 1, shortestRoute))
	                return true;
	            
	            /* Move left direction */
	            if (findShortestRoute(maze, row-1, column, shortestRoute)) {
	            	return true;
	            }
	            
	            /* Move up direction */
	            if (findShortestRoute(maze, row, column - 1, shortestRoute)) {
	            	return true;
	            }
	 
	            // Backtracing
	            shortestRoute[row][column] = 0;
	            return false;
	        }
	 
	        return false;
	    }

	    public static void main(String[] args)
	    {
	    	
	        int maze[][] =
	        {
	                { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
	                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	                { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
	                { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
	                { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
	                { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
	                { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
	                { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
	                { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
	                { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
	        };
	        int shortestRoute[][] =
		        {
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		        };

	        if (findShortestRoute(maze, 0, 0, shortestRoute) == false)
	        {
	            System.out.print("Destination doesn't exist from source");
	        }else {
	 
	        	System.out.println("Shortest route is ");
	            for (int i = 0; i < length; i++)
	            {
	                for (int j = 0; j < length; j++)
	                    System.out.print(" " + shortestRoute[i][j] +
	                                     " ");
	                System.out.println();
	            }
	        }
	        
	        
	    }
}
