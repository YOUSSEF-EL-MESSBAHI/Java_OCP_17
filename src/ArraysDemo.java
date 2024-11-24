import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int b[] =new int[2];
        int c[] = {1,2,3,4};
        int x,y[];

        String[] text={"youssef"};
        Object[] obj = text;
        String[] cast= (String[]) obj;
//        obj[0] = new StringBuilder("likan"); //throw ArrayStoreException
        // tim sort : merge sort + insert sort
        // dual pivot sort for primitives quick sort

        int sortNumbers[]={6,9,1};
        Arrays.sort(sortNumbers);
        System.out.println(Arrays.toString(sortNumbers));
        System.out.println(Arrays.binarySearch(sortNumbers,9));
        System.out.println(Arrays.binarySearch(sortNumbers,5));//-1-1 binarySearch is for sorted array for unsorted the ersult will be with no meaning

        String[] strings={"10","9","100"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));// 10,100,9


        // varagrs should be last parameter



    }
    void t(int y,int... x){

    }
}
