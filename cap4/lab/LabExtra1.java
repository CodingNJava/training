package cap4.lab;

public class LabExtra1 {
	public static void main(String[] args) {
		double salario = 4000;
		double ir = 0;
		String prtout = "O valor em imposto é de ";
		
		if (salario <= 1.903) {
			ir = 0;
		} else if (salario <= 2.826) {
			ir = salario * 0.075 - 142.80;
			System.out.println(prtout + " " + ir);
		} else if (salario <= 3.751) {
			ir = salario * 0.15 - 354.80;
			System.out.println(prtout + " " + ir);
		} else if (salario <= 4.664) {
			ir = salario * 0.22 - 636.13;
			System.out.println(prtout + " " + ir);
		} else {
			ir = salario * 0.285 - 869.36;
			System.out.println(prtout + " " + ir);
		}
	}
}
