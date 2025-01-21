import java.util.Arrays;
class Practical5{

static int a[]={8, 9, 10, 11};

  public static void main(String[] args){
      Practical5 p5=new Practical5();
      System.out.println(p5.factorial1(7));
      System.out.println(p5.factorial2(7));
      System.out.println(p5.factorial3(7));
      System.out.println(p5.getSum(a));
  }
  
  int factorial1(int number){
      if(number<0){
          return -1;
      }
      else{
          if(number<2){
              return 1;
          }
          else{
               int fact=2;    
               for(; number>2 ;){
                   fact*=number--;
               }
               return fact;
          }
      }
  }


  int factorial2(int number){
      if(number<0){
          return -1;
      }
      else{
          if(number<2){
              return 1;
          }
          else{
              int fact=2;    
                  while(number>2){
                     fact*=number--;
               }
               return fact;
          }
      }
  }


  int factorial3(int number){
      if(number<0){
          return -1;
      }
      else{
          if(number<2){
              return 1;
          }
          else if(number==2){
              return 2;
          }
          else{
              return number*factorial3(number-1);
          }
      }
  }
  
  
  int getSum(int[] a){
       if(a.length<1){
              return 0;
       }
       else if(a.length==0){
              return a[0];
       }
       else{
           int i=a.length-1;                            //or directly return a[0] + getSum(Arrays.copyOfRange(a,1,a.length))
           return a[i]+getSum(Arrays.copyOf(a,i));
       }
  } 
}  
