public class zad3 {
    public static void main(String[] args){
        MyDate date = new MyDate(20, 5, 2020);
        date.DisplayDate();
    }
}
class MyDate{
    private int day;
    private int month;
    private int year;
    MyDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        if(day >= 0 && day <= 31){
            this.day = day;
        }
        else{
            System.out.println("BŁĄD!");
            this.day = 1;
        }
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        if (month >= 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Błąd!");
            this.month = 1;
        }
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(year >= 1990 && day <= 2050){
            this.year = year;
        }
        else{
            System.out.println("BŁĄD!");
            this.year = 1990;
        }
    }
    public void DisplayDate(){
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
