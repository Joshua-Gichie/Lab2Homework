
public class Driver {
	
	public static void main (String[] args) {
		IterativeMathLib iterationLibrary= new IterativeMathLib();
		
		RecursiveMathLib recursiveLibrary = new RecursiveMathLib();
		System.out.println("---- Recursion ---");
		runTestCode(recursiveLibrary);
		
		System.out.println("----Iteration-----");
		runTestCode(iterationLibrary);
		
		
	}
	public static void runTestCode(MathLib library) {
		System.out.println("GCD(4,2)="+library.gc(4,2));
	}
	
	public static int GCDRecursion (int x,int y)
	{
		if (y==0)
		    return (x);
		  else
			  if (x>= y && x!=0)
		    return  (y,x %y));
	}
	
	public static int GCDIteration (int x, int y) {
		
	while(y==0) {
		return (x);
		
			
			
	}
		while (x>=y && x!=-0)
			return (y ,x % y);
	}

	
	
     public static int AckRecursion(int x, int y) {
    	 if(x==0)
    		 return y +1;
    	 else
    		 if(y==0)
    			 return (x-1)+x;
    		 else
    			 if(y!=0 && x!=0)
    				 return(x-1)Ack(x, y-1));
}
     public static int AckIteration(int x, int y) {
    	while(x==0)
    		 return y +1;
    	 while
    		 (y==0)
    			 return (x-1)+x;
    		 while(y!=0 && x!=0)
    				 return(x-1)Ack(x, y-1));
}
     public static int FibRecursion(int x, int y) {
    	 if(x==0)
    		 return 1;
    	 else
    		 if(y==0)
    			 return (x-1),x));
    		 else
    			 if(x>1)
    				 return FibRecursion(x-1)+ FibRecursion(x-2);
}
     
     
     public static int FibIteration(int x, int y) {
    	 while(x==0) {
    		 return 1;}
    	
    		 while(y==0) {
    			 return (x-1);(x);}
    		 while
    			 (x>1) {
    				 return FibIteration(x-1)+ FibIteration(x-2);}
}
     public static int HanoiR(int n) {
    	 if(n==1)
    		 return 1;
    	 else 
    		 if (n>1)
    		 return HanoiR((n-1)+1);
}
     public static int HanoiIt(int n) {
    	 int count =0;
     
    	 for(n=1; count>n; n++);{
    		 return count +1;
    
    		
    		 return HanoiIt((n-1)+1);
}
     }}
