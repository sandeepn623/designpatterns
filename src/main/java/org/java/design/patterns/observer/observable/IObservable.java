package org.java.design.patterns.observer.observable;

import org.java.design.patterns.observer.observer.IObserver;

// This incorporated the design principle program to an interface.
public interface IObservable {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}
