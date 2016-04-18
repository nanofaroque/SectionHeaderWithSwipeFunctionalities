package com.nanofaroque.swipewithsectionheaderlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by omarfaroque on 4/17/16.
 */
public class ViewHolderListItem extends RecyclerView.ViewHolder {
    @Bind(R.id.name)
    TextView tvName;
    @Bind(R.id.cell)
    TextView tvCell;
    @Bind(R.id.avatar)
    ImageView imgAvatar;

    public void setTvName(String name) {
        tvName.setText(name);
    }

    public void setTvCell(String cell) {
        tvCell.setText(cell);
    }

    public void setImgAvatar(int id) {
        imgAvatar.setImageResource(id);
    }
    public ViewHolderListItem(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
