import java.io.*;
import java.util.List;
import java.util.Random;

public class RJ {

    protected int count = 0;
    protected double doubl = 0.0;
    protected float flo = 0.0f;
    protected long lon = 0L;
    protected String strin = "DEFAULT";
    protected Boolean bool = true;
    protected int[] intArray = new int[]{0,0};
    protected double[] doubleArray = new double[]{0.0,0.0};
    protected float[] floArray = new float[]{0,0};
    protected long[] lonArray = new long[]{0,0};
    protected int[][] twoDimArray = new int[][]{{0,0},{0,0}};
    protected float[][] twoDimFloArray = new float[][]{{0,0}, {0,0}};
    protected long[][] twoDimLonArray = new long[][]{{0,0}, {0,0}};
    protected double[][] twoDimArrayDoub = new double[][]{{0.0,0.0},{0.0,0.0}};
    protected String[] stringArray = new String[]{"None", "None"};
    protected String[][] stringArrayTD = new String[][]{{"None", "None"}, {"None", "None"}};
    protected String name = "DEFAULT NAME";
    protected String intName = "DEFAULT INT NAME";
    protected String doubleName = "DEFAULT DOUBLE NAME";
    protected String floatName = "DEFAULT FLOAT NAME";
    protected String longName = "DEFAULT LONG NAME";
    protected String boolName = "DEFAULT BOOLEAN NAME";
    protected String intarrayName = "DEFAULT INT ARRAY NAME";
    protected String doubleArrayName = "DEFAULT DOUBLE ARRAY NAME";
    protected String floArrayName = "DEFAULT FLOAT ARRAY NAME";
    protected String lonArrName = "DEFAULT LONG ARRAY NAME";
    protected String twodimarrayName = "DEFAULT 2D INTEGER ARRAY NAME";
    protected String twodimarrayDoubName = "DEFAULT 2D DOUBLE ARRAY NAME";
    protected String stringarrayName = "DEFAULT STRING ARRAY NAME";
    protected String stringTwoDArrayName = "DEFAULT 2D STRING ARRAY NAME";
    protected String twodimarrayFloName = "DEFAULT 2D FLOAT ARRAY NAME";
    protected String twodimarrayLonName = "DEFAULT 2D LONG ARRAY NAME";


    //As in a chain
    protected RJ nextRJ;
    protected RJ prevRJ;
    //As in a binary tree
    protected RJ leftRJ;
    protected RJ rightRJ;
    //Anything in a chain or tree




    protected List<List<String>> stringGraph;
    protected List<List<Integer>> integerGraph;
    protected List<List<Double>> doubleGraph;
    protected List<List<RJ>> rjGraph;


    protected double independent;
    protected double dependent;

    protected long start;
    protected long finish;

    protected final double  CONSTANTEULERS = 2.7182818284590452353602874713;
    protected final double CONSTANTPI = 3.1415926535897932384626433832;

    public RJ()
    {

    }
    public RJ(int c, double doub, float f, String s, boolean b, int[] iArray, double[] dArray, int[][] twoDArr, double[][] twoDArrayDoub, String[] sArr,
              String[][] twoDSArr, long l, float[] fArr, long[] lArr, float[][] fTDArr, long[][] lTDArr)
    {
        count = c;
        doubl = doub;
        flo = f;
        name = s;
        bool = b;
        intArray = iArray;
        doubleArray = dArray;
        twoDimArray = twoDArr;
        twoDimArrayDoub = twoDArrayDoub;
        stringArray = sArr;
        stringArrayTD = twoDSArr;
        lon = l;
        floArray = fArr;
        lonArray = lArr;
        twoDimFloArray = fTDArr;
        twoDimLonArray = lTDArr;




    }
    public RJ(int c, double doub, float f, String s, boolean b, int[] iArray, double[] dArray, int[][] twoDArr, double[][] twoDArrayDoub, String[] sArr,
              String[][] twoDSArr, float fl, long l, float[] fArr, long[] lArr, float[][] fTDArr, long[][] lTDArr, String n, String intN, String doubleN, String floatN, String longN, String booleanN, String intArrayN, String doubleArrayN, String floatArrayN, String longArrayN
            , String twoDimArrayN, String twoDimArrayDoubleN, String arrayN, String arrayTwoDN, String arrayTwoDFloatN, String arrayTwoDLongN)
    {
        count = c;
        doubl = doub;
        flo = f;
        name = s;
        bool = b;
        intArray = iArray;
        doubleArray = dArray;
        twoDimArray = twoDArr;
        twoDimArrayDoub = twoDArrayDoub;
        stringArray = sArr;
        stringArrayTD = twoDSArr;
        flo = fl;
        lon = l;
        floArray = fArr;
        lonArray = lArr;
        twoDimFloArray = fTDArr;
        twoDimLonArray = lTDArr;
        name = n;
        intName = intN;
        doubleName = doubleN;
        floatName = floatN;
        longName = longN;
        boolName = booleanN;
        intarrayName = intArrayN;
        doubleArrayName = doubleArrayN;
        floArrayName = floatArrayN;
        lonArrName = longArrayN;
        twodimarrayName = twoDimArrayN;
        twodimarrayDoubName = twoDimArrayDoubleN;
        stringarrayName = arrayN;
        stringTwoDArrayName = arrayTwoDN;
        twodimarrayFloName = arrayTwoDFloatN;
        twodimarrayLonName = arrayTwoDLongN;




    }



    public void SetNames(String n, String intN, String doubleN, String floatN, String longN, String booleanN, String intArrayN, String doubleArrayN, String floatArrayN, String longArrayN
            , String twoDimArrayN, String twoDimArrayDoubleN, String arrayN, String arrayTwoDN, String arrayTwoDFloatN, String arrayTwoDLongN)
    {
        name = n;
        intName = intN;
        doubleName = doubleN;
        floatName = floatN;
        longName = longN;
        boolName = booleanN;
        intarrayName = intArrayN;
        doubleArrayName = doubleArrayN;
        floArrayName = floatArrayN;
        lonArrName = longArrayN;
        twodimarrayName = twoDimArrayN;
        twodimarrayDoubName = twoDimArrayDoubleN;
        stringarrayName = arrayN;
        stringTwoDArrayName = arrayTwoDN;
        twodimarrayFloName = arrayTwoDFloatN;
        twodimarrayLonName = arrayTwoDLongN;

    }

    //Access arrays by name


    public String GetNameOfIntArray()
    {
        return intarrayName;
    }
    public String GetNameOfDoubleArray()
    {
        return doubleArrayName;
    }

    public String GetNameOfTDIntArray()
    {
        return twodimarrayName;
    }

    public String GetNameofTDDoubleArray()
    {
        return twodimarrayDoubName;
    }
    public String GetNameOfStringArray()
    {
        return stringarrayName;
    }

    public void SetIndependentAndDependent(int i, int d)
    {
        independent = i;
        dependent = d;
    }
    public void SetIndependent(double i)
    {
        independent = i;
    }

