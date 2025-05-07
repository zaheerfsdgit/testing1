import java.io.*;
class FileStream1
{
public static void main(String args[]) throws IOException
{
System.out.println(" Files Streams");

FileOutputStream fos = new FileOutputStream("D:\\MayFile1.txt");
System.out.println(" New File has been created. ");
String str1="Welcome to LemonTree Hotel";
String line="\n-------------------------------------\n";
String cust1="\nJerry\tFull-Day Stay\t4000/-";
String cust2="\nGarry\tHalf-Day Stay\t2000/-\n";
fos.write(str1.getBytes());
fos.write(line.getBytes());
fos.write(cust1.getBytes());
fos.write(cust2.getBytes());
fos.write(line.getBytes());
System.out.println(" Data has been written in file ");
fos.close();
}
}