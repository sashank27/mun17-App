package com.sashank.iiitamun.Fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sashank.iiitamun.Adapters.SecretariatAdapter;
import com.sashank.iiitamun.Utils.Constants;
import com.sashank.iiitamun.R;

public class SecretariatFragment extends Fragment {

    RecyclerView mRecyclerSecretariat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_secretariat,container,false);

        mRecyclerSecretariat = (RecyclerView) v.findViewById(R.id.recycler_secretariat);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        SecretariatAdapter secretariatAdapter =
                new SecretariatAdapter(getActivity(),Constants.secretariatList,getFragmentManager());

        mRecyclerSecretariat.setLayoutManager(layoutManager);
        mRecyclerSecretariat.setAdapter(secretariatAdapter);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(),
                "fonts/SourceSansPro-Regular.ttf");
        TextView title = (TextView) getActivity().findViewById(R.id.tv_activity_name);
        title.setText(R.string.title_secretariat);
        title.setTypeface(tf);

        return v;
    }
}
