class bunki
{

	public static void main(string argv[])
	{

		// 答えの値
		int kotae=0;
		// 入力：数値1、記号、数値２の順番に入力
		//System.out.print("数値１＝");
		int in0 = new java.utill.scanner(system.in).nextInt();
		System.out.print(
			"足し算（＋）、引き算（-）、掛け算（＊）、割り算（/)、余り（％）のどれか=");
		// string型の変数kigouに、上記の記号入力
		String kigou = new java.util.Scanner(System.in).nextLine();
		System.out.print("数値2=");
		int in1 = new java.utill.Scanner(system.in).nextInt();
	
		// 処理：記号に応じて計算


		// 出力：計算結果を出力
		// 「数値１　計算記号　数値２＝答え」
		System.out.println(""+in0+kigou+in1+"="+kotae);
	
	}

}

