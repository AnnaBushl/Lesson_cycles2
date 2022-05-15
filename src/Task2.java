public class Task2 {
    public static void main(String[] args) {
        int fr = 1;  // Можно изменять число первой пятницы от 1 до 7
        while (fr <= 31){
            System.out.println("Сегодня пятница, " + fr + "-е число. Необходимо подготовить отчет.");
            fr = fr + 7;
        }
    }
}
