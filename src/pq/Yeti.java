package pq;
public class Yeti extends Cryptid
{
    // Variable that holds length of fangs
    private final double fangLength;

    // Constructor to create new yeti with name and fang length
    public Yeti(String name, double fangLength)
    {
        super(name);
        this.fangLength = fangLength;
    }

    // Prints out which yeti is attacking and how long its fangs are.
    public void attack()
    {
        System.out.printf("%s the Yeti attacks with their %.1f cm fangs!%n", getName(), fangLength);
    }

    // Returns name and fang length of the yeti
    public String toString()
    {
        return String.format("%s the Yeti with %.1f cm fangs", getName(), fangLength);
    }
}
