package lab6;

public class ThrowUsedCarException {
    public static void main(String[] args){
        UsedCar[] used = new UsedCar[7];
        int count = 0;
        Object[][] data = {
                {"1234", "Ford", 2010, 50000, 10000.0},
                {"123", "Toyota", 2012, 40000, 12000.0},
                {"5678", "BMW", 2015, 30000, 20000.0},
                {"9012", "Honda", 1990, 150000, 1000.0},
                {"3456", "Chrysler", 2016, 20000, 15000.0},
                {"7890", "Other", 2005, -100, 5000.0},
                {"4321", "Honda", 2017, 10000, 18000.0}
        };

        for(Object[] row : data){
            try{
                UsedCar car = new UsedCar((String)row[0], (String)row[1], (int)row[2], (int)row[3], (double)row[4]);
                used[count++] = car;
            }catch (UsedCarException e){
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println(used[i].toString());
        }

    }
}
