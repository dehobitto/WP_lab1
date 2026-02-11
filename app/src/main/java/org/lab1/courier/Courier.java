package org.lab1.courier;

import org.lab1.parcel.Parcel;
import org.lab1.shared.CRUDObject;

import static org.lab1.courier.Status.*;

public class Courier extends CRUDObject {
  private Status status = FREE;

  public Status getStatus() {return status;}
  public void setStatus(Status status) {this.status = status;}

  private Parcel parcel = null;

  public Parcel getParcel() {return parcel;}
  public void setParcel(Parcel parcel) {this.parcel = parcel;}
}
