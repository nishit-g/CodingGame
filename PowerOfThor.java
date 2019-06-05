import java.util.Scanner;

public class PowerOfThor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        if(initialTY > lightY){
            if(initialTX == lightX){
                System.out.println("N");
                initialTY -=1;
            }
            else if ( initialTX > lightX ) 
            {
                System.out.println("NE");
                initialTX +=1;
                initialTY -=1;
            }
            else if (initialTX < lightX)
            {
                System.out.println("NW");
                initialTX-=1;
                initialTY-=1;
            }
        }
        else if (initialTY < lightY)
        {
            if(initialTX == lightX){
                System.out.println("S");
                initialTY +=1;
            }
            else if ( initialTX < lightX ) 
            {
                System.out.println("SE");
                initialTX +=1;
                initialTY +=1;
            }
            else if (initialTX > lightX)
            {
                System.out.println("SW");
                initialTX-=1;
                initialTY+=1;
            }
        }       
        else if (initialTY == lightY){
            if(initialTX < lightX){
                System.out.println("E");
                initialTX+=1;    
            }
            else if (initialTX > lightX){
                System.out.println("W");
                initialTX-=1;
            }
        }
        in.close();
    }
}