public class Own6
{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int loopVar=0;loopVar<n;loopVar++) {
			arr[loopVar]=scan.nextInt();
		}
		int temp=0;
		int repeat=0;
		for(int loopVar=0;loopVar<n;loopVar++) {
			temp=arr[loopVar];
			for(int loopVar1=loopVar+1;loopVar1<n;loopVar1++) {
				if(temp==arr[loopVar1]) {
					repeat=temp;
					break;
				}
			}
			if(repeat!=0) {
				break;
			}
		}
		if(repeat==0) {
			System.out.println("unique");
		}
		else {
			System.out.println(repeat);
		}
		scan.close();
	}
}
