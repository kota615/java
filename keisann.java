class keisan
{
	public static void main(string argv[])
	{
		system.out.println("hello,world!")
		// 入力：2つの数値を入力
		int in0= new java.utill.scanner(system.in).nextInt();
		int in1= new java.utill.scanner(system.in).nextInt();
		system.out.printIn(in0+","+in1);
		
		// 処理：足し算
		int add = in0+in1;
		// 処理：引き算
		int add = in0-in1;
		// 処理：掛け算
		int a=in0*in1;
		// 処理：割り算
		int b=in0/in1;
		//　処理：余り
		int c=in0%in1;
		
		//　計算結果を出力
		system.out.println("足し算:"+add);
		system.out.println("引き算:"+sub);
	    system.out.println("掛け算:"+a);
	   	system.out.println("割り算:"+b);
	   	system.out.println("余り"+c);
	