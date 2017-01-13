package mytest2;

import java.util.ArrayList;
import java.util.List;


public class Subject {
  
  private List<Listener> listeners = new ArrayList<Listener>();
  
  public List<Listener> getListeners() {
    return listeners;
  }

  public void setListeners(List<Listener> listeners) {
    this.listeners = listeners;
  }
  
  public void addListener(Listener listener) {
    this.listeners.add(listener);
  }

  public void operate(Event event) {
    event.start();
    for (Listener listener : listeners) {
      listener.onEventStart(event);
    }
  }
  
  public static void main(String[] args) {
    Event event = new MyEvent();
    Subject subject = new Subject();
    Listener listener = new MyListener();
    subject.addListener(listener);
    subject.operate(event);
  }
}
