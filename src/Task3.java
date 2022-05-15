public class Task3 {
    public static void main(String[] args) {
        int year = 2021;
        int comet_year = year - 200;
        while (comet_year <= (year + 100))
            if ( comet_year % 79 == 0){
                System.out.println(comet_year);
                comet_year++;

            }else {
                comet_year++;
            }

    }
}
