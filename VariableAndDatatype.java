public class VariableAndDatatype {

    public static void main(String[] args) {
        //bit
        byte a=1;
        short b=2;
        int c=10;
        long  d = 1001;
        boolean f = true;
        double s = 13.4;
        char w = 'C';
        float q =12.4f;

        System.out.println(a);
         System.out.println(b);
          System.out.println(c);
           System.out.println(d);
        System.out.println(f);
        System.out.println(s);
        System.out.println(w);
        System.out.println(q);



        //Arithmatic Opearators

        int num1 =10 ;
        int num2 = 5;
        //+ - * / %
        System.err.println(num1% num2);
         System.err.println(num1+num2);
          System.err.println(num1- num2);
           System.err.println(num1* num2);
            System.err.println(num1/ num2);

        // used to perform basic mathematic calculations on premitive datatypes  
        
        
        //Reratinal OPerators[ < > <= >= == !=]

        System.out.println(num1 > num2); //true
        System.out.println(num2 > num1); //false
         
        num2 = 10;
        System.out.println(num1>= num2); //true
        System.out.println(num1 <= num2); // true

        System.out.println(num1 != num2); //false



        //Logical Operators [&& || !]

        // num++; ---post-increment
        //++num;  ---pre-incfement

        
        int num =7;
        int result = num++; 
        System.out.println(result); // firts fecth values
        System.out.println(num); // prints the values


        int l = 3;
        int m = 4;
        int n = a++ + ++b + --a;  
        System.out.println(n);





    }
    
}
