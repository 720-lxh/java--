package digui;

import java.util.Scanner;

public class QiPan {
	
	int qiPan[][];
	int q=0;
	
	public void sort(int tr,int tc,int dr,int dc,int size) {
		if(size==1) {
			return;
		}
		int t=q++;
		int s=size/2;
		if(dr<tr+s && dc<tc+s) {
			sort(tr,tc,dr,dc,s);
		}else {
			qiPan[tr+s-1][tc+s-1]=t;
			sort(tr,tc,tr+s-1,tc+s-1,s);
		}
		if(dr>=tr+s && dc<tc+s) {
			sort(tr+s,tc,dr,dc,s);
		}else {
			qiPan[tr+s][tc+s-1]=t;
			sort(tr+s,tc,tr+s,tc+s-1,s); 
		}
		if(dr<tr+s && dc>=tc+s) {
			sort(tr,tc+s,dr,dc,s);
		}else {
			qiPan[tr+s-1][tc+s]=t;
			sort(tr,tc+s,tr+s-1,tc+s,s);
		}
		if(dr>=tr+s && dc>=tc+s) {
			sort(tr+s,tc+s,dr,dc,s);
		}else {
			qiPan[tr+s][tc+s]=t;
			sort(tr+s,tc+s,tr+s,tc+s,s);
		}
	}

	public QiPan(int dr,int dc,int size) {
		qiPan = new int[size][size];
		int tr=0,tc=0;
		sort(tr,tc,dr,dc,size);
		qiPan[dr][dc]=-1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(qiPan[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int size,dc,dr;
		System.out.print("输入棋盘大小和特殊点");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		dr = sc.nextInt();
		dc = sc.nextInt();
		sc.close();
		new QiPan(dr,dc,size);
	}

}
