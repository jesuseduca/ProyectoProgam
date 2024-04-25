/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entornosgit;

public class EntornosGit {

	public static void main(String[] args) {
	
		int[][] num=new int[3][6];
		int fila=0;
		int columna=0;
		num[0][0]=0;
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		
		/*for(i=0;i<3;i++) {
			for(j=0;j<6;j++) {
				System.out.println("Fila: " + i + " Columna: " + j + " valor " + num[i][j]);
			}
		}
		*/	
		System.out.print("    ");
		for(columna=0;columna<6;columna++) {
			System.out.print(" Col " + columna);
		}
		for(fila=0;fila<3;fila++) {
			System.out.print("\nFila" + fila);
			
			for(columna=0; columna<6;columna++) {
				System.out.printf("%3d   ",num[fila][columna]);
			}
		}
	}

}
