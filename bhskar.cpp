#include<bits/stdc++.h>
using namespace std;

int_fast32_t main(){
    double d, a, b, c;
    cout<<"enter a, b, c graduly";
    cin>>a>>b>>c;
    d = (b*b)-4*(a*c);

    if(d>0 && d!=0){
        double x, y;
        x = (-b+sqrt(d))/(2*a);
        y = (-b-sqrt(d))/(2*a);
        printf("x is: %.5lf\n", x);
        printf("y is: %.5lf\n", y);
    }
    else{
        cout<<"Eror math"<<endl;
    }
}