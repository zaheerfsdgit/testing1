import java.io.*;
import java.io.Serializable;
class config implements Serializable
{
	String pname;
	String gen;
	int cost;
	public config()
	{

	}
	public String toString()
	{
		return pname+" "+gen+" "+cost;
	}
}

class streams5
{
public static void main(String args[]) throws Exception
{
System.out.println(" Data in file using streams - objects");

FileOutputStream fos = new FileOutputStream("d:\\intel_advanced.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);

config con1 = new config();
con1.pname = "i9";
con1.gen="12th";
con1.cost=42000;

oos.writeObject(con1);

config con2 = new config();
con2.pname = "i11";
con2.gen="10th";
con2.cost=55000;

oos.writeObject(con2);

System.out.println(" Success");
oos.close();
fos.close();  

FileInputStream fis = new FileInputStream("d:\\intel_advanced.txt");
ObjectInputStream ois = new ObjectInputStream(fis);

config con1_read;
con1_read= (config) ois.readObject();
System.out.println(con1_read);

config con2_read;
con2_read= (config) ois.readObject();
System.out.println(con2_read);

System.out.println("\n\tData Fetched");
ois.close();
fis.close();   
}
}

/*
int i=0;
while((i=fis.read())!=-1)
{
	System.out.print((char)i);
}

*/