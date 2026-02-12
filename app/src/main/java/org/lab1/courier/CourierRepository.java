package org.lab1.courier;

import org.lab1.parcel.Parcel;
import org.lab1.shared.CRUDRepository;

public class CourierRepository extends CRUDRepository<Courier> {
    public void update(Long id, Status status)
    {
        var courier = this.getById(id);
        courier.setStatus(status);
        // TODO: LOG
    }

    public void update(Long id, Parcel parcel)
    {
        var courier = this.getById(id);
        courier.assignParcel(parcel);
        // TODO: LOG
    }
}
