package org.lab1.shared;

import java.util.*;

public abstract class CRUDRepository<T extends CRUDObject>
{
    final private Map<Long, T> repository = new HashMap<>();

    protected T getById(Long id) {
        return repository.get(id);
    }

    public void add(T obj) {
        repository.put(obj.getId(), obj);
    }

    public void remove(T type) {
        try
        {
            repository.remove(type.getId());
        }catch (NullPointerException e){
            // TODO: LOG
        }
        // TODO: check for this not being in repos
    }

    public List<T> getAll() {
        return List.copyOf(repository.values());
    }

}
