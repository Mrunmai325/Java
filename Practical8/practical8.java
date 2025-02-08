class PatternPrinting{
  public static void main(String[] args){
	  PatternPrinting p=new PatternPrinting();
	  System.out.print("-----------------------------------------------------\n");
	  p.DisplayPattern1(2);
	  System.out.print("-----------------------------------------------------\n");
	  p.DisplayPattern2(2);
	  System.out.print("-----------------------------------------------------\n");
	  p.DisplayPattern3(2);
	  System.out.print("-----------------------------------------------------\n");
	  p.DisplayPattern4(2);
	  System.out.print("-----------------------------------------------------\n");
  }
  
/*------------------------------------------------------------------------------------*/
  
  void DisplayPattern1(int size){
          Lines1(1,size);
          return;
  }
  void Lines1(int ln, int size){
	  if(ln<size+1){
	  	Stars1(ln);                                      // *
	  	System.out.print("\n");                          // **
	  	Lines1(ln+1, size);                              // ***
	  }                                                  // ****  size=3
	  Stars1(ln);                                        // ***
	  System.out.print("\n");                            // **
	  return;                                            // *
  }
  void Stars1(int ln){
	  if(ln>0){
	  	System.out.print("*");
	  	Stars1(ln-1);
	  }
	  return;
  } 

/*-------------------------------------------------------------------------------------*/

  void DisplayPattern2(int size){
    Lines2(1,size);
    return;
  }
  void Lines2(int ln, int size){
	  if(ln<=size){
	  	Space2(size-ln+1);
	  	Stars2(ln);
	  	System.out.print("\n");
	  	Lines2(ln+1, size);
	  }
	  if(ln==size+1){
	  	Plus2(ln);
	  	System.out.print("\n");
	  	return ;
	  }
	  Space2(size-ln+1);
	  Slash2(ln);
	  System.out.print("\n");
	  return;
  }                                                        //     *
  void Space2(int space){                                  //    **
	  if(space>0){                                           //   ***
	  	System.out.print(" ");                               //  ++++  size=3
	  	Space2(space-1);                                     //   ///
	  }                                                      //    //
	  return;                                                //     /
  } 
  void Stars2(int ln){
	  if(ln>0){
	  	System.out.print("*");
	  	Stars2(ln-1);
	  }
	  return;
  }
  void Plus2(int plus){
  	if(plus>0){
  		System.out.print("+");
  		Plus2(plus-1);
  	}
  	return;
  }		
  void Slash2(int slash){
  	if(slash>0){
  		System.out.print("/");
  		Slash2(slash-1);
  	}
  	return;
  }

 /*-----------------------------------------------------------------------------------------------*/
 
  void DisplayPattern3(int size){
    size=2*size-1;
	  PatternStar(1, size);
	  PatternPlus(1, size);
	  return;
  }
  void PatternStar(int ln, int size){
	  if(ln<=size/2){
	  	Space3((size+1)/2-ln);
	  	Star3(2*ln-1);
	  	System.out.print("\n");
	  	PatternStar(ln+1, size);
	  }
	  Space3((size+1)/2-ln);
	  Star3(2*ln-1);
	  System.out.print("\n");
	  return;
  }
  void Space3(int spaces){
    if(spaces>0){
      System.out.print(" ");
      Space3(spaces-1);                                              //     *
    }                                                                //    ***
    return;                                                          //   *****
  }                                                                  //    ***
  void Star3(int stars){                                             //     *    size=3
    if(stars>0){                                                     //     +
      System.out.print("*");                                         //     +
      Star3(stars-1);                                                //     +
    }                                                                //     +
    return;                                                          //     +
  }
  void PatternPlus(int ln, int size){
    if(ln<=size){
      Space_3((size+1)/2-1);
      System.out.print("+\n");
      PatternPlus(ln+1, size);
    }
    return;
  }
  void Space_3(int spaces){
    if(spaces>0){
      System.out.print(" ");
      Space_3(spaces-1);
    }
    return;
  }
  
/*-------------------------------------------------------------------------------------*/
  
  void DisplayPattern4(int size){
    Lines4(1, size);
    return;
  }
  void Lines4(int ln, int size){
    if(ln<size){
      Space4(size-ln);
      Pattern4(ln, 2*ln-1);
      System.out.print("\n");
      Lines4(ln+1, size);
    }
    if(ln==size){
      Pattern4(ln, 2*ln-1);
      System.out.print("\n");                                           //      *
    }                                                                   //     ///
    Space4(size-ln);                                                    //    *****   size=3
    Pattern4(ln+1, 2*ln-1);                                             //    /////
    System.out.print("\n");                                             //     ***
    return;                                                             //      /
  }
  void Space4(int space){
    if(space>0){
      System.out.print(" ");
      Space4(space-1);
    }
    return;
  }
  void Pattern4(int ln, int symbol){
    if(symbol>0){
      if(ln%2!=0){
        System.out.print("*");
        Pattern4(ln, symbol-1);
      }
      else{
        System.out.print("/");
        Pattern4(ln, symbol-1);
      }
    }
    return;
  }
  
/*-------------------------------------------------------------------------------------------*/

}
