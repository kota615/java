import java.math.*;

// 検索ワード：java プリミティブ型
// 使うクラス:　プリミティブ

class lucas
{
	public static void main(String argv[])
	{

		// リュカ数列（1～100項まで計算して、合計を表示）
		// 合計を入れる変数を定義して、0を代入しておく
		//　Biginteger型でlukaを定義して0を代入
		BigInteger luca = new BigInteger("0");
		//// BigInteger型の配置の定義
		double luka = 0; 
		//// BigInteger型の配置の定義（100項まで）
		BigInteger [] hai = new BigInteger[101]
		//// 0項目の初期化
		hai[0] = new BigInteger("2");
		//// 1項目の初期化
		hai[1] = new BigInteger("1");
		//// 2～100項の計算
		///// 2～100までのループをfor文で書く
		for (int i=2 ; i<=100 ; i++){
			hai[i] = hai[i=1] + hai[i-2];
			// 算出した値を合計する変数に足す
			luka = luka + hai[i];
			// 足した値を表示
		    System.out.println(luka);
			
	}
}
