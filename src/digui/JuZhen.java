package digui;

import java.util.Scanner;

public class JuZhen {
	
	int min;
	int b=1;;
	
	public int sort(int p[],int i,int j) {
		int l=2100000000;
		if(i==j){
			l=0;
		}else {
			for(int k=i;k<j;k++) {
				int u=sort(p,i,k)+sort(p,k+1,j)+p[i-1]*p[k]*p[j];
				if(u<l)
					l=u;
			}
		}
		return l;
	}
	
	public JuZhen(int p[],int i,int j) {
		min = sort(p,i,j);
	}
	
	public void print() {
		System.out.print(min);
	}

	public static void main(String[] args) {
		int i;
		int p[];
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		p = new int[i+1];
		for(int j=0;j<=i;j++) {
			p[j] = sc.nextInt();
		}
		JuZhen a = new JuZhen(p,1,i);
		sc.close();
		a.print();
	}

}
