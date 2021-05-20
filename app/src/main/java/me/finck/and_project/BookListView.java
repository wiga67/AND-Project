package me.finck.and_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BookListView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookListView extends Fragment implements BookAdapter.OnListItemClickListener{
RecyclerView myBookList;
BookAdapter myBookAdapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BookListView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bookListView.
     */
    // TODO: Rename and change types and number of parameters
    public static BookListView newInstance(String param1, String param2) {
        BookListView fragment = new BookListView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book_list_view, container, false);
        myBookList = view.findViewById(R.id.rv);
        myBookList.hasFixedSize();
        myBookList.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));
        books.add(new Book("Lost Stars","Claudia Gray"));
        books.add(new Book("Dark Nest","Troy Denning"));

        myBookAdapter = new BookAdapter(books,this);
        myBookList.setAdapter(myBookAdapter);
        return view;
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        int bookNumber = clickedItemIndex+1;
        Toast.makeText(getContext(),"Book number:" + bookNumber,Toast.LENGTH_SHORT).show();

    }
}