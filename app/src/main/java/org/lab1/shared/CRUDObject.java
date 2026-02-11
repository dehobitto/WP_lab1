package org.lab1.shared;

public abstract class CRUDObject {
    static Long id = 0L;

    public CRUDObject()
    {
        id = getNextId();
    }

    public Long getId() {
        return id;
    }

    protected long getNextId()
    {
        return ++id;
    }
}
