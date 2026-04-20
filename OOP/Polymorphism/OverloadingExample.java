
class PropertyTax{


    public double calculateTax(int areaInSqFt){
        return areaInSqFt * 10;
    }

    public double calculateTax(double propertyValue){
        return  propertyValue * 0.02;
    }

    public double calculateTax(double areaInSqFt, double ratePerSqFt){
        return areaInSqFt * ratePerSqFt;
    }

    public double calculateTax(double propertyValue, int serviceCharge){
        return (propertyValue * 0.015) + serviceCharge ;
     }
    
}





public class OverloadingExample {
    public static void main(String[] args) {
        PropertyTax taxCalculator = new PropertyTax();

        int area = 1500;
        double propertyValue = 500000;
        double ratePerSqFt = 12.5;
        int serviceCharge = 2000;

        System.out.println("Tax based on area: " + taxCalculator.calculateTax(area));
        System.out.println("Tax based on property value: " + taxCalculator.calculateTax(propertyValue));
        System.out.println("Tax based on area and rate: " + taxCalculator.calculateTax(area, ratePerSqFt));
        System.out.println("Tax based on property value and service charge: " + taxCalculator.calculateTax(propertyValue, serviceCharge));
    }
    
}
