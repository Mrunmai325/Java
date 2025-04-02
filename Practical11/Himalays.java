/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Himalays extends Mountains{
        Himalays(float temperature,int precipitation,int seaLevel,float altitude){
		super(temperature,precipitation,seaLevel,altitude);
	}

    /**
     *
     * @return
     */
    @Override
	public String toString(){
		return "Temperature: " + getTemperature() + "\nPrecipitation: " + getPrecipitation() + "\nSeaLevel: " + getSeaLevel() + "\nAltitude: " + getAltitude();
	}
}
