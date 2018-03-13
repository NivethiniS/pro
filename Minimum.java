public class Minimum
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a sentence: ");              
    String sentence = in.nextLine();

    System.out.println("minLength");
    int minLength=in.nextInt();

    System.out.print("Your sentence has " + countWords(sentence,minLength)+ " words.");
}

public static int countWords(String str, int minLength)
{
int count = 0;
int c=0;

for (int i=0;i<=str.length()-1;i++)
{
    if (str.charAt(i) != ' ')
    {
        if(str.charAt(i)>='a' && str.charAt(i)<='z') //to check only      for alphabets.
        c++;

    }
    if(c>=minLength)
    {
         count++;
         c=0;
    }
    }
return count;

}
}
