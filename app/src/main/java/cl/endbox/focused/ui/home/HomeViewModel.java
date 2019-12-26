package cl.endbox.focused.ui.home;

import android.os.Bundle;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cl.endbox.focused.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido a Focused: tu sala de estudio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
