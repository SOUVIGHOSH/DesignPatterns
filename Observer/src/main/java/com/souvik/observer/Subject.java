package com.souvik.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void publish();

}
