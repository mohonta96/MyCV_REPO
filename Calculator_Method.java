import javax.swing.InputMap;
import javax.swing.text.html.HTMLDocument.RunElement;

public class Calculator_Method{
    
    double x, y, result, n;

    public double sum(double x, double y){
        result = x+y;
        return result;
    }

    public double substruct(double x, double y){
        result = x-y;
        return result;
    }
    public double mul(double x, double y){
        result = x*y;
        return result;
    }
    public double div(double x, double y){
        result = x/y;
        return result;
    }
    public double mod(double x, double y){
        result = x%y;
        return result;
    }

    public double fact_f(double x){
        double facto = 1;
        for(double i =1; i<=x; i++){
            facto *= i;
        }
        return facto;
    }
      //-----------------------------------edit from here-----------
      //------------------------------------------------------------
    public double Sqrt(double x){
        result = Math.sqrt(x);
        return result;
    }

    public double Cos(double x){
        result = Math.cos(x);
        return result;
    }

    public double Sin(double x){
        result = Math.sin(x);
        return result;
    }

    public double Tan(double x){
        result = Math.tan(x);
        return result;
    }

    public double Cosh(double x){
        result = Math.cosh(x);
        return result;
    }

    public double Sinh(double x){
        result = Math.sinh(x);
        return result;
    }

    public double Tanh(double x){
        result = Math.tanh(x);
        return result;
    }

    public double Squre_f(double x){
        result = Math.pow(x, 2);
        return result;
    }

    public double Qube_f(double x){
        result = Math.pow(x, 3);
        return result;
    }

    public double Pow_f(double x, double y){
        result = Math.pow(x, y);
        return result;
    }
   
    public double nPr(double n, double r){
        double dif = n-r;
        result = fact_f(n)/fact_f(dif);
        return result;
    }
    public double nCr(double n, double r){
        double diff = n-r;
        result = (fact_f(n)/(fact_f(r)*fact_f(diff)));
        return result;
    }
///----------aready edited -----------


    public double Abs_f(double x){
        result = Math.abs(x);
        return result;
    }

    
    public double log_f(double x, double y) {
        return  (Math.log(x) / Math.log(y));
    }

    public double log_2_base_f(double x) {
        return  (Math.log(x) / Math.log(2) + 1e-10);
    }


    public double PI_f(double x){
        result = Math.PI*x;
        return result;
    }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

          //-----------------------------------edit from here-----------
      //------------------------------------------------------------
    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }
    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

    // public double mod(double x, double y){
    //     result = x%y;
    //     return result;
    // }

}