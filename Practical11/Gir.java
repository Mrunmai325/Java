/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Gir extends Forest{
        Gir(float temperature,int precipitation,int seaLevel,int treeVariety){
		super(temperature,precipitation,seaLevel,treeVariety);
	}

    /**
     *
     * @return
     */
    @Override
	public String toString(){
		return "Temperature: " + getTemperature() + "\nPrecipitation: " + getPrecipitation() + "\nSeaLevel: " + getSeaLevel() + "\nTree Variety: " + getVariety();
	}
}
