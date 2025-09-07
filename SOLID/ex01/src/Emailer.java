public class Emailer implements INotifier{
    @Override
    public void send(String to, double amount) {
        System.out.println(to + " bill is " + amount);
    }
}
    