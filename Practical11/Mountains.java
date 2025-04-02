/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Mountains extends Biomes{
        private float altitude;
	Mountains(float temperature,int precipitation,int seaLevel,float altitude){
		super(temperature,precipitation,seaLevel);
		this.altitude=altitude;
	}
	public float getAltitude(){
		return altitude;
	}
}
