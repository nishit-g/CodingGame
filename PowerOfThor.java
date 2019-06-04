import java.util.Scanner;

public class PowerOfThor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

         if (initialTX < lightX)
        {
            if(initialTY == lightY){
                System.out.println("E");
            }
            else if(initialTY < lightY)
            {
                System.out.println("NE");
            }
            else
            {
                System.out.println("SE");
            }
        }
        else if(initialTX > lightX)
        {
            if(initialTY == lightY)
            {
                System.out.println("W");
            }
            else if(initialTY < lightY)
            {
                System.out.println("NW");
            }
            else 
            {
                System.out.println("SW");
            }
        }
        else if(initialTY < lightY){
            if(initialTX == lightX){
                System.out.println("N");
            }
            else if (initialTX < lightX)
            {
                System.out.println("NE");
            }else {
                System.out.println("NW");
            }
        }
        else
        {
            if(initialTX == lightX){
                System.out.println("S");
            }
            else if (initialTX < lightX)
            {
                System.out.println("SE");
            }else {
                System.out.println("SW");
            }
        }
    }
}