    //Polynomial
    public double Polynomial(int i, int[] polyNomCoeff)
    {
        int length = polyNomCoeff.length;
        double sum = 0;
        for (int j = length - 1; j >= 0; j--)
        {
            sum = sum + (polyNomCoeff[length - (j + 1)] * Math.pow(i, j));
        }
        dependent = sum;
        return sum;
    }

    public double Polynomial(double i, double[] polyNomCoeff)
    {
        int length = polyNomCoeff.length;
        double sum = 0;
        for (int j = length - 1; j >= 0; j--)
        {
            sum = sum + (polyNomCoeff[length - (j + 1)] * Math.pow(i, j));
        }
        dependent = sum;
        return sum;
    }




    public void AddPrevRJ(RJ rj)
    {
        prevRJ = rj;
    }
    public void AddNextRJ(RJ rj)
    {
        nextRJ = rj;
    }

    public void AddLeftRJ(RJ rj)
    {
        leftRJ = rj;
    }
    public void AddRightRJ(RJ rj)
    {
        rightRJ = rj;
    }

    public RJ GetPrevRJ()
    {
        return prevRJ;
    }
    public RJ GetNextRJ()
    {
        return nextRJ;
    }

    public RJ GetLeftRJ()
    {
        return leftRJ;
    }
    public RJ GetRightRJ()
    {
        return rightRJ;
    }

    public int PeekFirst(int[] arr)
    {
        return arr[0];
    }

    public int PeekLast(int[] arr)
    {
        return arr[arr.length - 1];
    }

    public double PeekFirst(double[] arr)
    {
        return arr[0];
    }

    public double PeekLast(double[] arr)
    {
        return arr[arr.length - 1];
    }

    public int PeekFirst()
    {
        return intArray[0];
    }

    public int PeekLast()
    {
        return intArray[intArray.length - 1];
    }

    public double PeekFirstDouble()
    {
        return doubleArray[0];
    }

    public double PeekLastDouble()
    {
        return doubleArray[doubleArray.length - 1];
    }



