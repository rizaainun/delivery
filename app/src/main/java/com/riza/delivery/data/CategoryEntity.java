package com.riza.delivery.data;

import android.os.Parcel;
import android.os.Parcelable;

public class CategoryEntity implements Parcelable {
    private String name;
    private int image;

    protected CategoryEntity(Parcel in) {
        name = in.readString();
        image = in.readInt();
    }

    public static final Creator<CategoryEntity> CREATOR = new Creator<CategoryEntity>() {
        @Override
        public CategoryEntity createFromParcel(Parcel in) {
            return new CategoryEntity( in );
        }

        @Override
        public CategoryEntity[] newArray(int size) {
            return new CategoryEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel,int i) {
        parcel.writeString( name );
        parcel.writeInt( image );
    }

    public String getName() { return name; }
    public void setName(String name) {this.name = name;}

    public int getImage() {return image;}
    public void setImage(int image) {this.image = image;}


    public CategoryEntity() {

    }
}
