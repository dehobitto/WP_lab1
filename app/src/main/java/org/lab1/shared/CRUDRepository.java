package org.lab1.shared;

import lombok.extern.java.Log;

import java.util.*;

@Log
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
        if (repository.containsKey(type.getId()))
        {
            repository.remove(type.getId());
        }else
        {
            log.warning("Tried to remove a non-existent entity with id " + type.getId());
        }
    }

    public List<T> getAll() {
        return List.copyOf(repository.values());
    }
}
