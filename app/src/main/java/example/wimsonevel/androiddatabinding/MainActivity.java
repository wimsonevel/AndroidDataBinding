package example.wimsonevel.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.wimsonevel.androiddatabinding.databinding.ActivityMainBinding;
import example.wimsonevel.androiddatabinding.model.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setUser(user());
        binding.setHandler(new EventHandler());
    }

    private User user() {
        User user = new User();
        user.setName("Wim Sonevel");
        user.setEmail("wim.sonevel93@gmail.com");
        user.setImgUrl("http://img3.kwikku.com/status_photo/wimsonevel20160826134245.jpg");
        user.setPicture(ContextCompat.getDrawable(this, R.drawable.photo));

        return user;
    }
}
