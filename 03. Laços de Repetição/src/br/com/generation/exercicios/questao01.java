package br.com.generation.exercicios;


/* # (Exercicio de Repetição)
 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
 obtemos resto = 5*/

public class questao01 {

	 	
		public static void main(String[] args) {

			int cont = 0;

			System.out.println("#### Números de 1000 a 1999 que quando divididos por 11 tem resto igual a 5:####\n");
			for (int i = 1000; i < 2000; i++) {
				if (i % 11 == 5) {
					System.out.print(i + " ");
					cont++;
				}
				if (cont == 7) {
					System.out.println();
					cont = 0;
				}
			}
		}

	}

/*
  Saída do Console após executar o código:

#### Números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5:####

			1006 1017 1028 1039 1050 1061 1072 
			1083 1094 1105 1116 1127 1138 1149 
			1160 1171 1182 1193 1204 1215 1226 
			1237 1248 1259 1270 1281 1292 1303 
			1314 1325 1336 1347 1358 1369 1380 
			1391 1402 1413 1424 1435 1446 1457 
			1468 1479 1490 1501 1512 1523 1534 
			1545 1556 1567 1578 1589 1600 1611 
			1622 1633 1644 1655 1666 1677 1688 
			1699 1710 1721 1732 1743 1754 1765 
			1776 1787 1798 1809 1820 1831 1842 
			1853 1864 1875 1886 1897 1908 1919 
			1930 1941 1952 1963 1974 1985 1996 

*/
