package ObserverPattern.Observer;
import ObserverPattern.Observable.StockObservable;;

public class EmailAlertObserver implements NotificationAlertObserver
{
    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId,StockObservable observable)
    {
        this.observable = observable;
        this.emailId =  emailId;
    }
    @Override
    public void update()
    {
        sendMail(emailId,"Product is in stock hurry up");
    }
    private void sendMail(String emailId2, String string) {
        System.out.println("Mail sent to "+emailId2);
    }
}
