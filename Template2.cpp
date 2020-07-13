//Chaos///
 
#pragma GCC optimize("O3", "unroll-loops")
#pragma GCC target("avx2")
#include<bits/stdc++.h> 
#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp> 
using namespace __gnu_pbds; 
using namespace std;
#if DEBUG && !ONLINE_JUDGE
    #define debug(args...)     (Debugger()) , args
    class Debugger{
        public:
        Debugger(const std::string& _separator = ", ") :
        first(true), separator(_separator){}
        template<typename ObjectType>
        Debugger& operator , (const ObjectType& v){
            if(!first) std::cerr << separator; std::cerr << v;first = false;return *this;
        }
        ~Debugger() {std::cerr << endl;}
        private:
        bool first;std::string separator;
    };
    template <typename T1, typename T2>
    inline std::ostream& operator << (std::ostream& os, const std::pair<T1, T2>& p){
        return os << "(" << p.first << ", " << p.second << ")";}
    template<typename T>
    inline std::ostream &operator << (std::ostream & os,const std::vector<T>& v){
        bool first = true;os << "[";
        for(unsigned int i = 0; i < v.size(); i++){
            if(!first) os << ", "; os << v[i]; first = false;} return os << "]";}
    template<typename T>
    inline std::ostream &operator << (std::ostream & os,const std::set<T>& v){
        bool first = true;os << "[";
        for (typename std::set<T>::const_iterator ii = v.begin(); ii != v.end(); ++ii){
            if(!first) os << ", "; os << *ii; first = false;} return os << "]";}
    template<typename T>
    inline std::ostream &operator << (std::ostream & os,const std::multiset<T>& v){
        bool first = true;os << "[";
        for (typename std::multiset<T>::const_iterator ii = v.begin(); ii != v.end(); ++ii){
            if(!first) os << ", "; os << *ii; first = false;} return os << "]";}
    template<typename T>
    inline std::ostream &operator << (std::ostream & os,const std::unordered_set<T>& v){
        bool first = true;os << "[";
        for (typename std::unordered_set<T>::const_iterator ii = v.begin(); ii != v.end(); ++ii){
            if(!first) os << ", "; os << *ii; first = false;} return os << "]";}
    template<typename T1, typename T2>
    inline std::ostream &operator << (std::ostream & os,const std::map<T1, T2>& v){
        bool first = true;os << "[";
        for (typename std::map<T1, T2>::const_iterator ii = v.begin(); ii != v.end(); ++ii){
            if(!first) os << ", "; os << *ii ;first = false;} return os << "]";}
#else
    #define debug(args...)                 
