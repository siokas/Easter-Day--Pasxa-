
public class Easter {

	public static void main(String[] args) {
		int x = 2080;
		int z1 = x/19;
		int a = x%19;
		int b = x/100;
		int c = x%100;
		int d = b/4;
		int e = b%4;
		int z = (8*b+13)/25;
		int h = (19*a+b-d-z+15)%30;
		int m = (a+11*h)/319;
		int th = c/4;
		int k = c%4;
		int l = (e*e+2*th-k-h+m+32)%7;
		int n = (h-m+l+90)/25;
		int p = (h-m+l+n+19)%32;

		System.out.println(p+" .. "+n);
	}

}
