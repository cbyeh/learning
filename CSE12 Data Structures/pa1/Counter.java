
public class Counter {
    private int count;
    private int step;

    public Counter()
    {
        // This first line is redundant because member ints get
        // the value 0 by default
        count = 0;
        step = 1;
    }


    public Counter(int theStep) throws IllegalArgumentException
    {
        if (theStep <= 0)
            throw new IllegalArgumentException("Step size must be positive");
        step = theStep;
    }


    public int getCount() {
        return count;
    }

    public void increment() {
        count += step;
    }

    public void decrement() {
        if (count > step )
            count -= step;
        else
            count = 0;
    }


    public void reset() {
        count = 0;
    }
}
