public class ACADgild_Assignment2 {
	public int add(int x,int y){
    	int carry;
    	while(y!=0){
    		
    		
    		carry=x&y;
    		System.out.println("carry :"+carry);
    		x=x^y;
    		y=carry<< 1;
    	   System.out.println("x :" +x +" y: "+y);
    	}
    	
    	return x;
    	
    }
    public static void main(String args[]){
    	ACADgild_Assignment2 a=new ACADgild_Assignment2();
    	int m=10;
    	int n=12;
    	int sum=a.add(m,n);
    	System.out.println("sum of :"+m+" & "+n+" is :"+sum);
    }
}


