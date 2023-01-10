import java.util.ArrayList;

public class TermPack {

    ArrayList<Term> termPackList;
    public TermPack()
    {

    }

    public void AddToTermPack(Term t)
    {
        termPackList.add(t);
    }

    public ArrayList<Term> ReturnTermPack()
    {
        return termPackList;
    }
}
