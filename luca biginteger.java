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
		BigInteger ryuka = new BigInteger("0");
		//// BigInteger�^�̔z�u�̒�`
		BigInteger ryuka = new BigInteger 
		//// BigInteger�^�̔z�u�̒�`�i100���܂Łj
		BigInteger [] hai = new BigInteger[101]
		//// 0���ڂ̏�����
		hai[0] = new BigInteger("2");
		//// 1���ڂ̏�����
		hai[1] = new BigInteger("1");
		ryuka = ryuka.add(hai[1]);
		//// 2�`100���̌v�Z
		///// 2�`100�܂ł̃��[�v��for���ŏ���
		for (int i=2 ; i<=100 ; i++){
			hai[i] = hai[i=1].add(hai[i-2]);
            // �Z�o�����l�����v����ϐ��ɑ���
			ryuka = ryuka .add(hai[i-2])
			// �������l��\��
		    System.out.println(luka);
			
	}
}
