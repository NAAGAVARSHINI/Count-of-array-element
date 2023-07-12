import java.util.Scanner;

public class count {

    public static int ElementCount(int array[]){
        int size = array.length;
        int counter=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<size;i++){
            if(array[i]==max){
                counter++;
            }
        }
        return size-counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println(ElementCount(array));

    }
}
