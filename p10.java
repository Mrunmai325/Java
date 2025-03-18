import java.util.Scanner;
class Game{
	String[][] layout;
	Game(int size){
		layout=new String[size][size];
		String num;
		String[] p=new String[size];
		for(int i=0; i<size; i++){
			p[i]=Integer.toString(i+1);
		}
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){  
				num=p[(int)(System.nanoTime()%size)];
			        while(!check(num, i, j)){
					num=p[(int)(System.nanoTime()%size)];
			        }
			        layout[i][j]=num;
			}
		}
		int length=Integer.toString(size).length();
		for(int i=size*size/3; i>0; i--){
			layout[(int)(System.nanoTime()%size)][(int)(System.nanoTime()%size)]=String.format("%" + length +"s", "");
		}
	}
		
	public static void main(String[] args){
		int size=Integer.parseInt(args[0]);
		Game s = new Game(size);
		s.displayGrid(size);
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(s.layout[i][j].equals(String.format("%"+Integer.toString(size).length()+"s", ""))){
					System.out.println("enter element at " + (i+1) + " row "+ (j+1) +" column");
					Scanner sc=new Scanner(System.in);
					s.layout[i][j]=sc.nextLine();
					s.displayGrid(size);
				}
			}
		}		
	}
	
	boolean check(String num, int row, int col){
		int i=row, j=col;
		while(j!=0){
			j-=1;
			if(layout[i][j]==num){
				return false;
			}
		}
		j=col;
		while(i!=0){
			i-=1;
			if(layout[i][j]==num){
				return false;
			}
		}
		return true;
	}
			
	void displayGrid(int size){
		String horizontal="_".repeat(Integer.toString(size).length());
		for(int ln=0; ln<=2*size; ln++){
			for(int sy=2*size; sy>=0; sy--){
				if(ln%2==0){
					if(sy%2!=0){
						System.out.print(horizontal);
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					if(sy%2==0){
						System.out.print("|");
					}
					else{
						System.out.print(layout[(ln-1)/2][(sy-1)/2]);
					}
				}
			}
			System.out.print("\n");
		}
	}
}	
