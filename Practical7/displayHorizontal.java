
class NameHorizontal{
	    public static void main(String[] args){
		          NameHorizontal name=new NameHorizontal();
		          int size =Integer.parseInt(args[0]);
		          if(size<0){
		                  return;
		          }
		          else{
		                  size=2*size+3;
		                  for(int ln=1; ln<=size; ln++){
		                          System.out.print(name.displayM(size, ln)+" "+name.displayR(size, ln)+" "+name.displayU(size, ln)+" "+name.displayN(size, ln)+" "+name.displayM(size, ln)
		                          +" "+name.displayA(size, ln)+" "+name.displayI(size, ln));
		                          System.out.print("\n");
		                  }
		          }
		          return;
	    }
	    
	    String displayM(int size, int ln){
              String pattern="";
              for(int symbol=size; symbol>0; symbol--){
                  if(symbol==1 || symbol==size){
                      pattern+="*";
                  }
                  else if(ln<=(size+1)/2 && ln==symbol){
                      pattern+="*";
                  }
                  else if(ln<=(size+1)/2 && ln+symbol==size+1){
                      pattern+="*";
                  }
                  else{
                      pattern+=" ";
                  }
              }
              return pattern;
      }
    
    
    String displayR(int size, int ln){
            String pattern="";
            for(int symbol=size; symbol>0; symbol--){
                if(symbol==size){
                    pattern+="*";
                }
               else if(ln==1 || ln==(size+1)/2){
                    if(symbol==1){
                        pattern+=" ";
                    }
                    else{
                        pattern+="*";
                    }
                }
                else if(ln<=size/2 && symbol==1){
                    pattern+="*";
                }
                else if(ln>size/2 && symbol+ln==size+1){
                    pattern+="*";
                }
                else{
                    pattern+=" ";
                }
            }
        return pattern;
    }
    
    
    String displayU(int size, int ln){
            String pattern="";
            for(int symbol=size; symbol>0; symbol--){
                if(ln==size){
                    if(symbol==1 || symbol==size){
                        pattern+=" ";
                    }
                    else{
                        pattern+="*";
                    }
                }
                else if(symbol==1 || symbol==size){
                    pattern+="*";
                }
                else{
                    pattern+=" ";
                }
            }
        return pattern;
    }
    
    
    String displayN(int size, int ln){
            String pattern="";
            for(int symbol=size; symbol>0; symbol--){
                if(symbol==1 || symbol==size){
                    pattern+="*";
                }
                else if(ln+symbol==size+1){
                    pattern+="*";
                }
                else{
                    pattern+=" ";
                }
            }
            return pattern;
    }
    
    
    String displayA(int size, int ln){
            String pattern="";
            for(int symbol=size; symbol>0; symbol--){
                if(ln==1){
                    if(symbol==1 || symbol==size){
                        pattern+=" ";
                    }
                    else{
                        pattern+="*";
                    }
                }
                else if(symbol==1 || symbol==size){
                    pattern+="*";
                }
                else if(ln==(size+1)/2){
                   pattern+="*";
                }
                else{
                    pattern+=" ";
                }
            }
        return pattern;
    }


    
    String displayI(int size, int ln){
            String pattern="";
            for(int symbol=size; symbol>0; symbol--){
                if(ln==size || ln==1){
                    pattern+="*";
                }
                else if(symbol==(size+1)/2){
                  pattern+="*";
                }
                else{
                    pattern+=" ";
                }
            }
            return pattern;
    }
}
