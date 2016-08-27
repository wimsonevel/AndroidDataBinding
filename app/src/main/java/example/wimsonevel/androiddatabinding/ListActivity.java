package example.wimsonevel.androiddatabinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import example.wimsonevel.androiddatabinding.adapter.ListAdapter;
import example.wimsonevel.androiddatabinding.databinding.ActivityListBinding;
import example.wimsonevel.androiddatabinding.model.Item;

/**
 * Created by Wim on 8/27/16.
 */
public class ListActivity extends AppCompatActivity {

    ActivityListBinding binding;

    public static void start(Context context) {
        Intent intent = new Intent(context, ListActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_list);

        setupData(binding.rvItem);
    }

    private void setupData(RecyclerView recyclerView) {
        ListAdapter listAdapter = new ListAdapter(loadData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

    private List<Item> loadData() {
        List<Item> itemList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Item item = new Item();
            item.setItem("Item "+(i+1));

            itemList.add(item);
        }

        return itemList;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
