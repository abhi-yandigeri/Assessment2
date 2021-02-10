package Assessment2;
import java.util.Scanner;
public class Integerarray {

	public static void main(String[] args) {
		
		
		int n;
		int child=0;
		int adult=0;
		int senior=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Persons Age you want");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Person Age:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j<arr.length;j++)
		{
			if(arr[j]<=18)
			{
				child++;
			}
			
			else if(arr[j]>18 && arr[j]<=54)
			{
				adult++;
			}
			else
			{
				senior++;
			}
		}
		System.out.println("Childrens" +child);
		System.out.println("Adults" +adult);
		System.out.println("SeniorCitizenship" +senior);

		
	}

}
