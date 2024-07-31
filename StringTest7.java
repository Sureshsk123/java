class ReverseString
{
public static void main(String arg[])
{
String str="madam";
String rev=" ";
char ch;
int n=str.length();
for(int i=n-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
system.out.println("reverse string is"+rev);
}
}