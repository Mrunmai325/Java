/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Forest extends Biomes{
    private int treeVariety;
	Forest(float temperature,int precipitation,int seaLevel,int treeVariety){
		super(temperature,precipitation,seaLevel);
		this.treeVariety=treeVariety;
	}
	public int getVariety(){
		return treeVariety;
	}
    
}
