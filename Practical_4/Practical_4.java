class Practical_4
{

///////////////////////////////////////////////////////////////////////////////////////////


public int getBytes(int num){
	int ans;
	if(num>=0)
	{
		int temp=num/128;
		if(temp%2==0)
		{
			ans=num%128;
		}       
		else
		{
			ans=num%128-128;
		}
	}
	else
	{
		double temp=Math.floor(num/128);
		if(temp%2==0)
		{
			ans=num%128;
		}
		else if(temp%2!=0 && num%128==0)
		{
			ans=-128;
		}
		else
		{
			ans=num%128+128;
		} 
	}
	return ans;
}


//////////////////////////////////////////////////////////////////////////////////////////////

	int getShorts(int num)
	{
		int ans;
		if(num>=0)
		{
			int temp=num/32768;
			if(temp%2==0)
			{
				ans=num%32768;
			}
			else
			{
				ans=num%32768-32768;
			}
		}
		else
		{
			double temp=Math.floor(num/32768);
			if(temp%2==0)
			{
				ans=num%32768;
			}
			else if(temp%2!=0 && num%32768==0)
			{
				ans=-32768;
			}
			else
			{
				ans=num%32768+32768;
			}		
		}
		return ans;
	}

///////////////////////////////////////////////////////////////////////////////////////////////

	int getNumber(int num, String type)
	{	
		int ans;
		if(type.compareToIgnoreCase("byte")==0)
		{
			if(num>=0)
			{
				int temp=num/128;
				if(temp%2==0)
				{
					ans=num%128;
				}		
				else
				{
					ans=num%128-128;
				}
			}
			else
			{
				double temp=Math.floor(num/128);
				if(temp%2==0)
				{
					ans=num%128;
				}
				else if(temp%2!=0 && num%128==0)
				{
					ans=-128;
				}
				else
				{
					ans=num%128+128;
				}
			}
		}
		else
		{
			if(num>=0)
			{
				int temp=num/32768;
				if(temp%2==0)
				{
					ans=num%32768;
				}
				else
				{
					ans=num%32768-32768;
				}
			}
			else
			{
				double temp=Math.floor(num/32768);
				if(temp%2==0)
				{
					ans=num%32768;
				}
				else if(temp%2!=0 && num%32768==0)
				{
					ans=-32768;
				}
				else
				{
					ans=num%32768+32768;
				}		
			}
		}
		return ans;
	}	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                                                                                                                                                                              
public static String toXXSystem(String num, String XX) {                                                                                                                              
   ...>         int sum = 0;
   ...>         int rem = 0;
   ...>         if (num.startsWith("0b") || num.startsWith("0B")) {
   ...>             int value = Integer.parseInt(num.substring(2), 2); 
   ...>             int i = 0;
   ...>             while (value > 0) {
   ...>                 rem = value % 2;
   ...>                 sum += rem * Math.pow(2, i);
   ...>                 value /= 2;
   ...>                 i++;
   ...>             }
   ...>             if (XX.equalsIgnoreCase("O")) { 
   ...>                 String octal = "";
   ...>                 while (sum > 0) {
   ...>                     rem = sum % 8;
   ...>                     octal = octal.concat(Integer.toString(rem)); 
   ...>                     sum /= 8;
   ...>                 }
   ...>                 return octal; 
   ...>             } else if (XX.equalsIgnoreCase("H")) { 
   ...>                 String hex = "";
   ...>                 char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   ...>                 while (sum > 0) {
   ...>                     rem = sum % 16;
   ...>                     hex = hex.concat(String.valueOf(hexDigits[rem])); 
   ...>                     sum /= 16;
   ...>                 }
   ...>                 return hex; 
   ...>             } else { 
   ...>                 return Integer.toString(sum);
   ...>             }
   ...>         } else { 
   ...>             return "Invalid input";
   ...>         }                                                                                                                                                                            
   ...>     }
   
   /--------------------------------------------------------------------------------------/
   
   public static String toXXSystem(String decimal_str, String XX)
   ...> 
   ...>             int decimal = Integer.parseInt(decimal_str);
   ...> 
   ...>             if (XX.equalsIgnoreCase("B")) {
   ...>                 String binary = "";
   ...>                 while (decimal > 0) {
   ...>                     binary = binary.concat(String.valueOf(decimal % 2)); 
   ...>                     decimal /= 2; 
   ...>                 }
   ...>                 return "0b".concat(binary);
   ...>             } else if (XX.equalsIgnoreCase("O")) {
   ...>                 String octal = "";
   ...>                 while (decimal > 0) {
   ...>                     octal = octal.concat(String.valueOf(decimal % 8)); 
   ...>                     decimal /= 8; 
   ...>                 }
   ...>                 return "0".concat(octal);
   ...>             } else if (XX.equalsIgnoreCase("H")) {
   ...>                 String hex = "";
   ...>                 char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   ...>                 while (decimal > 0) {
   ...>                     int remainder = decimal % 16;
   ...>                     hex = hex.concat(String.valueOf(hexDigits[remainder])); 
   ...>                     decimal /= 16; 
   ...>                 }
   ...>                 return "0x".concat(hex);
   ...>             } else {
   ...>                 return "Invalid target system";
   ...>             }
   ...>         
   ...> }
/---------------------------------------------------------------------------------------/

	
	
	
