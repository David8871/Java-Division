// Simple program that shows the numbers that can be divided with bouth 2 and 11, from 1 to 100.
public class Divisible {
    public static void main(String[] args){

        for(int i=0;i<100;i++)
        {
            //This its where you implement the condition of the code.
            if(i%2==0 && i%11==0)
            {
                System.out.println("Divisible numbers: " + i);
            }
        }
    }
}
