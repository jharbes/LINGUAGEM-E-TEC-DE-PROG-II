import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Digite o valor de A:");
		a=teclado.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b=teclado.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c=teclado.nextDouble();
		
		System.out.printf("%nTRIÂNGULO: %.3f%n",(a*c)/2);
		System.out.printf("CIRCULO: %.3f%n",3.14159*c*c);
		System.out.printf("TRAPÉZIO: %.3f%n",((a+b)/2)*c);
		System.out.printf("QUADRADO: %.3f%n",b*b);
		System.out.printf("RETÂNGULO: %.3f%n",a*b);
	}

}
