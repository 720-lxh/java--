package digui;

public class YouChongQuanPaiLie {
	
	int shuZhu[];
	
	public void sort(int i,int j) {
		int a = shuZhu[i];
		shuZhu[i] = shuZhu[j];
		shuZhu[j] = a;
	}
	
	public void prem(int i,int j) {
		int a[] = new int[(j-i)];
		int c=0;
		if(i==j) {
			for(int k=0;k<j;k++) {
				System.out.print(shuZhu[k]);
			}
			System.out.println();
		}
		for(int k=i;k<j;k++) {
			if(shuZhu[i]==shuZhu[k]&&i!=k) {
				continue;
			}
			int b=1;
			for(int l=0;l<(j-i);l++) {
				if(a[l]==shuZhu[k])
					b = 0;
			}
			if(b==1) {
				a[c++]=shuZhu[k];
				sort(k,i);
				prem(i+1,j);
				sort(k,i);
			}
		}
	}
	
	public YouChongQuanPaiLie(int a[],int low,int high) {
		shuZhu = new int[high];
		for(int i=low;i<high;i++) {
			shuZhu[i] = a[i];
		}
		prem(low,high);
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,3};
		new YouChongQuanPaiLie(a,0,4);
	}

}
