package me.enkaja.firenotes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {
    private List<Note> notes;

    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        public TextView content;
        public TextView title;

        public NoteViewHolder(View v) {
            super(v);
            content = (TextView) v.findViewById(R.id.content);
            title = (TextView) v.findViewById(R.id.title);
        }
    }

    public NoteAdapter(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.note_card, viewGroup, false);
        return new NoteViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder viewHolder, int i) {
        viewHolder.content.setText(notes.get(i).getContent());

        if (notes.get(i).getTitle() != null) {
            viewHolder.title.setText(notes.get(i).getTitle());
        }
    }
}
