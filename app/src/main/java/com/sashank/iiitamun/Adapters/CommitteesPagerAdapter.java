package com.sashank.iiitamun.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.sashank.iiitamun.Fragments.CommitteesFragment;

/**
 * Created by sashank on 5/8/17.
 */

public class CommitteesPagerAdapter extends FragmentStatePagerAdapter {

    String titles[] = {"United Nation Human Rights Council (UNHRC)", "European Union (EU)"};

    public CommitteesPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new CommitteesFragment();
        Bundle args = new Bundle();
        args.putInt(CommitteesFragment.ARG_OBJECT, position+1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}