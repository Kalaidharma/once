import java.util.Scanner;
public class once {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,a=-1,i,j,count=0;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
					}
			}
			if(count==1){
				System.out.println(arr[i]);
			}
		}
				}
				
			}
		
	
