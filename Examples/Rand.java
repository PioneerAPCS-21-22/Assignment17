
/**
 * Write a description of class Rand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rand
{
    public static void main(String[] args)
    {
        double r = Math.random();  // [0.0, 1.0)
        double dec1to11 = 10 * r + 1;  // real number in range [1, 11)
        int ints3to8 = (int) (6 * r) + 3;  // integer in range [3, 8]
        
        System.out.println("r: " + r);
        System.out.println("dec: " + dec1to11);
        System.out.println("ints: " + ints3to8);
    }
}

