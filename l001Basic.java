// basic question
import java.util.Scanner;
 import java.util.Arrays;
 public class l001Basic{

    public static Scanner scn = new Scanner(System.in);
 

    public static int maxEle(int[] arr){
        int max = (int)-1e8;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i]; 
        }

        return max;

    }


     public static int minEle(int[] arr) {
         int min = (int)1e8;
         for(int i = 0; i<arr.length; i++){
             if(arr[i] < min) min = arr[i];
         }

         return min;
        
    }


    public static int findEle(int[] arr){
        int idx = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == data)     
            idx = i;
        }
        return idx;
    }

    public static int firstIdx(int[] arr){
        int idx = -1;
        for(int i =0; i<arr.length; i++ ){
            if(arr[i] == data)
            idx = i;
            break;
        }
        return idx;
    }

    public static int lastidx(int[] arr){
        int idx = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == data)
            idx = i;
            break;
        }
        return idx;
    }

    //sum of two arrays

    public static void sumOfTwoArrays(int[] arr1, int[] arr2){
        int p = arr1.length();
        int q = arr2.length();
        int r = max(p,q) + 1;

        int[] ans(r,0);
 
        int i = p - 1, j = q - 1, k = r - 1, carry = 0;

        while(k > 0){
            int sum = carry;
            if(i>=0) sum += arr[i--];
            if(j>=0) sum += arr[j--];
            
            ans[k--] += sum % 10;
            carry = sum/10;
        }

        for(int l = 0; l < ans.length(); l++ ){
            if(l == 0 && ans[l] == 0) continue;
            System.out.println(ans[l]);
        }
    }

    //reverse an array

    public static void Reverse(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    //rotate an array

    public static void Reverse(int arr[]){
        int i = 0 , int j = arr.lenght - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = (k % n + n)% n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0 , k - 1);
        reverse(arr, k, n - 1);
    }
    
    //inverse an array

    public static int[] inverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[arr[i]] = i;
        }
        return ans;
    }

    //printAllSubarray
    public static void printAllSubArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k <= j; k++){
                    System.out.print(arr[k] + "\t");
                }
                 System.out.println();
            }
        }
    }

    //Bonary Search

    public static int[] binarySearch(int[] arr, int data){
        int si = 0; int ei = arr.length - 1;
        while(si <= ei){
            int mid = (si + ei) / 2;
            if(arr[mid] == data)
                return mid;
            else if(data < arr[mid]){
                ei = mid - 1; 
            }else si = mid + 1;
        }
        return -1;

    }

    //---------------------------------------------------------------------------------
    //2d array

    //print an 2darray
    public class Main {
        public static Scanner scn = new Scanner(System.in);
        public static void test1(){
            
            int n = scn.nextInt();
            int m = scn.nextInt();
             int[][] arr = new int[n][m];
             
             for(int i = 0; i < n; i++){
                 for(int j = 0; j < m; j++){
                     arr[i][j] = scn.nextInt();
                 }
             }
             
             for(int i = 0; i < n; i++){
                 for(int j = 0; j < m; j++){
                     System.out.print(arr[i][j] + " ");
                 }
                 System.out.println();
             }

        }
    }

    //waveDisplay

    public static void input(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    public static void waveDisplay(int[][] arr, int row, int col){
        for(int j = 0; j < col; j++){
        if( j % 2 == 0){
            for(int i = 0; i < row; i++)
            System.out.print(arr[i][j] + " ");
        }else{
            for(int  i = row - 1; i>= 0; i-- )
            System.out.print(arr[i][j] + " ");
        }
            }
        }

  //exit point of an array

  public static void input(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; i < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}

public static void exitPoint(int[][] arr, int row, int col){
    int i = 0, j = 0, d = 0;
    while(true){
        d = (d + arr[i][j]) % 4;
        
        if(d == 0){
            j++;
            if(j == col){
                System.out.println(i, j - 1);
                break;
            }
        }else if(d == 1){
            i++;
            if(i == row){
                System.out.println(i - 1, j);
                break;
            }
        }else if(d == 2){
            j--;
            if( j == - 1){
                System.out.println(i, j + 1);
                break;
            }
        }else{
            i--;
            if( i == -1){
                System.out.println(i + 1, j);
                break;
            }
        }
        
    }
}

//digonal traversal

   public static void printTraversal(int[][] arr){
       for(int gap = 0; gap < arr[0].length; gap++){
          for( i = 0, j = 0; i < arr.length && j < arr[0].length; i++,j++){
              System.out.println(arr[i][j]);
          }
       }
   }
    
   //saddle point

   public static void saddlePoint(int[][] arr){
       int n = arr.length;
       int m = arr[0].length;

       for(int r = 0; r < n; r++){
           int c = 0;
            int minEle = (int)1e8;
            for(int j = 0; j < m; j++){
                if(arr[r][j] < minEle)
                minEle = arr[r][j];
                c = j;
            }
       }

       boolean isSaddle = true;

       for(int i = 0; i < n; i++){
           if(arr[i][c] > minEle)
           isSaddle = false;
           break;
       }


       if(isSaddle){
       System.out.println(minEle);
       return;
   }

   System.out.println("invalid input");


   //search in sorted 2d array

   public static void searchInSortedMatrix(int[][] arr, int data){
       int i = arr.length - 1; j = 0;

       while( i >= 0 && j < arr[0].lenght ){
            if(arr[i][j] == data){
                System.out.println(i + "\n" + j);
                return;
            }else if(arr[i][j] <  data)
            j++;
            
            else
            i--;
          
        }

        System.out.println("Not found");


   } 

   //rotate by 90(inplace)


   public static void rotate90(int[][] arr){
    int n  = arr.length;   
    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
     }
    }

    int c1 = 0, c2 = n - 1;
    while(c1 < c2){
        for(int r = 0; r < n; r++){
           int e1 = arr[r][c1];
           int e2 = arr[r][c2];

           arr[r][c2] = e1;
           arr[r][c1] = e2; 
        }

        c1++;
        c2--;
    }
   }

   //spiral display
  
   public static void spiralDisplay(int[][] arr){
       int n = arr.length; 
       int m = arr[0].length;
       int tne = n * m;
       int rmin = 0, cmin = 0, rmax = n - 1, cmax = m - 1;
      
       while(tne > 0){
           for(int i = rmin; i <= rmax && tne > 0; i++){
               tne--;
               System.out.println(arr[i][cmin]);
           }
           cmin++;

           for(int i = cmin; i <= cmax && tne > 0; i++){
               tne--;
               System.out.println(arr[rmax][i]);
           }
           rmax--;

           for(int i = rmax; i >= rmin && tne > 0; i--){
               tne--;
               System.out.println(arr[i][cmax]);
           }
           cmax--;

           for(int i = cmax; i >= cmin && tne > 0; i--){
               tne--;
               System.out.println(arr[rmin][i]); 
           }
           rmin++;

       }
    
   }



    
    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        waveDisplay(arr, n, n);
     }
}
        

  