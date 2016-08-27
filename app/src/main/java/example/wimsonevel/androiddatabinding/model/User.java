package example.wimsonevel.androiddatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import example.wimsonevel.androiddatabinding.BR;

/**
 * Created by Wim on 8/21/16.
 */
public class User extends BaseObservable {

    private Drawable picture;
    private String imgUrl;
    private String name;
    private String email;

    @Bindable
    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
        notifyPropertyChanged(BR.picture);
    }

    @Bindable
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        notifyPropertyChanged(BR.imgUrl);
    }

    @BindingAdapter({"bind:imageUrlWithPicasso"})
    public static void setImageUrlWithPicasso(ImageView imageView, String imgUrl) {
        Picasso.with(imageView.getContext())
                .load(imgUrl)
                .into(imageView);
    }

    @BindingAdapter({"bind:imageUrlWithGlide"})
    public static void setImageUrlWithGlide(ImageView imageView, String imgUrl) {
        Glide.with(imageView.getContext())
                .load(imgUrl)
                .into(imageView);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}