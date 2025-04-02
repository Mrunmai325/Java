/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biomesexample;

/**
 *
 * @author mrunmai_wadgaonkar
 */
public class Thar extends Deserts{
        Thar(float temperature,int precipitation,int seaLevel,float evaporationRate){
		super(temperature,precipitation,seaLevel,evaporationRate);
	}
        @Override
	public String toString(){
		return "Temperature: " + getTemperature() + "\nPrecipitation: " + getPrecipitation() + "\nSeaLevel: " + getSeaLevel() + "\nEvaporation Rate: " + getEvaporationRate();
	}
}
