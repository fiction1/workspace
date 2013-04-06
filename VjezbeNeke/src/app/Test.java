package app;




public class Test {


	public static void main(String[] args) {
		int a=1; //1kg== 35.27 ounces == 2.204 lbs // 1 lbs==16 oz
		
		float a1= a*35.27f;
		float a2= a%a1;
		int a3= (int)a1/16;
		
		

		
		System.out.format("%dlbs %.2f oz",a3,a2);
		System.out.println();
		
		
		// prvi razlomak "d" brojnik, g nazivnik.. !!!h!!! je prvi razlomak
		double d= Math.log(100*10);

		
		double g= 1d/100d;
		double h= d/g;
		
		
		
		//drugi razlomak, i je brojnik , j je brojnik razlomka u nazivniku drugog razlmoka
		double e=Math.pow(Math.pow(14661d, 6d), 1d/3d);
		double f= Math.pow(Math.sqrt(16)*(Math.sqrt(64)+16/Math.sqrt(4d)), 1d/3d);
		double i = e*f;
		
		double a4=Math.pow(Math.log(100)*10,4);
		double j = Math.pow(a4, 1d/2d);
		double k=Math.pow((1d/2d), -1d);
		double l=j/k;
		
		double m=Math.pow((1d/2d)*Math.pow(16d, 1d/2d), 1d/2d);
		double n= Math.sin(30d)*Math.cos(60d);
		double o=l*m*n;
		double p=i/o;
		double hp=h*p;
		
		//
		double brojnik=d*i;
		System.err.println(brojnik);
		
		
		System.out.println(hp);
		
	}

}
