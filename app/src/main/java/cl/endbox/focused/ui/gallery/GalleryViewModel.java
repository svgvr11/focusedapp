package cl.endbox.focused.ui.gallery;

import android.os.Bundle;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import cl.endbox.focused.R;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mi perfil");
    }

    public LiveData<String> getText() {
        return mText;
    }

}