#endif
const int mod = 1000000007;
// const int mod = 998244353;
#define ok order_of_key
#define fo find_by_order
#define ordered_set tree<int, null_type,less<int>, rb_tree_tag,tree_order_statistics_node_update> 
#define ll long long
#define rep(i,a,b) for(int i=(a);i<(b);i++)
#define repp(i,n) for(int i=(0);i<(n);i++)
#define repr(i,n) for(int i=(n);i>=0;i--)
#define repl(i,a,b) for(ll i=(a);i<(b);i++)
#define newl cout<<'\n'
#define inf 1000000000
#define repaa(i,a) for(auto i=a.rbegin();i!=a.rend();++i)
#define pb push_back 
#define test cout<<"test"<<endl
#define tc int tt;cin>>tt;while(tt--)
#define mem(v,i) memset(v,i,sizeof(v))
#define all(x) x.begin(), x.end()
#define inf1 1e18
#define repa(i,a) for (auto i : a)
#define X first
#define Y second
#define lb lower_bound
#define ub upper_bound
#define gcd(a,b)    __gcd((a),(b))
#define lcm(a,b)    ((a)*(b)) / gcd((a),(b))
#define in(a,n) repp(jjj,n)cin>>a[jjj];
#define intree(a,m) repp(i,m){int tmp1,tmp2;cin>>tmp1>>tmp2;tmp1--,tmp2--;a[tmp1].eb(tmp2);a[tmp2].eb(tmp1);}
#define ins insert
#define er erase
#define sz(a) (int)(a.size())
#define print(x,n,k) repp(i,n){repp(j,k)cout<<x[i][j]<<"  ";newl;} 
#define mt make_tuple
#define eb emplace_back
#define bpl(i) __builtin_popcountll(i)
#define bp(i) __builtin_popcount(i)
#define precision(x) cout << fixed << setprecision(x);
#define si set<int>
#define usi unordered_set<int>
#define sl set < ll >
#define usl unordered_set < ll >
#define sip set < ip >
#define sil set < il > 
#define mi map<int , int >
#define umi unordered_map<int , int >
#define ml map < ll , ll>
#define uml unordered_map < ll , ll>
#define make_unique(x) sort(all((x))); (x).resize(unique(all((x))) - (x).begin())
#define srt(v) sort(all(v))
#define rsrt(v) sort(v.rbegin(), v.rend())
typedef long double ld;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector < vi > vii;
typedef vector<pair<int,int>> vip;
typedef vector<pair<ll,ll>> vil;
typedef vector < vl > vll;
typedef pair<int, int> ip;
typedef pair<ll, ll> il;
const int dx[4]={1,0,0,-1};
const int dy[4]={0,1,-1,0};
const int dxo[8] = {-1, -1, -1, 0, 1, 1, 1, 0};
const int dyo[8] = {-1, 0, 1, 1, 1, 0, -1, -1};
const char nl = '\n';
const char sp = ' ';
#ifdef Fading
#define gc getchar
#endif
#ifndef Fading
inline char gc(){static char now[1<<16],*S,*T;if (T==S){T=(S=now)+fread(now,1,1<<16,stdin);if (T==S) return EOF;}return *S++;}
#endif
ll R(ll B) {static mt19937_64 rng(chrono::steady_clock::now().time_since_epoch().count());return (unsigned long long)rng() % B;}
inline ll read(){register ll x=0,f=1;char ch=gc();while (!isdigit(ch)){if(ch=='-')f=-1;ch=gc();}while (isdigit(ch)){x=(x<<3)+(x<<1)+ch-'0';ch=gc();}return (f==1)?x:-x;}
template<typename T>T Min(T v) {return v;}template<typename T, typename... Args>T Min(T first, Args... args) {return min(first , Min(args...));}
template<typename T>T Max(T v) {return v;}
template<typename T, typename... Args> T Max(T first, Args... args) {return max(first , Max(args...));}
template<typename T> T mult(T v) {return v;} template<typename T, typename... Args>T mult(T first, Args... args) {return mult((first%mod * mult(args...))%mod);}
template<class T , class U> inline bool remax(T &a, U b) { return a < b ? a = b, 1 : 0; }
template<class T , class U> inline bool remin(T &a, U b) { return a > b ? a = b, 1 : 0; }
template<class A, class B> void add(A &a, B b){a += b;if(a >= mod) a -= mod;if(a < 0) a += mod;}
template<class A, class B> ll addr(A a, B b){a += b;if(a >= mod) a -= mod;if(a < 0) a += mod;return a;}
template<class T1,class T2>T2 min(T1 a,T2 b){return min((T2)a,b);}
template<class T1,class T2>T2 max(T1 a,T2 b){return max((T2)a,b);}
void pnt(char a){if(a == nl || a == sp) cout << a;else cout << a << sp;}
void pnt(string &a,int b = 0){cout << a << nl;}
template<class A> void pnt(A &a,int b=0) {cout << A(a + b) << sp;}
template<class A ,class B> void pnt(pair<A,B>&a,int b=0){cout << A(a.X+b) << ' ' << B(a.Y+b) << nl;}
template<class A> void pnt(vector<A>&a,int b=0) {repa(i,a) pnt(i,b);}
template<class A> void pnt(set<A>&a,int b=0) {repa(i,a) pnt(i,b);}
template<class A> void pnt(unordered_set<A>&a,int b=0) {repa(i,a) pnt(i,b) ;}
template<typename T1,typename T2>inline istream& operator>>(istream&i,pair<T1,T2>&v){return i>>v.X>>v.Y;}
template<class T>struct isChar{bool ch(T a){return false;}};
template<>struct isChar<char>{int ch(char s){return s == '`';}};
template<typename T>void W(T v){pnt(v);}
template<typename T,typename A>void W(T f,A s) {if(isChar<A>().ch(s)) pnt(f,1);else pnt(f) ,W(s);}
template<typename T,typename A,typename... Args>void W(T f,A s,Args... args) {if(isChar<A>().ch(s)) pnt(f,1), W(args...);else pnt(f),W(s,args...);}
template <class T1>void kill(T1 ans){pnt(ans);exit(0);}
ll nc2(ll a){return a * (a - 1) / 2;}
ll setbit(ll num, ll kk){ return 1LL*(num|(1LL<<kk)); }
ll unsetbit(ll num, ll kk){ return 1LL*(num&~(1LL<<kk)); }
ll invertbit(ll num, ll kk){ return 1LL*(num^(1LL<<kk)); }
bool kthbit(ll num, ll kk){ return num&(1LL<<kk); }
ll mceil(ll a, ll b){return a/b + (ll)(a%b > 0);}
ll poww(ll a, ll b,ll m = mod){ll val = 1;a %= m;while (b > 0){if (b & 1) val = (a * val) % m;a = (a * a) % m;b >>= 1;}return val;}
ll inv(ll a){return poww(a , mod - 2);}
ll gcdll(ll x, ll y){return y == 0 ? x : gcdll(y, x % y);}
int mylog(ll x , ll y = 2){if(x == 0) return -1;return mylog(x/y,y) + 1;}
 
