package digui;

import java.util.*;

public class QuanPaiLie {

	int[] shuZu;
	
	public QuanPaiLie(int shuZu[],int no1,int no2) {
		this.shuZu = shuZu;
		prem(no1,no2);
	}
	
	public void prem(int i,int j) {
		if(i==j) {
			for(int l=0;l<=i;l++)
				System.out.print(shuZu[l]);
			System.out.println();
		}else {
			for(int k=i;k<=j;k++) {
				change(i,k);//交换数组位置
				prem(i+1,j);//递归
				change(i,k);//交换数组位置
			}
		}
	}
	
	public void change(int i,int j) {
		int a;
		a=shuZu[i];
		shuZu[i]=shuZu[j];
		shuZu[j]=a;
	}//交换数组位置
	
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		int[] shuZu = new int[i];
		for(j=0;j<i;j++) {
			shuZu[j] = sc.nextInt();
		}
		new QuanPaiLie(shuZu,0,i-1);//全排列
		System.out.println();
		sc.close();
		
		
		int a[] = {1,2,3,4,5,6};
		int b[] = new int[3];
		for(i=0;i+1<5;i++){
			for(int k=i+2;k<=5;k++){
				b[0]=a[i];
				b[1]=a[i+1];
				b[2]=a[k];
				new QuanPaiLie(b,0,2);
			}
		}//6个中在3个全排列
	}
}
