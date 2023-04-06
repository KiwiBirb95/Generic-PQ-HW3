package pq;
class Yeti extends Cryptid
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

class Bigfoot extends Cryptid
{
    // Variable that holds foot size
    private final int shoeSize;

    // Constructor to create new bigfoot with name and show size
    public Bigfoot(String name, int shoeSize)
    {
        super(name);
        this.shoeSize = shoeSize;
    }

    // Prints out which bigfoot is attacking and how long its fangs are.
    public void attack()
    {
        System.out.printf("%s the Bigfoot stomps with their size %d feet!%n", getName(), shoeSize);
    }

    // Returns name and foot size of the bigfoot
    public String toString()
    {
        return String.format("%s the Bigfoot with size %d feet", getName(), shoeSize);
    }
}
