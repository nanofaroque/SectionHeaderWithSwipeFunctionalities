package com.nanofaroque.swipewithsectionheaderlist;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.daimajia.swipe.SwipeLayout;
/**
 * Created by omarfaroque on 4/17/16.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
//for test help
//http://stackoverflow.com/questions/11541114/unittesting-of-arrayadapter


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Since we have header and cell item. so we need to catagories these two viewType
        //We generate two different view here for cell and header
        if (viewType == TYPE_ITEM) {
            //inflate your layout and pass it to view holder
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            SwipeLayout item = (SwipeLayout) view.findViewById(R.id.swipe_item);
            item.setShowMode(SwipeLayout.ShowMode.PullOut);
            item.addDrag(SwipeLayout.DragEdge.Left, item.findViewById(R.id.bottom_wrapper));
            item.addDrag(SwipeLayout.DragEdge.Right, item.findViewById(R.id.bottom_wrapper_2));
            ViewHolderListItem holder = new ViewHolderListItem(view);
            return holder;
        } else if (viewType == TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_header, parent, false);
            return new ViewHolderHeader(view);
        }
        throw new RuntimeException("there is no type that matches the type " + viewType + " + make sure your using types correctly");

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderListItem) {
            ((ViewHolderListItem) holder).setTvName("Md Omar Farouqe");
            ((ViewHolderListItem) holder).setTvCell("001-872-123-4567");
            ((ViewHolderListItem) holder).setImgAvatar(R.mipmap.ic_launcher);
        } else if (holder instanceof ViewHolderHeader) {
           ((ViewHolderHeader) holder).setTvHeader("Header");
        }
    }

    @Override
    public int getItemCount() {
        return 12;
    }

    @Override
    public int getItemViewType(int position) {
        if (isPositionHeader(position))
            return TYPE_HEADER;
        return TYPE_ITEM;

    }

    private boolean isPositionHeader(int position) {
        switch (position) {
            case 0:
                return position == 0;
            case 2:
                return position == 2;
            case 5:
                return position == 5;
        }
        return position == 9;
    }


}


