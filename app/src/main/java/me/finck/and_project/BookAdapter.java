package me.finck.and_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    @NonNull
    @NotNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.book_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull BookAdapter.ViewHolder holder, int position) {
        holder.title.setText(myBooks.get(position).getbTitle());
        holder.author.setText(myBooks.get(position).getbAuthor());

    }

    @Override
    public int getItemCount() {
        return myBooks.size();

    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        TextView author;
        ViewHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.tv_Booktitle);
            author= itemView.findViewById(R.id.tv_BookAuthor);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            mOnListItemClickListener.onListItemClick(getAdapterPosition());
        }
    }
    final private OnListItemClickListener mOnListItemClickListener;

    private ArrayList<Book> myBooks;
    BookAdapter(ArrayList<Book> books, OnListItemClickListener listener){
        myBooks = books;
        mOnListItemClickListener = listener;
    }
    public interface OnListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }


}
