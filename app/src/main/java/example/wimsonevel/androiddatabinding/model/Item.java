package example.wimsonevel.androiddatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import example.wimsonevel.androiddatabinding.BR;

/**
 * Created by Wim on 8/27/16.
 */
public class Item extends BaseObservable {

    private String item;

    @Bindable
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
        notifyPropertyChanged(BR.item);
    }
}
