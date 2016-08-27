package example.wimsonevel.androiddatabinding;

import android.view.View;

/**
 * Created by Wim on 8/27/16.
 */
public class EventHandler {

    public void clicked(View view) {
        ListActivity.start(view.getContext());
    }

}
