import java.math.*;

// �������[�h�Fjava �v���~�e�B�u�^
// �g���N���X:�@�v���~�e�B�u

class lucas
{
	public static void main(String argv[])
	{

		// �����J����i1�`100���܂Ōv�Z���āA���v��\���j
		// ���v������ϐ����`���āA0�������Ă���
		//�@Biginteger�^��luka���`����0����
		BigInteger luca = new BigInteger("0");
		//// BigInteger�^�̔z�u�̒�`
		double luka = 0; 
		//// BigInteger�^�̔z�u�̒�`�i100���܂Łj
		BigInteger [] hai = new BigInteger[101]
		//// 0���ڂ̏�����
		hai[0] = new BigInteger("2");
		//// 1���ڂ̏�����
		hai[1] = new BigInteger("1");
		//// 2�`100���̌v�Z
		///// 2�`100�܂ł̃��[�v��for���ŏ���
		for (int i=2 ; i<=100 ; i++){
			hai[i] = hai[i=1] + hai[i-2];
			// �Z�o�����l�����v����ϐ��ɑ���
			luka = luka + hai[i];
			// �������l��\��
		    System.out.println(luka);
			
	}
}
