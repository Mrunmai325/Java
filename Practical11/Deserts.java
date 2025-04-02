/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Deserts extends Biomes{
        private float evaporationRate;
	Deserts(float temperature,int precipitation,int seaLevel,float evaporationRate){
		super(temperature,precipitation,seaLevel);
		this.evaporationRate=evaporationRate;
	}
	public float getEvaporationRate(){
		return evaporationRate;
	}
}
