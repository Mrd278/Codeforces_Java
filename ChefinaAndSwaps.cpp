// My Template File For Competitive Programming

#include<bits/stdc++.h>
using namespace std;

#define fo(i,s,n) for(int i = s; i < n; i++)
#define deb(x) cout<<#x<<" is "<<x<<'\n';
#define x first
#define y second
#define mod 1e9+7

typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ull;


//// Binary Exponentiation
// template<typename T>
//T binpow(T a, T b)
//{
//	T res = 1;
//	while(b > 0)
//	{
//		if(b & 1)
//			res *= a;
//		a *= a;
//		b>>= 1;	
//	}
//	return res;
//}
//
//// Modular Binary Exponentiation
// template<typename T>
//T modbinpow(T a, T b, T m) {
//    a %= m;
//    lli res = 1;
//    while (b > 0) {
//        if (b & 1)
//            res = res * a % m;
//        a = a * a % m;
//        b >>= 1;
//    }
//    return res;
//}
//
//// Binary GCD
//template<typename T>
//T gcd(T a, T b) {
//    if (!a || !b)
//        return a | b;
//    unsigned shift = __builtin_ctz(a | b);
//    a >>= __builtin_ctz(a);
//    do {
//        b >>= __builtin_ctz(b);
//        if (a > b)
//            swap(a, b);
//        b -= a;
//    } while (b);
//    return a << shift;
//}
//
//// Extended version of Euclidean Algorithm (a.x + b.y = gcd(a,b))
//template<typename T>
//T gcd(T a, T b, T& x, T& y){
//    x = 1, y = 0;
//    T x1 = 0, y1 = 1, a1 = a, b1 = b;
//    while (b1) {
//        T q = a1 / b1;
//        tie(x, x1) = make_tuple(x1, x - q * x1);
//        tie(y, y1) = make_tuple(y1, y - q * y1);
//        tie(a1, b1) = make_tuple(b1, a1 - q * b1);
//    }
//    return a1;
//}
//
//// Diophantine Algorithm (a.x + b.y = c)
//template <typename T>
//bool find_any_solution(T a, T b, T c, T &x0, T &y0, T &g) {
//    g = gcd(abs(a), abs(b), x0, y0);
//    if (c % g) {
//        return false;
//    }
//
//    x0 *= c / g;
//    y0 *= c / g;
//
//    if (a < 0) x0 = -x0;
//    if (b < 0) y0 = -y0;
//    return true;
//}
//
//template<typename T>
//void shift_solution(T & x, T & y, T a, T b, T cnt) {
//    x += cnt * b;
//    y -= cnt * a;
//}
//// To find the count of all the soltuions in a given range
//template<typename T>
//T find_all_solutions(T a, T b, T c, T minx, T maxx, T miny, T maxy) {
//    T x, y, g;
//    if (!find_any_solution(a, b, c, x, y, g))
//        return 0;
//    a /= g;
//    b /= g;
//
//    T sign_a = a > 0 ? +1 : -1;
//    T sign_b = b > 0 ? +1 : -1;
//
//    shift_solution(x, y, a, b, (minx - x) / b);
//    if (x < minx)
//        shift_solution(x, y, a, b, sign_b);
//    if (x > maxx)
//        return 0;
//    T lx1 = x;
//
//    shift_solution(x, y, a, b, (maxx - x) / b);
//    if (x > maxx)
//        shift_solution(x, y, a, b, -sign_b);
//    T rx1 = x;
//
//    shift_solution(x, y, a, b, -(miny - y) / a);
//    if (y < miny)
//        shift_solution(x, y, a, b, -sign_a);
//    if (y > maxy)
//        return 0;
//    T lx2 = x;
//
//    shift_solution(x, y, a, b, -(maxy - y) / a);
//    if (y > maxy)
//        shift_solution(x, y, a, b, sign_a);
//    T rx2 = x;
//
//    if (lx2 > rx2)
//        swap(lx2, rx2);
//    T lx = max(lx1, lx2);
//    int rx = min(rx1, rx2);
//
//    if (lx > rx)
//        return 0;
//    return (rx - lx) / abs(b) + 1;
//}
//
//// Fibonacci number this func returns a pair (fn, f(n+1))
//template <typename T>
//pair<T,T> fib(T n)
//{
//	if(n == 0)
//		return {0,1};
//	auto p = fib(n >> 1);
//	T c = p.x(2*p.y - p.x);  
//	T d = p.x * p.x + p.y*p.y;
//	if(n&1)
//		return {d, c+d};
//	else
//		return {c,d};
//}


void solve()
{
	ll n,k;
	cin>>n;
	vector<ll> a(n);
	vector<ll> b(n);
	map<ll, ll> m;
	bool flag = true; 
	for(int i = 0; i < n; i++)
	{
		cin>>a[i];
		m[a[i]]++;
	}	
	for(int i =0; i < n; i++)
	{
		cin>>b[i];
		m[b[i]]++;
	}
	
	for(auto val :m)
	{
		if(val.second & 1)
		{
			flag = false;
			break;
		}
	}
	
	sort(a.begin(), a.end());
	sort(b.begin(), b.end());
	
	k = min(a[0],b[0]);
	
	if(a == b)
		cout<<"0"<<'\n';
	else
	{
		if(!flag)
		{
			cout<<"-1"<<endl;
		}
		else
		{
			ll ex = 0;
			for(auto val:m)
			{
				if(find(a.begin(), a.end(), val.first) != a.end())
				{
					if(count(a.begin(), a.end(), val.first) > val.second >> 1)
						ex += count(a.begin(), a.end(), val.first) - (val.second >> 1);
				}
			}
			cout<<k * ex<<endl;
		}
	}
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cout<<fixed;
	cout<<setprecision(10);
	
	ll t;
	cin>>t;
	while(t--)
		solve();
	return 0;
}
