import java.util.*;
class uniquearray
{
    public static void main(String args[])
    {
        public static int search(int n,int arr[])
        {
            int ans=0;
            for(int i=0;i<n;i++)
            ans^=arr[i];
            return ans;
        }
    }
}