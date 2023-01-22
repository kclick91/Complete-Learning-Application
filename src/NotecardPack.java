import java.util.ArrayList;

public class NotecardPack {
    private ArrayList<Notecard> cardsList;
    private String name;
    private int packID;//High usage



    public NotecardPack(String n, int iD)
    {
        name = n;
        cardsList = new ArrayList<Notecard>();
        packID = iD;


    }

    public NotecardPack(ArrayList<Notecard> cL)
    {
        cardsList = cL;
    }

    public void AddToPack(Notecard nc)
    {
        cardsList.add(nc);
        System.out.println("Added notecard for: " + nc.GetFront());
    }
    public ArrayList<Notecard> GetList()
    {
        return cardsList;
    }
    public Notecard GetCard(int index)
    {
        return cardsList.get(index - 1);
    }

    public String GetNotecardPackName()
    {
        return name;
    }

}
