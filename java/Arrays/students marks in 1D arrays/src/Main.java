import java.io.*;
class student{
    public static void main(String args[]){
        int[] arr={100,200,300,400};
        System.out.println("enter the marks: ");

        System.out.println("enter the imad marks: "+ arr[0]);
        System.out.println("enter the wajahat marks: " + arr[1]);
        System.out.println("enter the akbar marks: " + arr[2]);
        System.out.println("enter the khaleel marks: " + arr[3]);
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
        System.out.println("The lenght of the array elements is: " + arr.length);
        System.out.println("The sum of the array elements is: " + sum);

                float percentage=(float) sum/arr.length;
                System.out.println("the percentage of all students is: "+percentage);
            }
        }
