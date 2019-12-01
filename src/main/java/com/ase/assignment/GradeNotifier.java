package com.ase.assignment;

/**
 * Created by jayavardhanpatil on 11/28/19
 */
public interface GradeNotifier {

    public void registerNotifier(GradeObserver observer);
    public void notifyObeserver();

}
