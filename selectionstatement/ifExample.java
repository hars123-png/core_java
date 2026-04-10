package selectionstatement;

public class ifExample {
    public static void main(String[] args) {
        int age =12;

        if (age >= 18)
        {
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not Eligible for vote");
        }


       //(condition) ? (value is true): (value is false)
       // ternary operator

      //  String result =(age >=18)?"Eligible for vote" : "Not Eligible for vote";
       // System.out.println(result); 



        //else if

        int marks= 75;

        if (marks >=90){
            System.out.println("Grade A");
        }

        else if(marks>=70)
        {
            System.out.println("grade B");
        }
        else if(marks>=50){
            System.out.println("garde C");
        }
        else
        {
            System.out.println("Fail");
        }
          


        String result = (marks>=90)? "Grade A":
                        (marks>=70)? "Grade B":
                        (marks>=50)? "Grade C": "Fail";
            System.out.println(result);            
         

        //nested if

        int age1 =22;
        boolean haslicence = true;

        if (age1>= 18){
            if (haslicence){
                System.out.println("you can drive");
            }
            else{
                System.out.println("yuo need licence");
            }

        }
        else{
            System.out.println("you are not eligible");
        }


        int year = 2024;
        if(year % 4==0){
            System.out.println("Year is Leaf year");
        }
        else{
            System.out.println("Year is not leaf year");
        }


    }
    
}
