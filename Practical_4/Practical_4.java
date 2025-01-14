class Practical_4
{


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


	
              public static String toXXSystem(String num, String XX)  
              {                                                                                                                              
                int decimal = 0;
                int rem = 0;
                if (num.startsWith("0b") || num.startsWith("0B")) {
                    int value = Integer.parseInt(num.substring(2)); 
                    int i = 0;
                    while (value > 0) 
                    {
                        rem = value % 10;
                        decimal=decimal+ rem * (int)Math.pow(2, i);
                        value = value/10;
                        i++;
                    }
                    if (XX.equalsIgnoreCase("o")) 
                    { 
                        String octal = "0";
                        while (decimal > 0) 
                        {
                            rem = decimal % 8;
                            octal =(Integer.toString(rem)).concat(octal); 
                            decimal= decimal/8;
                        }
                        return "0".concat(octal); 
                    } 
                    else if (XX.equalsIgnoreCase("h")) 
                    { 
                        String hex = "";
                        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        while (decimal > 0) 
                        {
                            rem = decimal % 16;
                            hex = (Integer.toString(hexDigits[rem])).concat(hex); 
                            decimal = decimal/16;
                        }
                        return "0x".concat(hex); 
                    } 
                    else 
                    { 
                        return Integer.toString(decimal);
                    }
                } 
                else 
                { 
                    return "Invalid input";
                } 
              }
   
  
   
             public static String toXXSystem(String decimal_str, String XX)
       {
            int decimal = Integer.parseInt(decimal_str);
            if (XX.equalsIgnoreCase("b")) 
            {
               String binary = "";
               while (decimal > 0) 
               {
                    binary = (String.valueOf(decimal % 2)).concat(binary); 
                    decimal=decimal/2; 
               }
               return "0b".concat(binary);
            } 
            else if (XX.equalsIgnoreCase("o")) 
            {
               String octal = "";
               while (decimal > 0) 
               {
                     octal = (String.valueOf(decimal % 8)).concat(octal); 
                     decimal=decimal/8; 
               }
               return "0".concat(octal);
            } 
            else if(XX.equalsIgnoreCase("h")) 
            {
               String hex = "";
               char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
               while (decimal > 0) 
               {
                     int remainder = decimal%16;
                     hex = (String.valueOf(hexDigits[remainder])).concat(hex); 
                     decimal=decimal/16; 
               }
               return "0x".concat(hex);
            } 
            else 
            {
               return "Invalid target system";
            }
       }



	
       public static String toXXSystem(String num, String XX)
       {
	  int decimal=0;
	  int ans=0;
	  if(num.startsWith("0") && num.compareTo("0")!=0)
	  {
	      int value=Integer.parseInt(num.substring(1));
	      int i = 0, rem=0;
        while (value > 0) 
        {
            rem = value % 10;
            decimal=decimal+ rem * (int)Math.pow(8, i);
            value = value/10;
            i++;
        }
	      if (XX.equalsIgnoreCase("b")) 
        { 
            String binary = "";
            while(decimal > 0) 
            {
                binary = (String.valueOf(decimal%2)).concat(binary); 
                decimal=decimal/2; 
            }
            return binary;
        }
        else if(XX.equalsIgnoreCase("h"))
        {
            String hex="";
            char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            while (decimal > 0) 
            {
                rem = decimal % 16;
                hex = (Integer.toString(hexDigits[rem])).concat(hex); 
                decimal = decimal/16;
            }
            return hex; 
        } 
        else 
        { 
            return Integer.toString(decimal);
        }
    } 
    else 
    { 
        return "Invalid input";
    } 
 }

	
}
	
	
