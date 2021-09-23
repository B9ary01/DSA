import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arrs = { 3,1,4,2};
        sort(arrs);
        System.out.println(Arrays.toString(arrs));
        int[] numbers={4,0,2,1};
        findmissingnumb(numbers);
        System.out.println(findmissingnumb(numbers));
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------find missing indexnumber in arr---");
        int[] numb={1,2,3,4,5,6,7,7};
        findmissingnumbArr(numb);
        System.out.println(findmissingnumbArr(numb));
        System.out.println(Arrays.toString(numb));


        System.out.println("---find dublicate number from array--------");
        int[] nums={1,2,1};
        finddublicatenumb(nums);
        System.out.println(finddublicatenumb(nums));
        System.out.println(Arrays.toString(nums));

        System.out.println("---find dublicate 2 number from array--------");
        int[] dubs={1,3,2,1};
        finddublicatenumb2(dubs);
        System.out.println(finddublicatenumb2(dubs));
        System.out.println(Arrays.toString(dubs));

        System.out.println("---find dublicate set mismatchs number from array--------");
        int[] miss={1,2,3,4,5,6,7,7};
        findrepnumbArr(miss);
        System.out.println(Arrays.toString(findrepnumbArr(miss)));
        System.out.println(Arrays.toString(miss));

        System.out.println("---find missing first positive number from array--------");
        int[] missin={3,0,2,-1,1};
        findmissingpositivenum(missin);
        System.out.println(findmissingpositivenum(missin));
        System.out.println(Arrays.toString(missin));

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //new missing number finder
     static int findmissingnumb(int[] arr) {
      int i=0;
      while(i< arr.length){
          int correct=arr[i];
          if(arr[i]<arr.length && arr[i]!=arr[correct]){
              swap(arr,i,correct);
          }i++;
      }
      //search first missing number
        for(int a=0;a< arr.length;a++){
            if(arr[a]!=a){
                return  a;
            }
        }return arr.length;

    }



    //new missing index numbers in array
    static List<Integer> findmissingnumbArr(int[] mynum) {
        int i=0;
        while(i< mynum.length){
            int correct=mynum[i]-1;
            if(mynum[i] !=mynum[correct]){
                swap(mynum,i,correct);
            }i++;
        }
        //search first missing number
        List<Integer> ans=new ArrayList<>();
        for(int a=0;a< mynum.length;a++){
            if(mynum[a]!=a+1){
                ans.add(a+1);
            }
        }return ans;

    }


    //new dublicate number finder
    static int finddublicatenumb(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }i++;
        }
        //search first missing number
        for(int a=0;a< arr.length;a++){
            if(arr[a]!=a){
                return  arr[a];
            }
        }return arr.length;

    }






    //new dublicate2 number finder2
    static int finddublicatenumb2(int[] arr) {
        int i=0;
        while(i< arr.length){
            if(arr[i]!=i+1){
            int correct=arr[i]-1;

            if( arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
            return arr[i];
            }
            }i++;
        }
        //search first missing number
      return -1;

    }




    //new missing index and repetition numbers in array
    static int[] findrepnumbArr(int[] mynum) {
        int i = 0;
        while (i < mynum.length) {
            int correct = mynum[i] - 1;
            if (mynum[i] != mynum[correct]) {
                swap(mynum, i, correct);
            }
            i++;
        }
        //search first missing number
       /* List<Integer> ans=new ArrayList<>();
        for(int a=0;a< mynum.length;a++){
            if(mynum[a]!=a+1){
                ans.add(a);
                ans.add(a+1);
            }
        }return ans;

        */
        for (int a = 0; a < mynum.length; a++) {
            if (mynum[a] != a + 1) {
                return new int[]{mynum[a], a + 1};
            }
        }
        return new int[]{-1, -1};
    }


    //new missing index and repetition numbers in array
    static int findmissingpositivenum(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }i++;
        }
        //search first missing number
        for(int a=0;a< arr.length;a++){
            if(arr[a]!=a+1){
                return  a+1;
            }
        }return arr.length+1;


    }

}
