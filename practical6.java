class Practical6{

    void displayPattern1(int size){
            for(int ln=1;ln<=2*size-1;ln++){                          //  +
            int lines=ln;                                             // +++
                if(ln>size){                                          //+++++    for size=3
                    ln=size*2-ln;                                     // +++
                }                                                     //  +
                for(int space=size-ln; space>0;space--){
                    System.out.print(" ");
                }
                for(int plus=2*ln-1;plus>0;plus--){
                    System.out.print("+");
                }
                ln=lines;
                System.out.print("\n");
            }
    }


    void displayPattern2(int size){
        for(int ln=1;ln<=2*size-1;ln++){
            int lines=ln;
            if(lines>size){
                lines=2*size-lines;
            }                                                      //  +
            for(int space=size-lines;space>0;space--){             // + +
                System.out.print(" ");                             //+ + +    for size=3
            }                                                      // + +
            for(int symbol=2*lines-1;symbol>0;symbol--){           //  +
                if(symbol%2!=0){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    void displayPattern3(int size){
        for(int ln=1;ln<=2*size;ln++){
            int lines=ln;
            if(lines>size){
                lines=2*size+1-lines;                                 //  +
            }                                                         // *+*
            for(int space=size-lines; space>0; space--){              //+*+*+    for size=3
                System.out.print(" ");                                //*+*+*
            }                                                         // +*+
            for(int symbol=2*lines-1; symbol>0; symbol--){            //  *
                if(symbol%2 == ln%2){
                    System.out.print("*");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args){
        Practical6 ps=new Practical6();
        ps.displayPattern1(7);
        System.out.print("\n\n");
        ps.displayPattern2(7);
        System.out.print("\n\n");
        ps.displayPattern3(7);
        System.out.print("\n\n");
    }
}
