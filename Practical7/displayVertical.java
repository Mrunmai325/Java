class NameVertical{
    public static void main(String[] args){
    	NameVertical np=new NameVertical();
    	int size=2*Integer.parseInt(args[0]) + 3;
    	System.out.print(np.displayM(size));
    	System.out.print(np.displayR(size));
    	System.out.print(np.displayU(size));
    	System.out.print(np.displayN(size));
    	System.out.print(np.displayM(size));
    	System.out.print(np.displayA(size));
    	System.out.print(np.displayI(size));
    }

    String displayM(int size){
        for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(symbol==1 || symbol==size){
                    System.out.print("*");
                }
                else if(ln<=(size+1)/2 && ln==symbol){
                    System.out.print("*");
                }
                else if(ln<=(size+1)/2 && ln+symbol==size+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }



    String displayN(int size){
        for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(symbol==1 || symbol==size){
                    System.out.print("*");
                }
                else if(ln+symbol==size+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }



    String displayI(int size){
        for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(ln==size || ln==1){
                    System.out.print("*");
                }
                else if(symbol==(size+1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }


    String displayU(int size){
        for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(ln==size){
                    if(symbol==1 || symbol==size){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(symbol==1 || symbol==size){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }


    String displayA(int size){
        for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(ln==1){
                    if(symbol==1 || symbol==size){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(symbol==1 || symbol==size){
                    System.out.print("*");
                }
                else if(ln==(size+1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }


    String displayR(int size){
       for(int ln=1; ln<=size; ln++){
            for(int symbol=size; symbol>0; symbol--){
                if(symbol==size){
                    System.out.print("*");
                }
               else if(ln==1 || ln==(size+1)/2){
                    if(symbol==1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else if(ln<=size/2 && symbol==1){
                    System.out.print("*");
                }
                else if(ln>size/2 && symbol+ln==size+1){
                    System.out.print("*");
                }
                else{
                        System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        return "\n\n";
    }
}
