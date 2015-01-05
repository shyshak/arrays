/**
 * Created with IntelliJ IDEA.
 * User: Nastya
 * Date: 02.11.14
 * Time: 20:37
 * To change this template use File | Settings | File Templates.
 */
public class InsertSorting {
    public static void main(String[] args) {
        int [] arr = {5,8,3,11,4};
        for (int i = 2; i < arr.length; i++)
        {
            int j = i;
            while(arr[j]<arr[j-1] &&j>1)
            {
                int m = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = m;
                j--;
            }
        }
        for(int m = 0; m<arr.length;m++)
            System.out.println(arr[m]);
    }
}
