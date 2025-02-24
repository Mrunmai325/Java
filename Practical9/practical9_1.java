class Perform_1{
	public static void main(String[] args){
	
		long start, end, fact, time=0;
		int size=Integer.parseInt(args[0]);
		long[] arr=new long[size];
		
		for(int i=0; i<size; i++){
			arr[i]=System.nanoTime()%30 + 1;
		}
		for(int i=0; i<size; i++){
			start=System.nanoTime();
			if(arr[i]<2){
				fact=1;
			}
			else{
				fact=2;
				for(int j=3; j<=arr[i]; j++){
					fact=fact*j;
				}
			}
			end=System.nanoTime();
			time=time+(end-start);
		}
		System.out.println(time/size);
		
		time=0;
		
		for(int i=0; i<size; i++){
			start=System.nanoTime();
			fact(arr[i]);
			end=System.nanoTime();
			time=time+(end-start);
		}
		System.out.println(time/size);
		
	}
	
	static long fact(long num){
		if(num>=2){
			return num*fact(num-1);
		}
		return 1;
	}
}
