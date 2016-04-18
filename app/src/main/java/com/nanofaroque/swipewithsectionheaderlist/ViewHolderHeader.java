package com.nanofaroque.swipewithsectionheaderlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by omarfaroque on 4/18/16.
 */
public class ViewHolderHeader extends RecyclerView.ViewHolder {

    @Bind(R.id.header)
    TextView tvHeader;

    public void setTvHeader(String header) {
        tvHeader.setText(header);
    }

    public ViewHolderHeader(View view) {
        super(view);
        ButterKnife.bind(this,view);
    }
}
