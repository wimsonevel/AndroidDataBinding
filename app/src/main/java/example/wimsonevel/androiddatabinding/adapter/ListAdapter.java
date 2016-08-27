package example.wimsonevel.androiddatabinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import example.wimsonevel.androiddatabinding.R;
import example.wimsonevel.androiddatabinding.databinding.ItemListBinding;
import example.wimsonevel.androiddatabinding.model.Item;

/**
 * Created by Wim on 8/27/16.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{

    private List<Item> itemList;

    public ListAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.bind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {

        ItemListBinding binding;

        public ListViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        void bind(Item item) {
            binding.setList(item);
            binding.executePendingBindings();
        }
    }
}
