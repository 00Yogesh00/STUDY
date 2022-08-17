class Main
{
	public static void main(String []argv){

		int a,b,c,d;

		a = 5;
		b = 3;

		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+a*b);
		System.out.println(a+" / "+b+" = "+(float)a/b);
		System.out.println(a+" % "+b+" = "+a%b);
		a = 5;
		c = a++;
		d = ++a;


		System.out.printf("\n"+a + c + d + a++ + ++a + a-- + a++);

		System.out.printf("\n %d\n %d\n %d\n %d\n %d\n %d\n %d",a,c,d,a++,++a,a--,a++);



	}
}
