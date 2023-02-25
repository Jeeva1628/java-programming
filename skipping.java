
import java.util.*;
class m
{
static void print_result(int a[], int n,int k, int m)
{

	for(int i = 0; i < m; i++)
		v.add(new Vector<Integer>());

	for (int i = 0; i < n; i++)
	{

		int rem = a[i] % m;

		v.get(rem).add(a[i]);
		
	
		if (v.get(rem).size() == k)
		{
			for (int j = 0; j < k; j++)
				System.out.print(v.get(rem).get(j) + " ");
			return;			
		}
	}
	
	
	System.out.print("-1");
}

public static void main(String[] args)
{
	int a[] = { 1, 8, 4 };
	int n = a.length;
	print_result(a, n, 2, 3);
}
}
