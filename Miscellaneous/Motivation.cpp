#include <iostream> 

using namespace std;
struct movie
{
	int s;
	int r;
};
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int x,n,highrat=0;
		cin>>n>>x;
		struct movie arr[n];
		for(int i=0;i<n;i++)
			cin>>arr[i].s>>arr[i].r;
		for(int i=0;i<n;i++)
		{
			if(arr[i].s <= x)
			{
				if(arr[i].r>highrat)
					highrat = arr[i].r;
			}
		}
		cout<<highrat<<endl;
	}
	    return 0;
}