import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("ok");
        int[] sea={2,4,6,8,12,13,15,59};

        System.out.println(binSearch(sea,12));

        System.out.println("- - - SMALLER BUT GREATER THAN TARGET- - - - ");
        System.out.println(showGreater(sea,59));


        System.out.println("- - -GREATER BUT SMALLER THAN TARGET- - - - - ");
        System.out.println(showSmaller(sea,3));


        System.out.println("- - -chars GREATER BUT SMALLER THAN TARGET- - - - - ");
        char[] names={'h','i','k','l','p'};
        System.out.println(charSearch(names,'n'));

        System.out.println("- - -chars smaller BUT greater THAN TARGET- - - - - ");
        System.out.println(charSmallSearch(names,'s'));


        System.out.println("- - -search range- - - - ");
        int[] ar={2,3,4,5,6,8,27,27};
        System.out.println(searchRange(ar,27));


        System.out.println("- - -search using recursion range- - - - ");
        int[] recs={2,3,4,5,6,68,87,97};
        System.out.println(recSearch(recs,44,0,recs.length-1));


        System.out.println("- - -BIN SEARCH 2D ARRAY - - - - ");
        int[][] bins={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
                 };
        System.out.println(Arrays.toString(binSearch(bins, 29)));

        System.out.println("- - -BIN-SEARCH2- 2D ARRAY - - - - ");
        int[][] arrays={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search2(arrays, 11)));



    }

    static int binSearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

       while(start<=end){
           int mid=start+(end-start)/2;

           if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
               return mid;
           }
        }
        return -1;
    }

//find the smallest number greater than target number
    static int showGreater(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }

//find the greater number less than target number
    static int showSmaller(int[] arr, int target){
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return arr[end];
    }

    //search char
    static char charSearch(char[] letters, char target){

        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }


        }
        return letters[start % letters.length];
    }



    //search char  smaller than target char
    static char charSmallSearch(char[] letters, char target){

        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }


        }
        return letters[end % letters.length];
    }

    //search how many taarget value are present in the array

    public static int[] searchRange(int[] arr, int target){

        int[] ans={-1,-1};

        ans[0]=search(arr,target,true);

        if(ans[0]!=-1) {
            ans[1] = search(arr, target, false);
        }
        return ans;

    }
    //return index value
     static int search(int[] arr, int target, boolean findStartIndex){
      int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;

               if(findStartIndex){
                   end=mid-1;
               }else{start=mid+1;}
            }
        }
        return ans;
    }



    //return index using recursion
    static int recSearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
            int mid=s+(e-s)/2;

            if(target==arr[mid]){
                return mid;}

      if(target<arr[mid]){
          return recSearch(arr,target,s,mid-1);
      }
        return recSearch(arr,target,mid+1,e);
    }

    //binary search 2d array
    static int[] binSearch(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;
        while(r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }


    //bin search using start end target from 2d matrix
    //search in the row provided between the cols
    static int[] binSearch2(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid=cStart+ (cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    //continue to binsearch2
    static int[] search2(int[][] matrix, int target){
        int rows= matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binSearch2(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loop till the remaining row
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 row
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1, cMid};
        }
        //search in 1 half
        if(target<=matrix[rStart][cMid-1]){
         return binSearch2(matrix,rStart,0,cMid-1,target);
        }
        //search in 2 half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return binSearch2(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in 3 half
        if(target<=matrix[rStart+1][cMid-1]){
            return binSearch2(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4 half
        else{
            return binSearch2(matrix,rStart+1,cMid+1,cols-1,target);

        }


    }



}
