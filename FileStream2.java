import java.io.*;
class FileStream2
{
public static void main(String args[]) throws IOException
{
System.out.println(" Files Streams reading");

FileInputStream fis = new FileInputStream("D:\\MayFile1.txt");
System.out.println(" File has been detected ");

System.out.println("Data is fetching.. \n ");
int i=0;
do 
{
	i=fis.read();
	System.out.print((char)i);
}while(i != -1);
fis.close();

}
}