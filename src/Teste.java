public class Teste {
    public static void main(String[] args) {
        Account c = new CurrentAccount(123,321);

        c.deposit(200);
        try{

        c.withdraw(300);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(c.getBalance());
    }
}
