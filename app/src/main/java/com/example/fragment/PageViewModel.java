package com.example.fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAddress = new MutableLiveData<>();
    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    private MutableLiveData<String> mSchool = new MutableLiveData<>();

    public LiveData<String> getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress.setValue(address);
    }

    public LiveData<String> getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber.setValue(number);
    }

    public LiveData<String> getSchool() {
        return mSchool;
    }

    public void setSchool(String school) {
        mSchool.setValue(school);
    }



    public void setName (String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }




}
