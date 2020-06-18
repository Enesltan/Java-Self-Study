public class Main {

    public static void main(String[] args) {
        //double []  myList = new double[3];
        double[] myList = {1.2, 1.8, 1.4, 1.5}; //--> diğer dizi tanımlama yöntemi
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük: " + max);
    }
}
