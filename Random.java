import java.util.Random;
import java.io.*;

class file {
	public static void main(String argv[])
	{
		// 0�`100�܂ł̗�����100�R���}��؂��
		// �t�@�C���o��

		// 0�`100�܂ł̗�����int�^�̕ϐ�a�ɋ��߂�
		// �o�́@
		Random b = new Random();

		// �ϐ�a��tennsu.txt�Ƀt�@�C���o�͂���
		try
		{
			// tensu.txt�ɏ������ޏ���	
			File file = new File("tensu.csv");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			// 100�̗������t�@�C���ɏ����o��
			for (int i = 1; i <= 100; i++)
			{
				// �����𐶐�
				int a = b.nextInt(101);
				// �t�@�C���ɒl����������
				pw.print(a + ",");
			}
			//�@�t�@�C�������
			pw.close();
		}
		catch (Exception e)
		{
			System.out.printIn(e.toString());
		}
	 }
}