enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday

}
public class Enum {
    public static void main(String[] args) {
        Day today = Day.Monday;
        switch (today) {
            case Monday:
                System.out.println("Start of the week");
                break;
        case Tuesday:
                System.out.println("Second day of the week");           
break;

                case Wednesday:
                System.out.println("Midweek");  
                break;
                case Thursday:
                System.out.println("Almost weekend");   
                break;
                case Friday:
                System.out.println("Last day of the workweek"); 
                break;
                case Saturday:  
                System.out.println("Weekend!");
                break;
                case Sunday:
                System.out.println("Weekend!");
                break;
                
        }
    }
}   