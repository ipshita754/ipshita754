class fibonacciSeries{
	public static void main(String[]args){
		int x,y,z;
		x=1;
		y=1;
		while(x<=34){
			System.out.println(x);
			z=x+y;
			x=y;
			y=z;
		}
	}
}
