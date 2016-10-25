/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex.tester;

/**
 *
 */
public class HexTester {

      /**
       * A small program to increment through offsets for hexadecimal inputs.
       */
      public static void main(String[] args) {
            //hexArray stores each of the hexadecimal values from the stringArray.
            int[] hexArray;
            char[] asciiArray;
            int initialASCIIOffset = 30;
            int finalASCIIOffset = 50;
            
            //Hex strings to be analysed
            String[] stringArray = {"2D203B2237", "242F202F3C",
                        "2?3F2C3320","3B3539243E",
                        "312C292C3F","3A2A323834",
                        "203938313D","2E312C3128",
                        "3B2A273120","2F2E3D2535",
                        "373F223F22","293D293F2B",
                        "3427252B30","2637293036",
                        "27313F222C","35283D3C24",
                        "2336232C3E","20322A2732",
                        "2127292930","37292B323E",
                        "23373B2837","232E2A2C3A",
                        "3B31263F31","3E2A2B292A",
                        "3A37322025","3F243F2128",
                        "373231263F","3E3D312E29"};

            hexArray = new int[stringArray.length * 10];
            asciiArray = new char[hexArray.length/2];
            
            //Populate the hexArray with the numeric hexadecimal values of each character
            for(int i = 0; i < hexArray.length; i ++){
                  int stringArrayCount = (int) Math.floor(i/10);
                  char currentChar = stringArray[stringArrayCount].charAt(i%10);
                  hexArray[i] = Character.getNumericValue(currentChar);
            } 
             
            //Save pairs of hexadecimal values to ASCII values
            for (int x = 0; x < hexArray.length/2; x ++){  
                  int ASCIIValue = hexArray[2*x]*16 + hexArray[(2*x) + 1];
                  asciiArray[x] = (char) ASCIIValue;
            }
            
            //Increment between the initial and final offset, and print each offset's value.
            for(int ASCIIShift = initialASCIIOffset; ASCIIShift < finalASCIIOffset; ASCIIShift ++){
                  System.out.print("ASCII Shift = " + ASCIIShift + "   ");
                  
                  for(char charASCII : asciiArray){
                        System.out.print((char) (charASCII + ASCIIShift));
                  }
                  
                  System.out.println("\n");
            }
      }
      
}
