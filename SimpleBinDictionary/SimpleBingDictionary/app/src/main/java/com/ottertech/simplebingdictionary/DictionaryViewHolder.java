package com.ottertech.simplebingdictionary;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class DictionaryViewHolder extends RecyclerView.ViewHolder {
    public TextView wordsName;

    public DictionaryViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        wordsName = itemView.findViewById(R.id.dictionary_wordsName);
    }
}
