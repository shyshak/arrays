/**
 * Created with IntelliJ IDEA.
 * User: Nastya
 * Date: 27.10.14
 * Time: 20:17
 * To change this template use File | Settings | File Templates.
 */
public class SimpleSorting {
        public static void main(String[] args) {
            int [] arr = {1,128, 4, 10, 2, 130, 111};

            for (int count1 = 0; count1 < arr.length; count1++)
            {
                //int m = arr[count1];
                for(int count2 = count1+1;count2<arr.length; count2++)
                {
                    if(arr[count1]>arr[count2])
                    {
                        int f = arr[count2];
                        arr[count2] = arr[count1];
                        arr[count1] = f;
                    }
                }
                System.out.println(arr[count1]);
            }
        }
    }


