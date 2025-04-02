/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Biomes {
        private float temperature;
	private int precipitation;
	private int seaLevel;
	Biomes(float temperature,int precipitation,int seaLevel){
		this.temperature=temperature;
		this.precipitation=precipitation;
		this.seaLevel=seaLevel;
	}
	public float getTemperature(){
		return temperature;
	}
	public int getPrecipitation(){
		return precipitation;
	}
	public int getSeaLevel(){
		return seaLevel;
	}
}
