package quiz.doubts;

public class Main {
    public static void main(String[] args) {

        Bill bill1 = new Bill();
        bill1.setId(4);
        Bill bill2 = new Bill();
        bill2.setId(5);
        System.out.println(bill1.getId() + "<-- bill1 & bill2 -->" + bill2.getId());
        Customer customer = new Customer();
        customer.setId(6);
        System.out.println(bill1.getId() + "<-- bill1 & bill2 -->" + bill2.getId());
        /*bill1.id = 10;
        System.out.println(bill1.getId() + "<-- bill1 & bill2 -->" + bill2.getId());*/
    }
}
