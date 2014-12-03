import java.math.Random;
import java.io.*;

class file{
	public static void main(String argv[])
	{

		// 0～100までの乱数を100個コンマ区切りで
		// ファイル出力する

		// 0～100までの乱数をint型の変数aに求めて
		//出力
		int a;
		Random a = new Random();
		int b = rgen.nextInt(101);
		System.out.print(a);
		//変数aをtensu.txtにファイル出力する
	try{ 
		File file = new File("tensu.text");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter PW = new PrintWriter(bw);
		pw.printin(a);
		pw.close();
	} catch(Exception e)
    {
		
	}
}
