public class Term {

    protected String definition;
    protected String[] definitions;
    protected String term;
    protected long latestFiveAverage;
    protected long[] latestFiveArr;
    protected int currentTerm = 0;


    public Term()
    {
        latestFiveArr = new long[]{-1, -1, -1, -1, -1};
    }
    public Term(String t, String def)
    {
        term = t;
        definitions[currentTerm] = def;
    }
    public long SetLatestFiveAverage(long[] l)
    {
        long finalVal = 0;
        long sum = 0;
        for (int i = 0; i < l.length; i++)
        {
            sum = sum + l[i];

        }
        if (AtLeastFive() == true)
        {
            finalVal = sum / 5;
        }
        else
        {
            finalVal = -1;
        }
        return finalVal;
    }

    public boolean AtLeastFive()
    {
        boolean atf = false;
        for (int i = 0; i < 5; i++)
        {
            if(this.latestFiveArr[i] == 1)
            {
                atf = true;
            }
        }
        return atf;
    }

    public String GetDefinition(int defNum)
    {
        return definitions[defNum];
    }


}
