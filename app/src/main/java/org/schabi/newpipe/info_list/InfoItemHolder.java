package org.schabi.newpipe.info_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.schabi.newpipe.R;

/**
 * Created by the-scrabi on 01.08.16.
 */
public class InfoItemHolder extends RecyclerView.ViewHolder {

    public ImageView itemThumbnailView;
    public TextView itemVideoTitleView,
            itemUploaderView,
            itemDurationView,
            itemUploadDateView,
            itemViewCountView;
    public Button itemButton;

    public InfoItemHolder(View v) {
        super(v);
        itemThumbnailView = (ImageView) v.findViewById(R.id.itemThumbnailView);
        itemVideoTitleView = (TextView) v.findViewById(R.id.itemVideoTitleView);
        itemUploaderView = (TextView) v.findViewById(R.id.itemUploaderView);
        itemDurationView = (TextView) v.findViewById(R.id.itemDurationView);
        itemUploadDateView = (TextView) v.findViewById(R.id.itemUploadDateView);
        itemViewCountView = (TextView) v.findViewById(R.id.itemViewCountView);
        itemButton = (Button) v.findViewById(R.id.item_button);
    }
}
