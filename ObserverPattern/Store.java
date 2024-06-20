package ObserverPattern;

import ObserverPattern.Observable.IphoneObsevable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStock = new IphoneObsevable();
        NotificationAlertObserver observer1 = new EmailAlertObserver("rahul.parida@zessta.com", iphoneStock);
        NotificationAlertObserver observer2 = new EmailAlertObserver("sonasree.parida@zessta.com", iphoneStock);
        NotificationAlertObserver observer3 = new EmailAlertObserver("roshan.parida@zessta.com", iphoneStock);

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);
        iphoneStock.add(observer3);

        iphoneStock.setStockCount(10);
        System.out.println(iphoneStock.getStockCount());

    }

}
