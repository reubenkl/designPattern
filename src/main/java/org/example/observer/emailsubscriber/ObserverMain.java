package org.example.observer.emailsubscriber;

public class ObserverMain {
  public static void main(String[] args) {
    NewsPublisher publisher = new NewsPublisher();

    Observer emailSubscriber = Observer.createSubscriber("Reuben");
    Observer smsSubscriber = Observer.createSubscriber("Frank");

    publisher.add(emailSubscriber);
    publisher.add(smsSubscriber);

    publisher.publish("Breaking News 1!");
    publisher.publish("Massive Breaking News!");
  }
}
