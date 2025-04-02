/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class BiomesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sunderbans forest1=new Sunderbans(20.0f,1500,98,876);
	Gir forest2=new Gir(42.7f,800,94,342);
	Himalays mountain1=new Himalays(-10.0f,1000,4000,3500.0f);
	Thar desert1=new Thar(45.0f,100,300,80.0f);
	System.out.println(forest1.getClass() + "\n" + forest1 + "\n");
	System.out.println(forest2.getClass() + "\n" + forest2 + "\n");
	System.out.println(mountain1.getClass() + "\n" + mountain1 + "\n");
	System.out.println(desert1.getClass() + "\n" + desert1 + "\n");
    }
    
}
