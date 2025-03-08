class Game{
	static String[][] layout;
	Game(int size){
		layout=new String[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				layout[i][j]="";
			}
		}
		int digits=Integer.toString(layout.length).length();
		layout=getElements(digits, layout);
		layout=removeElements(digits, layout);
	}
		
	public static void main(String[] args){
		int size=Integer.parseInt(args[0]);
		Game s = new Game(size);
		s.displayGrid(size, layout);
	}	
			
	void displayGrid(int size, String[][] layout){
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
				
	String[][] getElements(int digits, String[][] layout){
		for(int i=0; i<layout.length; i++){
			for(int j=0; j<layout.length; j++){
				layout[i][j]=String.format("%" + digits +"s",(i+j)%layout.length+1);
			}
		}
		return layout;
	}


	String[][] removeElements(int digits, String[][] layout){
		int s=(layout.length)*(layout.length)/3;
		for(int i=1; i<=s; i++){
			layout[(int)(System.nanoTime()%layout.length)][(int)(System.nanoTime()%layout.length)]=String.format("%"+digits+"s", "");
		}
		return layout;
	}
}	
