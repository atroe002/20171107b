import java.util.Random;

// C:\Users\alejandrotroetschjr\Documents\NetBeansProjects

public class Lab8BinaryTest 
{

    public static void main(String[] args) 
    {
        Lab8 myLab = new Lab8();
        
        //myLab.makeBinaryInteger(10);
        
        Random rand = new Random();
        System.out.println("--------------- Part 1 ---------------");
        for(int i=0; i < 10; i++) 
        {
            Integer n = rand.nextInt(100);
            myLab.makeBinaryInteger(n);
        }
        
        System.out.println("\n---------------- Part 2 ---------------");
        //myLab.showThreeOnes();
    }
}
