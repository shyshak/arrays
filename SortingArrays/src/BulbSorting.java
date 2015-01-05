/**
 * Created with IntelliJ IDEA.
 * User: Nastya
 * Date: 28.10.14
 * Time: 19:54
 * To change this template use File | Settings | File Templates.
 */
public class BulbSorting {

    public static String sorting(int [] arr)
    {
        StringBuilder sb = new StringBuilder();
        //arr = {128, 131, 4, 67, 5, 8};
        /*for(int counter = 0; counter<arr.length; counter++)
            array[counter] = arr[counter]; */
        int temp = 0;
        for (int i = 0; i< arr.length ; i++)
        {
            for(int j = 0; j< arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i< arr.length; i++)
        {
            //System.out.println(arr[i]);
            sb.append(arr[i]) ;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        /*//Arrange
        int [] arr = {5,2,3,1};

        //Act
        sorting(arr);

        //Assert
        Assert.IsTrue(equels(arr, {1,2,3,5}));       */


    }
}
