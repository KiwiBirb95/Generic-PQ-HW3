package pq;
public abstract class Cryptid implements Comparable<Cryptid>
{
    // Name of cryptid
    protected String name;

    // Attack method
    public abstract void attack();

    public Cryptid(String name)
    {
        this.name = name;
    }

    // Returns name of cryptid
    protected String getName()
    {
        return name;
    }

    // Compares names of other cryptids
    public int compareTo(Cryptid other)
    {
        return name.compareTo(other.getName());
    }
}