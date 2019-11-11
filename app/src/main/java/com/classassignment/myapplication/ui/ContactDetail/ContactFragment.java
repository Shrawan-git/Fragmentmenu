package com.classassignment.myapplication.ui.ContactDetail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classassignment.myapplication.Contacts;
import com.classassignment.myapplication.R;
import com.classassignment.myapplication.adapter.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContactFragment extends Fragment {

    private RecyclerView recyclerView;

  //  private ContactViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);

        // Create a list of contacts to display in RecyclerView
        List<Contacts> contactsList = new ArrayList<>();
        // Adding all the contacts object in list
        contactsList.add(new Contacts("Raju Shrestha" ,"9801234567",R.drawable.bridge));
        contactsList.add(new Contacts("Sugam Kapali" ,"980123777",R.drawable.logo));
        contactsList.add(new Contacts("Manish Ghimire" ,"9801323567",R.drawable.delete));
        contactsList.add(new Contacts("Renu Thapa" ,"9801234567",R.drawable.bridge));
        contactsList.add(new Contacts("Rohit Magar" ,"980123777",R.drawable.logo));
        contactsList.add(new Contacts("Amrit Chhetri" ,"9801323567",R.drawable.delete));
        ContactsAdapter contactsAdapter = new ContactsAdapter(getActivity(), contactsList);
        recyclerView.setAdapter(contactsAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}