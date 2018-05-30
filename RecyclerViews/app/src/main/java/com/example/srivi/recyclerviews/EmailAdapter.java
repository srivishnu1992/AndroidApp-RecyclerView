package com.example.srivi.recyclerviews;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by srivi on 11-03-2018.
 */

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {

    ArrayList<Email> mData;
    static ViewGroup parent;
    MainActivity mainActivity;

    public EmailAdapter(MainActivity mainActivity, ArrayList<Email> mData) {
        this.mData = mData;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext() ).inflate( R.layout.email_item, parent, false );

        ViewHolder viewHolder = new ViewHolder( view );
        this.parent = parent;
        viewHolder.button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( parent.getContext(), Card.class );
                mainActivity.startActivity( intent );
            }
        } );


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Email email = mData.get( position );
        holder.tvSummary.setText( email.summary );
        holder.tvSubject.setText( email.subject );
        holder.tvSender.setText( email.sender );

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSummary, tvSubject, tvSender;
        Button button;

        public ViewHolder(View itemView) {
            super( itemView );
            tvSummary = itemView.findViewById( R.id.tvSummary );
            tvSender = itemView.findViewById( R.id.tvSender );
            tvSubject = itemView.findViewById( R.id.tvSubject );
            button = itemView.findViewById( R.id.button );

        }
    }

}
