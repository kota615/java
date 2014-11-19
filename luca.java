// 検索ワード：java プリミティブ型
// 使うクラス:　プリミティブ

class lucas
{
	public static void main(String argv[])
	{

		// リュカ数列（1～100項まで計算して、合計を表示）
		// 合計を入れる変数を定義して、0を代入しておく
		double luka = 0; 
		////　配置の定義（100項まで）
		double [] hai = new double [101]
		//// 0項目の初期化
		hai[0] = 0;
		//// 1項目の初期化
		hai[1] = 1;
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
