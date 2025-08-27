package org.example.observer.emailsubscriber;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class NewsPublisherTest {

  @Test
  public void whenNewsPublished_allSubscribersAreNotified() {
    Observer observer1 = mock(Observer.class);
    Observer observer2 = mock(Observer.class);

    NewsPublisher publisher = new NewsPublisher();
    publisher.add(observer1);
    publisher.add(observer2);

    publisher.publish("Breaking News!");

    verify(observer1).update("Breaking News!");
    verify(observer2).update("Breaking News!");
  }

  @Test
  public void whenObserverRemoved_itDoesNotReceiveUpdates() {
    Observer observer1 = mock(Observer.class);
    Observer observer2 = mock(Observer.class);

    NewsPublisher publisher = new NewsPublisher();
    publisher.add(observer1);
    publisher.add(observer2);
    publisher.remove(observer2);

    publisher.publish("Breaking News!");

    verify(observer1).update("Breaking News!");
    verify(observer2, never()).update(anyString());
  }

  @Test
  public void observersReceiveAllTheMessages() {
    Observer observer = mock(Observer.class);

    NewsPublisher publisher = new NewsPublisher();
    publisher.add(observer);

    publisher.publish("News 1!");
    publisher.publish("News 2!");

    verify(observer).update("News 1!");
    verify(observer).update("News 2!");
  }

}
