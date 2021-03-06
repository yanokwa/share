package org.odk.share.adapters.basecursoradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;


public class BaseCursorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private OnItemClickListener listener;

    public BaseCursorViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}