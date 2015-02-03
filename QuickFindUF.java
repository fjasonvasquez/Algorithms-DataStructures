public class QuickFindUF
{
    private int[] id;
    
    public QuickFindUF(int N)
    {
        //set id of each object to itself
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
}
            