//-----------------------------------------------------end--------------------------------------//
 
 
const int N = 1e5 + 5;
int Ca[N][2] , Cb[N][2] , CQ[N][2];
ip dp[N];
int n , m;
string a;
 
int Count(char a , int len , int st){
    int par = st & 1;
    st /= 2;
    if(a == 'a'){
        return Ca[st + len][par] - Ca[st][par];
    }
    else if(a == 'b'){
        return Cb[st + len][par] - Cb[st][par];
    }
    else {
        return CQ[st + len][par] - CQ[st][par];
    }
}
 
ip solve(int l){
    if(l >= n) return {0,0};
    if(dp[l].X != -1) return dp[l];
    ip val1 = solve(l + 1);
    ip val2 = {0,0};
    int par = l & 1;
    int a = Count('a' , (m + 1) / 2 , l) + Count('?' , (m + 1) / 2 , l);
    int b = Count('b' , m / 2 , l + 1) + Count('?' , m / 2 , l + 1);
    int q = Count('?' , (m + 1) / 2 , l) + Count('?' , m / 2 , l + 1);
    // if(l == 2) debug(Count('b',m/2,l+1),m/2);
    if(a == (m + 1) / 2 && b == m / 2) {
        ip tmp = solve(l + m);
        val2.X = 1 + tmp.X;
        val2.Y = q + tmp.Y;
    }
    if(val1.X == val2.X) dp[l] = val1.Y < val2.Y ? val1 : val2;
    else dp[l] = val1.X < val2.X ? val2 : val1;
    return dp[l];
}
 
signed main()
{
    ios_base::sync_with_stdio(false),cin.tie(0),cout.tie(0);
    cin >> n >> a >> m;
    repp(i,n){
        int ind = i / 2 + 1;
        int par = i % 2;
        Ca[ind][par] = Ca[ind - 1][par] + int(a[i] == 'a');
        Cb[ind][par] = Cb[ind - 1][par] + int(a[i] == 'b');
        CQ[ind][par] = CQ[ind - 1][par] + int(a[i] == '?');
    }
    repp(i,n) dp[i] = {-1,-1};
    debug(solve(0).X);
    W(solve(0).Y);
}   
// USE sz(a) insted of a.size() when comparing(INT VS UNSIGNED INT ERRORS)

