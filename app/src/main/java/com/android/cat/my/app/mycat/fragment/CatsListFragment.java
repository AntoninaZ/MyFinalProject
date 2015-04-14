package com.android.cat.my.app.mycat.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.cat.my.app.mycat.MainActivity;
import com.android.cat.my.app.mycat.R;
import com.android.cat.my.app.mycat.adapters.CatsListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by antonina on 27.03.15.
 */
public class CatsListFragment extends Fragment {
    private ListView mCatsList;
    private CatsListAdapter mCatsListAdapter;
    private ArrayList mArrayCats;

    public static CatsListFragment newInstance() {
        return new CatsListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cats_list, container, false);
        loadList();
        init(view);
        return view;
    }

    private void init(View v) {
        ((MainActivity) getActivity()).setTitleActionBar("My cats");
        mCatsList = (ListView) v.findViewById(R.id.lvCatsList_FCL);
        mCatsListAdapter = new CatsListAdapter(mArrayCats, getActivity());
        mCatsList.setAdapter(mCatsListAdapter);
    }

    private void loadList() {
        HashMap<String,String> map = new HashMap<String,String>();
        mArrayCats = new ArrayList();
        map.put("Nyasha", "1 year 11 mounts");
        mArrayCats.add(map);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       // setListeners();
    }
}
