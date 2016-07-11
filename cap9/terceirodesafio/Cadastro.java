package cap9.terceirodesafio;

/*Baseando-se nos arquivos do pacote 
cap9.segundodesafio, faça:
1) Altere as classes Funcionario, Programador, Chefe
	e Motorista para que ao instanciar objetos destas classes na classe Cadastro
	as informações sejam passadas exatamente no momento da instanciação. Ou seja,
	os valores dos atributos de cada objeto serão passados pelos respectivos
	construtores - o método setDados não será usado! 
*/

class Cadastro {
   public static void main(String args[]){
     Funcionario f = new Funcionario("Pedro",  1000,18);
//	   Funcionario f = new Funcionario();
//       f.setDados("Pedro",  1000,18);
       f.reajustarSalario();
       f.imprimir();
       
       
	   Programador p = new Programador("João",  8000,22,"Java");
//       p.setDados("João",  8000,22,"Java");
       p.reajustarSalario();
       p.imprimir();
       
	  
       Motorista m = new Motorista("Maria",  3000,25,400);
//		m.setDados("Maria",  3000,25,400);
       m.reajustarSalario();
       m.imprimir();
       
       
       Chefe c = new Chefe("José", 20000,35, "9999-4000");
		
//       c.setDados("José", 20000,35, "9999-4000");
       c.reajustarSalario();
       c.imprimir();
       
     
   }
}

/*
---------- Capture Output ----------
> "C:\Arquivos de programas\Java\jdk1.6.0_10\bin\java.exe" Cadastro
Nome: Pedro
Idade: 18
Salário: 1100.0
--------Dados do Programador ------------------------------
Nome: João
Idade: 22
Salário: 8300.0
Linguagem: Java
--------Dados do Motorista ------------------------------
Nome: Maria
Idade: 25
Salário: 3200.0
Cnh: 400
--------Dados do Chefe ------------------------------
Nome: José
Idade: 35
Salário: 20100.0
Celular: 9999-4000
> Terminated with exit code 0.

*/