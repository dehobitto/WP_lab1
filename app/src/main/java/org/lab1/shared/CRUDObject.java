package org.lab1.shared;

public abstract class CRUDObject {
    static long id = 0;

    public CRUDObject()
    {
        id = getNextId();
    }

    public long getId() {
        return id;
    }

    protected long getNextId()
    {
        return ++id;
    }
}