    public boolean SearchArray(int[] arr,int number, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i] == number)
            {
                isFound = true;
            }
        }
        return isFound;
    }


    public boolean SearchArray(String[] arr,String str, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i].equals(str))
            {
                isFound = true;
            }
        }
        return isFound;
    }

    public boolean SearchArray(double[] arr,double number, int min, int max, int increment)
    {
        boolean isFound = false;
        for (int i = min; i < max; i+=increment)
        {
            if (arr[i] == number)
            {
                isFound = true;
            }
        }
        return isFound;
    }

    public boolean IsSortedAscending(int[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] < arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedAscending(double[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] < arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedDescending(int[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] > arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean IsSortedDescending(double[] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[i + 1] > arr[i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, int number)
    {
        boolean numberFound = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (number == arr[i][j])
                {
                    numberFound = true;
                }
            }
        }
        return numberFound;
    }

    public boolean SearchforIntegerTwoDimensionalArray(int[][] arr, double number)
    {
        boolean doubleFound = false;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j] == number)
                {
                    doubleFound = true;
                }
            }
        }
        return doubleFound;
    }
    //Start of print methods
    public void PrintTwoDimensionalArrayString()
    {
        for (int i = 0; i < stringArrayTD.length; i++)
        {
            for (int j = 0; j < stringArrayTD[0].length; j++)
            {
                System.out.print(stringArrayTD[i][j] + " ");
            }
            System.out.println();
            //System.out.print("-----");
        }
    }

    public void PrintTwoDimensionalArrayInt()
    {
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
            //System.out.print("-----");
        }
    }
    public void PrintTwoDimensionalArrayDoub()
    {
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                System.out.print(twoDimArrayDoub[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PrintTwoDimensionalArrayFlo()
    {
        for (int i = 0; i < twoDimFloArray.length; i++)
        {
            for (int j = 0; j < twoDimFloArray[0].length; j++)
            {
                System.out.print(twoDimFloArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PrintTwoDimensionalArrayLon()
    {
        for (int i = 0; i < twoDimLonArray.length; i++)
        {
            for (int j = 0; j < twoDimLonArray[0].length; j++)
            {
                System.out.print(twoDimLonArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void PrintTwoDimensionalArray(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("-----");
    }

    public void PrintTwoDimensionalArray(double[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void PrintTwoDimensionalArray(float[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PrintTwoDimensionalArray(boolean[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void PrintTwoDimensionalArray(String[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    public void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintTwoDimensionalArrayFlo(float[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PrintTwoDimensionalArray(long[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void PrintArrayInt()
    {
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
    public void PrintArray(String[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayStr()
    {
        for (int i = 0; i < stringArray.length; i++)
        {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();
    }

    public void PrintArray(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayDoub()
    {
        for (int i = 0; i < doubleArray.length; i++)
        {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
    }

    public void PrintArray(boolean[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayFlo()
    {
        for (int i = 0; i < floArray.length; i++)
        {
            System.out.print(floArray[i] + " ");
        }
        System.out.println();
    }

    public void PrintArrayLon()
    {
        for (int i = 0; i < lonArray.length; i++)
        {
            System.out.print(lonArray[i] + " ");
        }
        System.out.println();
    }
    //Start of Return Methods
    public StringBuffer ReturnArrayInt()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < intArray.length; i++)
        {
            s.append(intArray[i] + " ");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayDoub()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < doubleArray.length; i++)
        {
            s.append(doubleArray[i] + " ");
        }
        s.append("\n");
        return s;
    }

    public StringBuffer ReturnArrayString()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < stringArray.length; i++)
        {
            s.append(stringArray[i] + " ");
        }
        s.append("\n");
        return s;
    }
    //Continue return functions
    /*
    System.out.println(intarrayName + ": ");
        PrintArrayInt();
        System.out.println(doubleArrayName + ": ");
        PrintArrayDoub();
        System.out.println(floArrayName + ": ");
        PrintArrayFlo();
        System.out.println(lonArrName + ": ");
        PrintArrayLon();
        System.out.println(twodimarrayName + ": ");
        PrintTwoDimensionalArrayInt();
        System.out.println(twodimarrayLonName + ": ");
        PrintTwoDimensionalArrayLon();
        System.out.println(twodimarrayFloName + ": ");
        PrintTwoDimensionalArrayFlo();
        System.out.println(twodimarrayDoubName + ": ");
        PrintTwoDimensionalArrayDoub();
        System.out.println(stringTwoDArrayName + ": ");
        PrintTwoDimensionalArrayString();
     */
    public StringBuffer ReturnArray()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < stringArray.length; i++)
        {
            s.append(stringArray[i] + " ");
        }
        s.append("\n");
        return s;
    }

    public StringBuffer ReturnArrayFloat()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < floArray.length; i++)
        {
            s.append(floArray[i] + " ");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayLong()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < lonArray.length; i++)
        {
            s.append(lonArray[i] + " ");
        }
        s.append("\n");
        return s;
    }

    public StringBuffer ReturnArrayTDString()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < stringArrayTD.length; i++)
        {
            for (int j = 0; j < stringArrayTD[0].length; j++)
            {
                s.append(stringArrayTD[i][j] + " ");
            }
            s.append("\n");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayTDInt()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                s.append(twoDimArray[i][j] + " ");
            }
            s.append("\n");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayTDDoub()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                s.append(twoDimArrayDoub[i][j] + " ");
            }
            s.append("\n");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayTDFloat()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < twoDimFloArray.length; i++)
        {
            for (int j = 0; j < twoDimFloArray[0].length; j++)
            {
                s.append(twoDimFloArray[i][j] + " ");
            }
            s.append("\n");
        }
        s.append("\n");
        return s;
    }
    public StringBuffer ReturnArrayTDLong()
    {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < twoDimLonArray.length; i++)
        {
            for (int j = 0; j < twoDimLonArray[0].length; j++)
            {
                s.append(twoDimLonArray[i][j] + " ");
            }
            s.append("\n");
        }
        s.append("\n");
        return s;
    }
    public void SortArrayAscending(int[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    //Credit to https://www.baeldung.com/java-merge-sort
    //Implement for double
    public void MergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        MergeSort(l, mid);
        MergeSort(r, n - mid);

        Merge(array, l, r, mid, n - mid);
    }

    public void Merge(int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }

    public void MergeSort() {
        if (intArray != null)
        {
            int n = intArray.length;
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] =  intArray[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = intArray[i];
            }
            MergeSort(l, mid);
            MergeSort(r, n - mid);

            Merge(intArray, l, r, mid, n - mid);
        }
    }


    public char[] ReverseArrayChar(char[] wor)
    {
        char[] newWor = new char[wor.length];
        int count = 0;
        for (int i = wor.length - 1; i >= 0; i--)
        {

            newWor[count] = wor[i];
            count = count + 1;
        }
        return newWor;
    }

    public void PrintReverseArrayChar(char[] wor)
    {
        for (int i = wor.length - 1; i >= 0; i--)
        {
            System.out.print(wor[i]);

        }
    }

    public void PrintReversedArrayInt(int[] arrInt)
    {
        for (int i = arrInt.length - 1; i >= 0; i--)
        {
            System.out.print(arrInt[i] + " ");
        }
    }
    public void PrintReversedArrayInt()
    {
        for (int i = intArray.length - 1; i >= 0; i--)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    public void PrintReversedArrayDoub(double[] arrDoub)
    {
        for (int i = arrDoub.length - 1; i >= 0; i--)
        {
            System.out.print(arrDoub[i] + " ");
        }
    }

    public void PrintReversedArrayDoub()
    {
        for (int i = doubleArray.length - 1; i >= 0; i--)
        {
            System.out.print(doubleArray[i] + " ");
        }
    }



    public int[] ReverseArrayInt(int[] arrInt)
    {
        int[] revArrInt = new int[arrInt.length];
        for (int i = arrInt.length - 1; i >= 0; i--)
        {
            revArrInt[(arrInt.length - 1) - i] = arrInt[i];
        }
        return revArrInt;
    }

    public int[] ReverseArrayInt()
    {
        int[] revArrInt = new int[intArray.length];
        for (int i = intArray.length - 1; i >= 0; i--)
        {
            revArrInt[(intArray.length - 1) - i] = intArray[i];
        }
        return revArrInt;
    }

    public double[] ReverseArrayDoub(double[] arrDoub)
    {
        double[] revArrDoub = new double[arrDoub.length];
        for (int i = arrDoub.length - 1; i >= 0; i--)
        {
            revArrDoub[(arrDoub.length - 1) - i] = arrDoub[i];
        }
        return revArrDoub;
    }

    public double[] ReverseArrDoub()
    {
        double[] revArrDoub = new double[doubleArray.length];
        for (int i = doubleArray.length - 1; i >= 0; i--)
        {
            revArrDoub[(doubleArray.length - 1) - i] = doubleArray[i];
        }
        return revArrDoub;
    }

    /*
    public int[][] SortTDArrayAscending(int[] array)
    {

        int[][] tdArr = new int[2][];
        for (int i = 0; i < tdArr.length; i++)
        {
            tdArr[]
        }
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[0][i + 1] < array[0][i])
                {
                    int temp = array[0][i];
                    array[0][i] = array[0][i + 1];
                    array[0][i + 1] = temp;
                    int tempTwo = array[1][i];
                    array[1][i] = array[1][i + 1];
                    array[1][i + 1] = tempTwo;


                }

            }
        }

    }



    public boolean IsSortedAscending(int[][] arr)
    {
        boolean isSorted = true;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            if (arr[0][i + 1] < arr[0][i])
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    */

    public void SortArrayAscending(double[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public void SortArrayDescending(int[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public void SortArrayDescending(double[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }

    }
    public int[] SortArrayAscendingRet(int[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }
        return array;

    }
    public double[] SortArrayAscendingRet(double[] array)
    {
        while (IsSortedAscending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] < array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }
        return array;

    }
    public int[] SortArrayDescendingRet(int[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }
        return array;

    }
    public double[] SortArrayDescendingRet(double[] array)
    {
        while (IsSortedDescending(array) == false)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if(array[i + 1] > array[i])
                {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }

            }
        }
        return array;

    }




    public int CountofMatchValueandPosition(int[] arrOne, int[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        return count;

    }
    //A match in arrTwo is counted once
    public int CountofMatchValue(int[] arrOne, int[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            for (int j = 0; j < arrTwo.length; j++)
            {
                if (arrOne[i] == arrTwo[j])
                {
                    count = count + 1;
                    break;
                }
            }

        }
        return count;

    }

    public boolean DoesItMatchValueandPosition(int[] arrOne, int[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        if ((count == arrOne.length) && (arrOne.length == arrTwo.length))
        {
            matchedVandP = true;
        }
        return matchedVandP;

    }

    public boolean DoesItMatchValueandPosition(double[] arrOne, double[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        if ((count == arrOne.length) && (arrOne.length == arrTwo.length))
        {
            matchedVandP = true;
        }
        return matchedVandP;

    }

    public boolean DoesItMatchValueandPosition(char[] arrOne, char[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        if ((count == arrOne.length) && (arrOne.length == arrTwo.length))
        {
            matchedVandP = true;
        }
        return matchedVandP;

    }

    public int CountofMatchValueandPosition(double[] arrOne, double[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            if (arrOne[i] == arrTwo[i])
            {
                count = count + 1;
            }
        }
        return count;

    }
    //A match in arrTwo is counted once
    public int CountofMatchValue(double[] arrOne, double[] arrTwo)
    {
        int count = 0;
        boolean matchedVandP = false;
        for(int i = 0; i < arrOne.length;i++)
        {
            for (int j = 0; j < arrTwo.length; j++)
            {
                if (arrOne[i] == arrTwo[j])
                {
                    count = count + 1;
                    break;
                }
            }

        }
        return count;

    }

    public int IncrementIfTrue(int num, boolean b, int inc)
    {
        if (b == true)
        {
            num = num + inc;
        }
        return num;
    }

    public int IncrementIfFalse(int num, boolean b, int inc)
    {
        if (b == false)
        {
            num = num + inc;
        }
        return num;
    }
    public void IncrementCount(int amount)
    {
        count = count + amount;
    }

    public void IncrementCountIfFalse(int amount, boolean b)
    {
        if (b == false)
        {
            count = count + amount;
        }
    }

    public void IncrementCountIfTrue(int amount, boolean b)
    {
        if (b == true)
        {
            count = count + amount;
        }
    }

    public void SetCount(int c)
    {
        count = c;
    }

    public void SetIntArray(int[] arr)
    {
        intArray = arr;
    }

    public void SetDoubleArray(double[] arr)
    {
        doubleArray = arr;
    }

    public void SetStringArray(String[] arr)
    {
        stringArray = arr;
    }

    public void SetIntTwo(int[][] arr)
    {
        twoDimArray = arr;
    }

    public void SetDoubleTwo(double[][] arr)
    {
        twoDimArrayDoub = arr;
    }

    public void SetStringTwo(String[][] arr){stringArrayTD = arr;}

    public int GetCount()
    {
        return count;
    }

    public int[] GetIntArray()
    {
        return intArray;
    }

    public double[] GetDoubleArray()
    {
        return doubleArray;
    }

    public String[] GetStringArray()
    {
        return stringArray;
    }

    public float[] GetFloatArray() {return floArray;}

    public long[] GetLongArray() {return lonArray;}

    public double[][] GetTwoDimArr()
    {
        return twoDimArrayDoub;
    }
    public int[][] GetTwoDimArrInt()
    {
        return twoDimArray;
    }
    public float[][] GetTwoDimArrFlo() {return twoDimFloArray;}
    public long[][] GetTwoDimArrLong(){return twoDimLonArray;}



    public int[] AddToEnd(int[] arr, int n)
    {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }

    public int[] AddToBeginning(int[] arr, int n)
    {
        int[] newArray = new int[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = n;

        return newArray;

    }

    public String[] AddToEnd(String[] arr, String s)
    {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = s;
        return newArray;
    }

    public String[] AddToBeginning(String[] arr, String s)
    {
        String[] newArray = new String[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = s;

        return newArray;

    }


    public double[] AddToEnd(double[] arr, double n)
    {
        double[] newArray = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
        {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }

    public double[] AddToBeginning(double[] arr, double n)
    {
        double[] newArray = new double[arr.length + 1];
        for (int i = newArray.length - 1; i > 0; i--)
        {
            newArray[i] = arr[i - 1];
        }
        newArray[0] = n;

        return newArray;

    }

    public int GetSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public double GetSum(double[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }


    public void PrintArrayAndSum(int[] arr)
    {
        PrintArray(arr);
        System.out.println();
        System.out.println("Sum " + GetSum(arr));
    }

    public void PrintArrayAndSum(double[] arr)
    {
        PrintArray(arr);
        System.out.println();
        System.out.println("Sum: " + GetSum(arr));
    }

    public String Comparison(int[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == intArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == intArray[i])
                {
                    count = count + 1;
                }
            }
        }
        else
        {
            System.out.println("Must have same array length.");
        }
        double percentage = ((double)count/(double)length) * 100;
        return percentage + "%";
    }

    public String Comparison(double[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == doubleArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == doubleArray[i])
                {
                    count = count + 1;
                }
            }
        }
        else
        {
            System.out.println("Must have same array length.");
        }
        double percentage = ((double)count/(double)length) * 100;
        return percentage + "%";
    }

    public String Comparison(int[] arr, int[] arrTwo)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == arrTwo.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == arrTwo[i])
                {
                    count = count + 1;
                }
            }
        }
        else
        {
            System.out.println("Must have same array length.");
        }
        double percentage = ((double)count/(double)length) * 100;
        return percentage + "%";
    }

    public String Comparison(String[] arr)
    {
        int count = 0;
        int length = arr.length;
        if (arr.length == stringArray.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == stringArray[i])
                {
                    count = count + 1;
                }
            }
        }
        else
        {
            System.out.println("Must have same array length.");
        }
        double percentage = ((double)count/(double)length) * 100;
        return percentage + "%";
    }





    public int[] Insert(int[] arr, int n, int loc)
    {
        int[] arrTwo = new int[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc] = n;
        return arrTwo;
    }

    public String[] Insert(String[] arr, String s, int loc)
    {
        String[] arrTwo = new String[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc] = s;
        return arrTwo;
    }

    public double[] Insert(double[] arr, double n, int loc)
    {
        double[] arrTwo = new double[arr.length + 1];
        for (int i = 0; i < loc; i++)
        {
            arrTwo[i] = arr[i];
        }
        for (int i = loc; i < arrTwo.length; i++)
        {
            arrTwo[i] = arr[i - 1];
        }
        arrTwo[loc] = n;
        return arrTwo;
    }

    public int CountOccurrences(int[] arr, int n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(double[] arr, double n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(String[] arr, String s)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(s))
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(int n)
    {
        int count = 0;
        for (int i = 0; i < intArray.length; i++)
        {
            if(intArray[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrences(double n)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(doubleArray[i] == n)
            {
                count = count + 1;
            }
        }
        return count;
    }


    public int CountOccurrences(String s)
    {
        int count = 0;
        for (int i = 0; i < stringArray.length; i++)
        {
            if(stringArray[i].equals(s))
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(int low, int high)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(intArray[i] >= low && intArray[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(double[] arr, double low, double high)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= low && arr[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(int[] arr, int low, int high)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= low && arr[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int CountOccurrencesRangeInclusive(double low, double high)
    {
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++)
        {
            if(doubleArray[i] >= low && doubleArray[i] <= high)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public int[] ReplaceAll(int[] arr, int n, int newN)
    {
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] == n)
            {
                arr[j] = newN;
            }
        }
        return arr;
    }

    public double[] ReplaceAll(double[] arr, double n, double newN)
    {
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] == n)
            {
                arr[j] = newN;
            }
        }
        return arr;
    }
    public String[] ReplaceAll(String[] arr, String s, String newS)
    {
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j].equals(s))
            {
                arr[j] = newS;
            }
        }
        return arr;
    }

    public void ReplaceAll(int n, int newN)
    {
        for (int j = 0; j < intArray.length; j++)
        {
            if(intArray[j] == n)
            {
                intArray[j] = newN;
            }
        }
    }

    public void ReplaceAll(double n, double newN)
    {
        for (int j = 0; j < doubleArray.length; j++)
        {
            if(doubleArray[j] == n)
            {
                doubleArray[j] = newN;
            }
        }
    }
    public void ReplaceAll(String s, String newS)
    {
        for (int j = 0; j < stringArray.length; j++)
        {
            if(stringArray[j].equals(s))
            {
                stringArray[j] = newS;
            }
        }
    }

    public void ReplaceSpecific(int[] intArr, int val, int loc)
    {
        intArr[loc] = val;
    }


    public void ReplaceSpecific(int val, int loc)
    {
        intArray[loc] = val;
    }

    public void ReplaceSpecificTD(int val , int locOne, int locTwo)
    {
        twoDimArray[locOne][locTwo] = val;
    }

    public void ReplaceSpecificTD(double val , int locOne, int locTwo)
    {
        twoDimArrayDoub[locOne][locTwo] = val;
    }

    public void ReplaceSpecificTD(float val , int locOne, int locTwo)
    {
        twoDimFloArray[locOne][locTwo] = val;
    }


    //Two dimensional string array
    public void ReplaceSpecificTD(String val, int locOne, int locTwo) { stringArrayTD[locOne][locTwo] = val; }

    public void ReplaceSpecific(double val, int loc)
    {
        doubleArray[loc] = val;
    }

    public void ReplaceSpecific(double[] doubArr, double val, int loc)
    {
        doubArr[loc] = val;
    }

    public void ReplaceSpecific(float val, int loc)
    {
        floArray[loc] = val;
    }

    public void ReplaceSpecific(float[] fArr,float val, int loc)
    {
        fArr[loc] = val;
    }

    public void ReplaceSpecific(long val, int loc)
    {
        lonArray[loc] = val;
    }

    public void ReplaceSpecific(long[] lArr,long val, int loc)
    {
        lArr[loc] = val;
    }

    public void ReplaceSpecific(String val, int loc)
    {
        stringArray[loc] = val;
    }

    public void ReplaceSpecific(String[] stringArr, String val, int loc)
    {
        stringArr[loc] = val;
    }

    public int[][] ReplaceSpecific(int value, int first, int second, int[][] intArrTD) {
        intArrTD[first][second] = value;
        return intArrTD;
    }
    public double[][] ReplaceSpecific(double value, int first, int second, double[][] doubArrTD) {
        doubArrTD[first][second] = value;
        return doubArrTD;
    }
    public float[][] ReplaceSpecific(float value, int first, int second, float[][]  floArrTD) {
        floArrTD[first][second] = value;
        return floArrTD;
    }
    public long[][] ReplaceSpecific(long value, int first, int second, long[][] lonArrTD) {
        lonArrTD[first][second] = value;
        return lonArrTD;
    }

    //Shift one over and insert

    public int[] ShiftOneRightInsert(int[] iA, int numb, int place)
    {
        int[] newArray = new int[iA.length + 1];
        for (int i = 0; i < iA.length;i++)
        {
            if (i < place)
            {
                newArray[i] = iA[i];
            }
            else if (i == place)
            {
                newArray[place] = numb;
            }
            else if (i > place)
            {
                newArray[i] = iA[i - 1];
            }
        }
        return newArray;
    }

    public double[] ShiftOneRightInsert(double[] iA, double numb, int place)
    {
        double[] newArray = new double[iA.length + 1];
        for (int i = 0; i < iA.length;i++)
        {
            if (i < place)
            {
                newArray[i] = iA[i];
            }
            else if (i == place)
            {
                newArray[place] = numb;
            }
            else if (i > place)
            {
                newArray[i] = iA[i - 1];
            }
        }
        return newArray;
    }


    public String[] ShiftOneRightInsert(String[] iA, String str, int place)
    {
        String[] newArray = new String[iA.length + 1];
        for (int i = 0; i < iA.length;i++)
        {
            if (i < place)
            {
                newArray[i] = iA[i];
            }
            else if (i == place)
            {
                newArray[place] = str;
            }
            else if (i > place)
            {
                newArray[i] = iA[i - 1];
            }
        }
        return newArray;
    }

    public void SwapIntArray(RJ rj)
    {
        int[] temp = intArray;
        SetIntArray(rj.GetIntArray());
        rj.SetIntArray(temp);
    }

    public void SwapDoubleArray(RJ rj)
    {
        double[] temp = doubleArray;
        SetDoubleArray(rj.GetDoubleArray());
        rj.SetDoubleArray(temp);
    }

    public void SwapStringArray(RJ rj)
    {
        String[] temp = stringArray;
        SetStringArray(rj.GetStringArray());
        rj.SetStringArray(temp);
    }

    public int[] ReturnRandomInt(int size)
    {
        Random r = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextInt();
        }
        return array;
    }

    public double[] ReturnRandomDouble(int size)
    {
        Random r = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextDouble();
        }
        return array;

    }

    public boolean[] ReturnRandomBool(int size)
    {
        Random r = new Random();
        boolean[] array = new boolean[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = r.nextBoolean();
        }
        return array;

    }


    public int[][] ReturnRandomTwoDimInt(int size, int sizeTwo)
    {
        Random r = new Random();
        int[][] randTD = new int[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextInt();
            }
        }
        return randTD;
    }

    public double[][] ReturnRandomTwoDimDouble(int size, int sizeTwo)
    {
        Random r = new Random();
        double[][] randTD = new double[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextDouble();
            }
        }
        return randTD;
    }

    public boolean[][] ReturnRandomTwoDimBool(int size, int sizeTwo)
    {
        Random r = new Random();
        boolean[][] randTD = new boolean[size][sizeTwo];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < sizeTwo; j++)
            {
                randTD[i][j] = r.nextBoolean();
            }
        }
        return randTD;
    }

    public int CountUnique(int[] arr)
    {
        int count = 1;
        int[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }


    public int CountUnique(double[] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }
    /*
    public int CountUnique(int[][] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }
    public int CountUnique(double[][] arr)
    {
        int count = 1;
        double[] newArr = SortArrayAscendingRet(arr);
        int newLoc = 0;
        for (int i = 1; i < newArr.length;i++)
        {
            if (newArr[i] == newArr[newLoc])
            {
                //nothing
            }
            else if (newArr[i] > newArr[newLoc])
            {
                count = count + 1;
                newLoc = i;
            }
        }
        return count;
    }

    */

    public int[][] CountedArray(int size)
    {
        int[][] twoDim = new int[size][2];

        return twoDim;

    }



    //In Progress
    public int[] GetByFrequency(int[] arr)
    {
        //arr has initial values
        int[] newArr = SortArrayAscendingRet(arr);
        int count = CountUnique(arr);
        int[] countOcc = new int[count];
        int[][] countedTwoDim = CountedArray(count);
        for (int i = 0; i < countOcc.length; i++)
        {
            countOcc[i] = 0;
        }
        int place = 0;
        countOcc[place] = 1;
        for (int i = 1; i < newArr.length; i++)
        {
            if (newArr[i] == newArr[i - 1])
            {
                countOcc[place] = countOcc[place] + 1;
            }
            else
            {
                place = place + 1;
                countOcc[place] = countOcc[place] + 1;
            }
        }
        countOcc = SortArrayAscendingRet(countOcc);
        return countOcc;

    }


    public double ChangeFromRate(double changeDependent, double changeIndependent, double actualChangeIndependent)
    {
        return (changeDependent / changeIndependent) * actualChangeIndependent;
    }

    public double DifferenceFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
    {
        double d = 0;

        return ((ChangeFromRate(pair[0], pair[1], ac) + start) - (ChangeFromRate(pairTwo[0], pairTwo[1], ac) + startTwo));


    }

    public double RatioFromActualChange(double start, double startTwo, double[] pair, double[] pairTwo, double ac)
    {
        double d = 0;

        return ((ChangeFromRate(pair[0], pair[1], ac) + start) / (ChangeFromRate(pairTwo[0], pairTwo[1], ac) + startTwo));
    }

    //S(x)


    public double SigmoidFunction(double x)
    {
        return 1 / (1 + Math.pow(CONSTANTEULERS, -x));
    }

    public double ReLU(double x)
    {
        double ret;
        if (x > 0)
        {
            ret = x;
        }
        else
        {
            ret = 0.0;
        }
        return ret;
    }

    public double PercOutput(double W, double bias, double doub)
    {
        return W * doub + bias;
    }

    public int[] KeepLargestInt(int[] integerArr, int[] integerArrTwo)
    {
        int[] newArr = new int[integerArr.length];
        if (integerArr.length != integerArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < integerArr.length; i++)
        {
            if(integerArr[i] > integerArrTwo[i])
            {
                newArr[i] = integerArr[i];
            }
            else
            {
                newArr[i] = integerArrTwo[i];
            }
        }
        return newArr;
    }
    public int[] KeepSmallestInt(int[] integerArr, int[] integerArrTwo)
    {
        int[] newArr = new int[integerArr.length];
        if (integerArr.length != integerArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < integerArr.length; i++)
        {
            if(integerArr[i] < integerArrTwo[i])
            {
                newArr[i] = integerArr[i];
            }
            else
            {
                newArr[i] = integerArrTwo[i];
            }
        }
        return newArr;
    }
    public double[] KeepLargestDouble(double[] doubleArr, double[] doubleArrTwo)
    {
        double[] newArr = new double[doubleArr.length];
        if (doubleArr.length != doubleArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < doubleArr.length; i++)
        {
            if(doubleArr[i] > doubleArrTwo[i])
            {
                newArr[i] = doubleArr[i];
            }
            else
            {
                newArr[i] = doubleArrTwo[i];
            }
        }
        return newArr;
    }
    public double[] KeepSmallestDouble(double[] doubleArr, double[] doubleArrTwo)
    {
        double[] newArr = new double[doubleArr.length];
        if (doubleArr.length != doubleArrTwo.length)
        {
            System.out.println("Unequal Lengths");
        }
        for (int i = 0; i < doubleArr.length; i++)
        {
            if(doubleArr[i] < doubleArrTwo[i])
            {
                newArr[i] = doubleArr[i];
            }
            else
            {
                newArr[i] = doubleArrTwo[i];
            }
        }
        return newArr;
    }

    public void AddIntArrayToIntArray(int[] addInt)
    {
        int[] finalInt = new int[addInt.length];
        if(addInt.length != intArray.length)
        {
            System.out.println("Lengths of Arrays Do Not Match.");
            finalInt = null;

        }
        else
        {

            for (int i = 0; i < intArray.length; i++)
            {
                finalInt[i] = addInt[i] + intArray[i];
            }
        }
        intArray = finalInt;



    }

    public void AddDoubToDoubArray(double[] addDoub)
    {
        double[] finalDoub = new double[addDoub.length];
        if(addDoub.length != doubleArray.length)
        {
            System.out.println("Lengths of Arrays Do Not Match.");
            finalDoub = null;

        }
        else
        {

            for (int i = 0; i < doubleArray.length; i++)
            {
                finalDoub[i] = addDoub[i] + doubleArray[i];
            }
        }

        doubleArray = finalDoub;
    }
    public int[] MultiplyByScalarInteger(int[] arr, int s)
    {
        int[] newInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            newInt[i] = arr[i] * s;
        }
        return newInt;

    }

    public double[] MultiplyByScalarDouble(double[] arr, int s)
    {
        double[] newInt = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            newInt[i] = arr[i] * s;
        }
        return newInt;
    }

    public int[][] MultiplyByScalarInteger(int[][] arr, int s)
    {
        int[][] newInt = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length;j++)
            {
                newInt[i][j] = arr[i][j] * s;
            }

        }
        return newInt;

    }

    public double[][] MultiplyByScalarDouble(double[][] arr, int s)
    {
        double[][] newInt = new double[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length;j++)
            {
                newInt[i][j] = arr[i][j] * s;
            }

        }
        return newInt;
    }

    public String GetSwitch(int numb, int[] results, String[] messages)
    {
        String s = "";
        int count = results.length;
        for(int i = 0; i < count; i++)
        {
            if (numb == results[i])
            {
                s = messages[i];
            }
        }
        return s;

    }

    public String GetSwitch(int numb, int[][] results, String[][] messages)
    {
        String s = "";
        int count = results.length;
        int countTwo = results[0].length;
        for(int i = 0; i < count; i++)
        {
            for (int j = 0; j < countTwo; j++)
            {
                if (numb == results[i][j])
                {
                    s = messages[i][j];
                }
            }

        }
        return s;

    }



    //multiply matrices

    public int[][] MultiplyMat(int[][] first, int[][] second)
    {
        int one = first[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[first.length][second[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[first[0].length][second.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    int collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }

    //TEST
    //TEST
    //TEST
    public double[][] MultiplyMatDoub(double[][] first, double[][] second)
    {
        int one = first[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        double[][] mult = new double[first.length][second[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            double[][] returnedArray = new double[first[0].length][second.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    double collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }
    public float[][] MultiplyMatFloat(float[][] first, float[][] second)
    {
        int one = first[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        float[][] mult = new float[first.length][second[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            float[][] returnedArray = new float[first[0].length][second.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    float collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }
    public int[][] MultiplyInt(int[][] first)
    {
        int one = first[0].length;
        int two = twoDimArray.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[first.length][twoDimArray[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(twoDimArray);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[first[0].length][twoDimArray.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + twoDimArray.length);
            System.out.println("second[0].length:" + twoDimArray[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < twoDimArray[0].length; j++)
                {
                    int collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * twoDimArray[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;


    }

    public int[][] MultiplyTwoInt(int[][] second)
    {
        int one = twoDimArray[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        int[][] mult = new int[twoDimArray.length][second[0].length];
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(twoDimArray);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            int[][] returnedArray = new int[twoDimArray[0].length][second.length];
            System.out.println("first.length:" + twoDimArray.length);
            System.out.println("first[0].length:" + twoDimArray[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < twoDimArray.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    int collectedSum = 0;
                    int count = 0;

                    while(count < twoDimArray[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (twoDimArray[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }

    public double[][] MultiplyDoub(double[][] second)
    {
        int one = twoDimArrayDoub[0].length;
        int two = second.length;
        System.out.println("First: " + one);
        System.out.println("Second " + two);



        double[][] mult = new double[twoDimArrayDoub.length][second[0].length];
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < second[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(twoDimArrayDoub);
        PrintTwoDimensionalArray(second);
        if (one == two)
        {
            System.out.println("******");
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            double[][] returnedArray = new double[twoDimArrayDoub[0].length][second.length];
            System.out.println("first.length:" + twoDimArrayDoub.length);
            System.out.println("first[0].length:" + twoDimArrayDoub[0].length);
            System.out.println("second.length:" + second.length);
            System.out.println("second[0].length:" + second[0].length);

            for (int i = 0; i < twoDimArrayDoub.length; i++)
            {

                for (int j = 0; j < second[0].length; j++)
                {
                    double collectedSum = 0;
                    int count = 0;

                    while(count < twoDimArrayDoub[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (twoDimArrayDoub[i][count] * second[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }

    public double[][] MultiplyTwoDoub(double[][] first)
    {
        int one = first[0].length;
        int two = twoDimArrayDoub.length;
        System.out.println("First: " + one);
        System.out.println("Second: " + two);



        double[][] mult = new double[first.length][twoDimArrayDoub[0].length];
        for (int i = 0; i < first.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                mult[i][j] = 0;
            }


        }
        PrintTwoDimensionalArray(first);
        PrintTwoDimensionalArray(twoDimArrayDoub);
        if (one == two)
        {
            System.out.println("One equals Two.");
            PrintTwoDimensionalArray(mult);
            double[][] returnedArray = new double[first[0].length][twoDimArrayDoub.length];
            System.out.println("first.length:" + first.length);
            System.out.println("first[0].length:" + first[0].length);
            System.out.println("second.length:" + twoDimArrayDoub.length);
            System.out.println("second[0].length:" + twoDimArrayDoub[0].length);

            for (int i = 0; i < first.length; i++)
            {

                for (int j = 0; j < twoDimArrayDoub[0].length; j++)
                {
                    double collectedSum = 0;
                    int count = 0;

                    while(count < first[0].length)//or second.length
                    {
                        collectedSum = collectedSum + (first[i][count] * twoDimArrayDoub[count][j]);
                        count = count + 1;
                        System.out.println(count);
                    }
                    System.out.println("Collected Sum:" + collectedSum);
                    mult[i][j] = collectedSum;



                }
                System.out.println();

            }



        }
        else
        {
            System.out.println("Wrong dimensions");
        }
        return mult;

    }


    public int[][] AddTwoDimensionalArr(int[][] arr, int[][] arrTwo)
    {
        int[][] newArray = new int[arr.length][arrTwo.length];
        if (newArray.length == arrTwo.length && arr[0].length == arrTwo[0].length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    newArray[i][j] = arr[i][j] + arrTwo[i][j];
                }
            }

        }
        else
        {
            System.out.println("Mismatching dimensions");
        }
        return newArray;
    }


    public double[][] AddTwoDimensionalArr(double[][] arr, double[][] arrTwo)
    {
        double[][] newArray = new double[arr.length][arrTwo.length];
        if (newArray.length == arrTwo.length && arr[0].length == arrTwo[0].length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    newArray[i][j] = arr[i][j] + arrTwo[i][j];
                }
            }

        }
        else
        {
            System.out.println("Mismatching dimensions");
        }
        return newArray;
    }

    public int[] StretchTwoDim(int[][] twoDimArr)
    {

        int one = twoDimArr.length;
        int two = twoDimArr[0].length;
        int[] oneDim = new int[twoDimArr.length * twoDimArr[0].length];
        int count = 0;
        for (int i = 0; i < twoDimArr.length;i++)
        {
            for (int j = 0; j < twoDimArr[0].length; j++)
            {
                oneDim[count] = twoDimArr[i][j];
                count = count + 1;
            }
        }
        return oneDim;
    }
    public double[] StretchTwoDim(double[][] twoDimArr)
    {
        double[] oneDim = new double[twoDimArr.length * twoDimArr[0].length];
        int count = 0;
        for (int i = 0; i < twoDimArr.length;i++)
        {
            for (int j = 0; j < twoDimArr[0].length; j++)
            {
                oneDim[count] = twoDimArr[i][j];
                count = count + 1;
            }
        }
        return oneDim;
    }
    public List<List<Integer>> InitializeGraphInt(List<List<Integer>> iG)
    {
        integerGraph = iG;
        return iG;
    }

    public List<List<Double>> InitializeGraphDoub(List<List<Double>> iG)
    {
        doubleGraph = iG;
        return iG;
    }
    public List<List<String>> InitializeGraphString(List<List<String>> iG)
    {
        stringGraph = iG;
        return iG;
    }

    public List<List<RJ>> InitializeGraphRJ(List<List<RJ>> rJ)
    {
        rjGraph = rJ;
        return rJ;
    }

    //Print Graphs

    public void PrintGraphInteger(List<List<Integer>> llo)
    {
        int size = llo.size();
        for (int i = 0; i < size; i++)
        {
            int sizeTwo = llo.get(i).size();
            for (int j = 0; j < sizeTwo; j++)
            {
                if (j == 0)
                {
                    System.out.print(llo.get(i).get(j) + " | ");
                }
                else {
                    System.out.print(llo.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }

    public void PrintGraphDouble(List<List<Double>> llo)
    {
        int size = llo.size();
        for (int i = 0; i < size; i++)
        {
            int sizeTwo = llo.get(i).size();
            for (int j = 0; j < sizeTwo; j++)
            {
                if (j == 0)
                {
                    System.out.print(llo.get(i).get(j) + " | ");
                }
                else {
                    System.out.print(llo.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }

    public void PrintGraphString(List<List<String>> llo)
    {
        int size = llo.size();
        for (int i = 0; i < size; i++)
        {
            int sizeTwo = llo.get(i).size();
            for (int j = 0; j < sizeTwo; j++)
            {
                if (j == 0)
                {
                    System.out.print(llo.get(i).get(j) + " | ");
                }
                else {
                    System.out.print(llo.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }
    public void PrintGraphRJ(List<List<RJ>> rJ)
    {
        int size = rJ.size();
        for (int i = 0; i < size; i++)
        {
            System.out.println("CURRENT");
            int sizeTwo = rJ.get(i).size();
            for (int j = 0; j < sizeTwo; j++)
            {
                if (j == 0)
                {
                    rJ.get(i).get(j).ShowValues();
                    System.out.println(" /////// ");
                }
                else {
                    rJ.get(i).get(j).ShowValues();
                }
            }
            System.out.println();
        }
    }

    public long StartWatch()
    {
        start = System.currentTimeMillis();
        System.out.println(start);
        return start;
    }

    public long StopWatch()
    {
        finish = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(finish);
        long time = finish - start;
        return time;
    }

    public int[] PartOfArrayInt(int[] arr, int loc)
    {
        int[] part = new int[loc + 1];
        for(int i = 0; i < part.length; i++)
        {
            part[i] = arr[i];
        }
        return part;
    }

    public double[] PartOfArrayInt(double[] arr, int loc)
    {
        double[] part = new double[loc + 1];
        for(int i = 0; i < part.length; i++)
        {
            part[i] = arr[i];
        }
        return part;
    }

    public String[] PartOfArrayInt(String[] arr, int loc)
    {
        String[] part = new String[loc + 1];
        for(int i = 0; i < part.length; i++)
        {
            part[i] = arr[i];
        }
        return part;
    }

    public char[] PartOfArrayInt(char[] arr, int loc)
    {
        char[] part = new char[loc + 1];
        for(int i = 0; i < part.length; i++)
        {
            part[i] = arr[i];
        }
        return part;
    }

    //Store 2 values
    //1.value and 2.count
    public int[] StoreInt(int[] iArray, String comparison)
    {
        int[] arr = new int[2];
        if (comparison.equals("larger"))
        {
            arr[0] = iArray[0];
            arr[1] = 1;
        }
        else if (comparison.equals("smaller"))
        {
            arr[0] = iArray[0];
            arr[1] = iArray.length;
        }

        int count = 1;
        int countTwo = arr[1];
        for (int i = 1; i < iArray.length; i++)
        {
            if (comparison.equals("larger"))
            {
                if (iArray[i] == iArray[i - 1])
                {
                    count = count + 1;
                    if (count > arr[1])
                    {
                        arr[1] = count;
                        arr[0] = iArray[i];
                    }
                }
                else
                {
                    count = 1;
                }
            }

            else if(comparison.equals("smaller"))
            {
                if (iArray[i] != iArray[i - 1])
                {
                    countTwo = count;
                    if (countTwo < arr[1])
                    {
                        arr[1] = countTwo;
                        arr[0] = iArray[i - 1];
                    }
                    count = 1;
                }
                else
                {
                    count = count + 1;
                }
            }


        }

        return arr;
    }

    public double StoreDoubRange(double[] dArray, String comparison)
    {
        if (comparison.equals("larger"))
        {

        }
        else if(comparison.equals("smaller"))
        {

        }
        return 0;
    }


    public List<List<Integer>> addToListInt(List<List<Integer>> list,List<Integer> intl)
    {
        list.add(intl);
        return list;
    }
    public List<List<Double>> addToListDoub(List<List<Double>> list,List<Double> intl)
    {
        list.add(intl);
        return list;
    }
    public List<List<String>> addToListStr(List<List<String>> list,List<String> intl)
    {
        list.add(intl);
        return list;
    }

    public String IntArrToString()
    {
        String s = "";
        for (int i = 0; i < intArray.length; i++)
        {
            s += intArray[i] + " ";
        }
        return s;
    }

    public String DoubArrToString()
    {
        String s = "";
        for (int i = 0; i < doubleArray.length; i++)
        {
            s += doubleArray[i] + " ";
        }
        return s;
    }

    public String TDIntArrToString()
    {
        String s = "";
        for (int i = 0; i < twoDimArray.length; i++)
        {
            for (int j = 0; j < twoDimArray[0].length; j++)
            {
                s += twoDimArray[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public String TDDouArrToString()
    {
        String s = "";
        for (int i = 0; i < twoDimArrayDoub.length; i++)
        {
            for (int j = 0; j < twoDimArrayDoub[0].length; j++)
            {
                s += twoDimArrayDoub[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public String NewDoubArrToString(double[] doub)
    {
        String s = "";
        for (int i = 0; i < doub.length; i++)
        {
            s += doub[i] + " ";
        }
        return s;
    }

    public String NewIntArrToString(int[] intArr)
    {
        String s = "";
        for (int i = 0; i < intArr.length; i++)
        {
            s += intArr[i] + " ";
        }
        return s;
    }

    public String NewTDIntArrToString(int[][] tdIntArr)
    {
        String s = "";
        for (int i = 0; i < tdIntArr.length; i++)
        {
            for (int j = 0; j < tdIntArr[0].length; j++)
            {
                s += tdIntArr[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public String NewTDDoubArrToString(double[][] tDDoub)
    {
        String s = "";
        for (int i = 0; i < tDDoub.length; i++)
        {
            for (int j = 0; j < tDDoub[0].length; j++)
            {
                s += tDDoub[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public void WritetoFile(String str, String file)
    {
        try(FileWriter writer1 = new FileWriter(new File(file), true);) {

            writer1.write(str);

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public void ReadfromFile(String file)
    {
        try (
                FileReader reader = new FileReader(file)
        ) {
            int charRead = -1;

            while ((charRead = reader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found error: " + ex);
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        }
    }

    public void ShowValues()
    {
        System.out.println(intName + ": ");
        System.out.println(count);
        System.out.println(doubleName + ": ");
        System.out.println(doubl);
        System.out.println(floatName + ": ");
        System.out.println(flo);
        System.out.println(longName + ": ");
        System.out.println(lon);
        System.out.println(name + ": ");
        System.out.println(strin);
        System.out.println(boolName + ": ");
        System.out.println(bool);
        System.out.println(intarrayName + ": ");
        PrintArrayInt();
        System.out.println(doubleArrayName + ": ");
        PrintArrayDoub();
        System.out.println(floArrayName + ": ");
        PrintArrayFlo();
        System.out.println(lonArrName + ": ");
        PrintArrayLon();
        System.out.println(twodimarrayName + ": ");
        PrintTwoDimensionalArrayInt();
        System.out.println(twodimarrayLonName + ": ");
        PrintTwoDimensionalArrayLon();
        System.out.println(twodimarrayFloName + ": ");
        PrintTwoDimensionalArrayFlo();
        System.out.println(twodimarrayDoubName + ": ");
        PrintTwoDimensionalArrayDoub();
        System.out.println(stringTwoDArrayName + ": ");
        PrintTwoDimensionalArrayString();

    }
    //Record to text file
    public void Record(String recordFileTXT)
    {
        WritetoFile(intName + ": \n", recordFileTXT);
        WritetoFile(String.valueOf(count) + "\n", recordFileTXT);
        WritetoFile(doubleName + ": \n", recordFileTXT);
        WritetoFile(String.valueOf(doubl) + "\n", recordFileTXT);
        WritetoFile(floatName + ": \n", recordFileTXT);
        WritetoFile(String.valueOf(flo) + "\n", recordFileTXT);
        WritetoFile(longName + ": \n", recordFileTXT);
        WritetoFile(String.valueOf(lon) + "\n", recordFileTXT);
        WritetoFile(name + ": \n", recordFileTXT);
        WritetoFile(strin + "\n", recordFileTXT);
        WritetoFile(boolName + ": \n", recordFileTXT);
        WritetoFile(String.valueOf(bool) + "\n", recordFileTXT);
        WritetoFile(intarrayName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayInt().toString(), recordFileTXT);
        WritetoFile(doubleArrayName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayDoub().toString(), recordFileTXT);
        WritetoFile(floArrayName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayFloat().toString(), recordFileTXT);
        WritetoFile(lonArrName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayLong().toString(), recordFileTXT);
        WritetoFile(twodimarrayName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayTDInt().toString(), recordFileTXT);
        WritetoFile(twodimarrayLonName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayTDLong().toString(), recordFileTXT);
        WritetoFile(twodimarrayDoubName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayTDDoub().toString(), recordFileTXT);
        WritetoFile(twodimarrayFloName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayTDFloat().toString(), recordFileTXT);
        WritetoFile(stringTwoDArrayName + ": ", recordFileTXT);
        WritetoFile(ReturnArrayTDString().toString(), recordFileTXT);
        System.out.println("Data written to " + recordFileTXT);





    }






    //Dynamic arrays


}

