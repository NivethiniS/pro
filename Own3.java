class Own3
{
public static void main(String arg[])
{
void merge(int [],int [],int [],int,int);
void mergesort(int [],int);
void main()
{
int c[15],n,i;
System.out.println("\n\t\tMERGE SORT USING DIVIDE & CONQUER TECHNIQUE\n\n");
System.out.println("\tEnter the No. of elt in the list : ");
System.out.println(n);
System.out.println("\n\t\tEnter the Elements : ");
for(i=0;i<n;i++)
System.out.println(c[i]);
mergesort(c,n-1);
printf("\n\t\tSORTED LIST \n\n\t");
for(i=0;i<n;i++,printf("\t"))
System.out.println(c[i]);
getch();
}
void mergesort(int c[],int n)
{
int b[10],a[10],i,j,k;
if(n>=1)
{
k=n/2;
for(i=0;i<=k;i++)
b[i]=a[i];
for(j=0;i<=n;j++)
a[j]=a[i++];
mergesort(b,k);
mergesort(a,j-1);
merge(c,b,a,k,j-1);
}
}
}
}
