import java.util.*;
class big_project {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        String arr1[] = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter the name of roll number "+(i+1)+": ");
            sc.nextLine();
            arr1[i] = sc.nextLine();
            System.out.print("Enter the total marks scored by roll number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        boolean f = true;
        do{
            System.out.print("\n************************************************************");
            System.out.print("\nEnter 1 to get the details of a student");
            System.out.print("\nEnter 2 to exit the program");
            System.out.print("\nEnter Your Choice: ");
            int a = sc.nextInt();
            switch (a)
            {
                case 1:
                    System.out.print("Enter the roll number of the student: ");
                    int rno = sc.nextInt();
                    rno--;
                    if(rno >= arr.length || rno<=0 )
                    {
                        System.out.print("\nEnter a valid roll number");
                        continue;
                    }
                    System.out.print("\nName of student is "+arr1[rno]+" and marks secured by the student is "+arr[rno]);
                break;

                case 2:
                    System.out.print("\n************************************************************");
                    f = false;
                break;

                default:
                {
                    System.out.print("\nInvalid Choice");
                    continue;
                }
            } 
        }while(f == true);
    }
}
