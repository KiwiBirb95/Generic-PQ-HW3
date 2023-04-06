package pq;
public class Bigfoot extends Cryptid
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
