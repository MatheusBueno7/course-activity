public class Main {
    public static void main(String[] args) {
        String product1= "Computer";
        String product2= "Office Desk";

        int age=30;
        int code=5290;
        char gender='f';
        double price1=2100.0;
        double price2=650.50;
        double measure=53.234567;

          System.out.printf("Products:" +
                  "%s whice price is $ %4f %n",product1,price1);
          System.out.printf(" %s whice price is $ %.2f %n",product2,price2);
          System.out.printf(" Record:%d old, code %s and gender:%c %n",age,code,gender);
          System.out.printf("Measure with eight decimal places: %.8f %n",measure);
          System.out.printf("Rounded(three decimal places): %.3f %n",measure);
          System.out.printf("US Decimal point:%.3f %n",measure);



    }
}