package org.lab1.courier;

import org.lab1.parcel.Parcel;
import org.lab1.shared.CRUDObject;

import static org.lab1.courier.Status.*;
import static org.lab1.parcel.Status.DELIVERED;

public class Courier extends CRUDObject {
  private String name;

  public String getName() {return name;}
  public void setName(String name) {this.name = name;}

  private Status status = FREE;

  public Status getStatus() {return status;}
  public void setStatus(Status status) {
    if (this.status == status) return;

    switch (status) {
      case BUSY -> {
        if (parcel == null){
          return;
          //TODO: log its bad todo
        }
      }
      case FREE -> {
        this.parcel.setStatus(DELIVERED);
        this.parcel = null;
      }
    }

    this.status = status;
  }

  private Parcel parcel = null;

  public Parcel getParcel() {return parcel;}
  public void assignParcel(Parcel parcel) {
    this.parcel = parcel;
  }
}
