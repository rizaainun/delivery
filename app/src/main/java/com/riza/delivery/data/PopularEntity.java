package com.riza.delivery.data;

import android.os.Parcel;
import android.os.Parcelable;

public class PopularEntity implements Parcelable {
    private String name;
    private int image;
    private String fee;

    protected PopularEntity(Parcel in) {
        name = in.readString();
        image = in.readInt();
        fee = in.readString();
    }

    public static final Creator<PopularEntity> CREATOR = new Creator<PopularEntity>() {
        @Override
        public PopularEntity createFromParcel(Parcel in) {
            return new PopularEntity(in);
        }

        @Override
        public PopularEntity[] newArray(int size) {
            return new PopularEntity[size];
        }
    };

    public String getName() {return name; }
    public void setName(String name) { this.name = name; }

    public int getImage() { return image; }
    public void setImage(int image) {this.image = image; }

    public  String getFee() {return name; }
    public void setFee(String Fee) {this.fee = fee; }

    @Override
    public int describeContents() {
        return 0;
    }

    public PopularEntity() {
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(image);
        parcel.writeString(fee);
    }
}
