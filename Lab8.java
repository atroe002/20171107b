import java.math.BigInteger;

public class Lab8 
{
    public void makeBinaryInteger(Integer n)
    {
        byte[] binary = new byte[16];
        int index = 0;
        
        System.out.print(n + " - ");
        
        
        while (n > 0)
        {
            binary[index++] = (byte) (n % 2);
            n = n / 2;
        }
        
        for (int i = binary.length - 1; i >=0; i--) 
        {
            System.out.print(binary[i]);
        }
        System.out.print("\n");
    }
    
    public void showThreeOnes()
    {
        BigInteger f = new BigInteger("1101");
        int[] zeroToOneTwentyEight = new int[129];
        
        //for (int i = zeroToOneTwentyEight.length; i >= 0; i++)
        //{    
        //}
        
        System.out.println( BigInteger.toString("1101") );
    }
}
