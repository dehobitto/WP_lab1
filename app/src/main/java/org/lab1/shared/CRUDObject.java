package org.lab1.shared;

public abstract class CRUDObject {
    private static Long idСounter = 0L;
    private Long id;
    private static synchronized long getNextId() {return ++idСounter;}

    public CRUDObject()
    {
        id = getNextId();
    }

    public Long getId() {
        return id;
    }
}
