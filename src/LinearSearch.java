import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums={31,32,91,5,-8,90,-28};

        System.out.println("find min...");
        System.out.print(findmin(nums));
        System.out.println(" ");
        System.out.println("minINDEX= "+findminIndex(nums));

        System.out.println(" ");
        System.out.println("find max int..");
        System.out.print(findmax(nums));

        System.out.println(" ");
        System.out.println("search int.. ");
        System.out.print(valuePresent(nums,32));
        System.out.print(valuePresent(nums,91));


        System.out.println(" ");
        System.out.println("check value..");
        System.out.print(checkValue(nums,2));

        System.out.println(" ");
        System.out.println("search char..");
        String name="Dimash";
        System.out.print(Arrays.toString(name.toCharArray()));
        System.out.print(searchChar(name,'d'));
        System.out.print(searchChar(name,'l'));

        System.out.print("- - - search char2 - - - ");
        String name2="lee";
        System.out.println(Arrays.toString(name2.toCharArray()));

        System.out.println(searchChar2(name2,'e'));


        System.out.print("- - - - - end start = ");
        int[] n={2,33,4,3,11,23};
        System.out.println(startend(n,3,1,5));
        System.out.println(startend(n,230,1,5));


        System.out.print("- - - - - 2d array search ");
        int[][] numbers={{2,9,3},{1,4,7},{55,66,77}};
        System.out.println(Arrays.toString(my2darray(numbers,66)));

        System.out.print("- - - - - minvalue 2d array search ");
        int[][] number1={{82,9,13},{99,48,7},{55,66,77}};
        System.out.println(my2dMinValue(number1));

        System.out.println("- - - - - minvalue2-- 2d array search ");
        int[][] number3={{32,19,53},{26,48,57},{59,16,77}};
        System.out.println(my2dMinValue2(number3));

        System.out.println("- - - - - 2d MAX value array search ");
        int[][] num3={{32,19,53},{26,48,57},{59,16,97}};
        System.out.println(my2dMaxValue(num3));

        System.out.println("--count even numbers----");
        int[] even={1,22,36,44,52,69,78};
        System.out.println(countEvenNumber(even));


        System.out.println("--count digits present in number string---");
        System.out.println(numofdigit(2000009));
        System.out.println(numofdigit(23419));


        System.out.println("--max wealth add ---");
        int[][] w={{1,5,4},{2,0,5}};
        System.out.println(maxWealth(w));


        System.out.println("--max wealth add 2---");
        int[][] w1={{7,9,14},{2,0,5},{3,5,9}};
        System.out.println(maxWealth2(w1));
    }


    static int findmin(int[] arr){
        int min=arr[0];
        for(int a=1;a< arr.length;a++){
            while(arr[a]<min){
                min=arr[a];
            }
        }
        return min;
    }
//return index from array
    static int findminIndex(int[] arr){
        int min=arr[0];
        int ind=0;
        for(int a=1;a< arr.length;a++){
            while(arr[a]<min){
                min=arr[a];
                ind=a;
            }
        }
        return ind;
    }



    static int findmax(int[] arr){
        int max=arr[0];
        for(int a=1;a< arr.length;a++){
            while(arr[a]>max){
                max=arr[a];
            }
        }
        return max;
    }

    static int valuePresent(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }return Integer.MAX_VALUE;
    }


    static boolean checkValue(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }return  false;
    }
    static boolean searchChar(String name, char myChar){
        for(int a=0;a<name.length();a++){
            if(name.charAt(a)==myChar){
                return true;

            }
        }return false;
    }

    static boolean searchChar2(String name, char target){
        for(char c: name.toCharArray()){
            if(c==target){
                return true;

            }
        }return false;
    }


    static int startend(int[] arr, int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }

    static int[] my2darray(int[][] arr,int target){
        if(arr.length==0){
            return new int[] {-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }return new int[] {-1,-1};
    }


    static int my2dMinValue(int[][] arr){
       int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min=arr[row][col];

                }
            }
        }return min;
    }


    static int my2dMinValue2(int[][] arr){
        int min=Integer.MAX_VALUE;
        for(int[] ints:arr){
            for(int element: ints){
                if(element<min){
                    min=element;

                }
            }
        }return min;
    }


    static int my2dMaxValue(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element: ints){
                if(element>max){
                    max=element;

                }
            }
        }return max;
    }
    //how many even numbers in array
    static int countEvenNumber(int[] arr){
        int count=0;
        for(int a=0;a<arr.length;a++){
            if(arr[a]%2==0){
                count++;
            }
        }return count;
    }

    static int numofdigit(int n){
        return (int)(Math.log10(n))+1;
    }

    static int maxWealth(int[][] account){
        int ans=Integer.MIN_VALUE;
        for(int a=0;a<account.length;a++){
            int sum=0;

            for(int b=0;b<account[a].length;b++){
                sum+=account[a][b];
            }
            if(sum>ans){
                ans=sum;
            }
        }

        return ans;
    }


    static int maxWealth2(int[][] account){
        int ans=Integer.MIN_VALUE;
        for(int[] ints:account){
            int sum=0;

            for(int anint:ints){
                sum+= anint;
            }
            if(sum>ans){
                ans=sum;
            }
        }

        return ans;
    }
}
