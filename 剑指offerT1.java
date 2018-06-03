public class ½£Ö¸offerT1 {
    public static boolean Find(int target, int [][] array) {
    	if(array==null||array.length==0||(array.length==1&&array[0].length==0)) return false;
    	
    	boolean find = false;
    	for (int i=0;i<array.length;i++){
    		if(array[i][0]>target)
    			return false;
			if(array[i][array[i].length-1]<target)
				continue;
			
    		for(int j=0;j<array[i].length;j++){
    			if(array[i][j]==target)
    				return true;
    		}
    	}
    	return find;
    }
    public static void main(String[] args) {
    	int a[][] = {{}};
    	System.out.println(a[0].length);
    	
    	
		System.out.println(Find(1,a));
	}
    
    
}