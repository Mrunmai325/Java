class Perform_2{
  public static void main(String[] args){
    int size=Integer.parseInt(args[0]);
    String[] arr=new String[size];
    long time=0, start, end;
	  String s1="hello";
	  StringBuffer s2=new StringBuffer("hello");
	  StringBuilder s3=new StringBuilder("hello");
	  
    for(int i=0; i<size; i++){
      arr[i]=Long.toString(System.nanoTime()%1000);
    }
		  
	  for(int i=0; i<size; i++){
		  start=System.nanoTime();
		  s1.concat(arr[i]);
		  end=System.nanoTime();
		  time=time+(end-start);
	  }
	  System.out.println(time/args.length);
	  time=0;
			  
	  for(int i=0; i<size; i++){
		  start=System.nanoTime();
		  s2.append(arr[i]);
		  end=System.nanoTime();
		  time=time+(end-start);
	  }
	  System.out.println(time/size);
	  time=0;
	  
	  for(int i=0; i<size; i++){
		  start=System.nanoTime();
		  s3.append(arr[i]);
		  end=System.nanoTime();
		  time=time+(end-start);
	  }
	  System.out.println(time/size);
  }
}
