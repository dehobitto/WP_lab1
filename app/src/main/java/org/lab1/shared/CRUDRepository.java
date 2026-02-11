package org.lab1.shared;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class CRUDRepository <CRUDObject>
{
    final private ArrayList<CRUDObject> repository = new ArrayList<CRUDObject>();

    protected CRUDObject getById(int id) {
        return repository.get(id);
    }

    public void add(CRUDObject type) {
        repository.add(type);
    }

    public void remove(CRUDObject type) {
        repository.remove(type);

        // TODO: check for this not being in repos
    }

    public List<CRUDObject> getAll() {
        return Collections.unmodifiableList(repository);
    }

    public abstract CRUDObject update(int id);
}
