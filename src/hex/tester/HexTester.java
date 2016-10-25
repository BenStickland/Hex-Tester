/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex.tester;

/**
 *
 * @author surface
 */
public class HexTester {

      /**
       * @param args the command line arguments
       */
      public static void main(String[] args) {
            // TODO code application logic here
            int[] hexArray;
            
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
            
            char[] asciiArray;
            asciiArray = new char[hexArray.length/2];
            
            for(int i = 0; i < stringArray.length*10; i ++){
                  int StringArrayCount = (int) Math.floor(i/10);
                  char ch = stringArray[StringArrayCount].charAt(i%10);
                  hexArray[i] = Character.getNumericValue(ch);
                  
                  //System.out.println(i + " Character value =" + hexArray[i]);
            } 
            
            for(int ASCIIShift = 30; ASCIIShift < 90; ASCIIShift ++){
                  System.out.println("ASCII Shift =" + ASCIIShift + "\n");
                  for (int x = 0; x < hexArray.length/2; x ++){
                        //System.out.println("x =" + x + " Hex values =" + hexArray[2*x] + " " + hexArray[(2*x)-1]);   
                        int ASCIIValue= hexArray[2*x]*16 + hexArray[(2*x) + 1] + ASCIIShift;
                        asciiArray[x] = (char) ASCIIValue;
                  }

                  for(int i = 0; i < asciiArray.length; i ++){
                        System.out.print(asciiArray[i]);
                  }
                  
            }
      }
      
}
