package com.classassignment.myapplication.ui.add;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.classassignment.myapplication.R;

public class AddFragment extends Fragment {

    private AddViewModel addViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addViewModel =
                ViewModelProviders.of(this).get(AddViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add, container, false);
        final EditText editText = root.findViewById(R.id.ed1);
        final EditText editText1 = root.findViewById(R.id.ed2);
        final Button button = root.findViewById(R.id.btn);
        addViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (TextUtils.isEmpty(editText.getText().toString())){
                            Toast.makeText(getActivity(), "Enter first no", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        else if (TextUtils.isEmpty(editText1.getText().toString())){
                            Toast.makeText(getActivity(), "Enter second no", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        int first = Integer.parseInt(editText.getText().toString());
                        int second = Integer.parseInt(editText1.getText().toString());
                        int result = first + second;

                        Toast.makeText(getActivity(), "Sum is " +result, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
        return root;
    }
}