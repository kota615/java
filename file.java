import java.math.Random;
import java.io.*;

class file{
	public static void main(String argv[])
	{

		// 0�`100�܂ł̗�����100�R���}��؂��
		// �t�@�C���o�͂���

		// 0�`100�܂ł̗�����int�^�̕ϐ�a�ɋ��߂�
		//�o��
		int a;
		Random a = new Random();
		int b = rgen.nextInt(101);
		System.out.print(a);
		//�ϐ�a��tensu.txt�Ƀt�@�C���o�͂���
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
