import java.util.ArrayList;

public class TermPack {

    ArrayList<Term> termPackList;
    public TermPack()
    {
        termPackList = new ArrayList<>();
    }

    public void AddToTermPack(Term t)
    {
        termPackList.add(t);
    }

    public ArrayList<Term> GetTermPack()
    {
        return termPackList;
    }
}
