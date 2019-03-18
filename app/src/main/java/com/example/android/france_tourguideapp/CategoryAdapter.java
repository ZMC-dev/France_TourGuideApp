package com.example.android.france_tourguideapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EiffelTowerFragment();
        } else if (position == 1){
            return new NotreDameCathedralFragment();
        } else if (position == 2){
            return new PalaceVersaillesFragment();
        } else if (position == 3){
            return new ChampsElyseesFragment();
        } else {
            return new LouvreMuseumFragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_eiffel);
        } else if (position == 1) {
            return mContext.getString(R.string.category_notre_dame);
        } else if (position == 2) {
            return mContext.getString(R.string.category_versailles);
        } else if (position == 3) {
            return mContext.getString(R.string.category_elysees);
        } else {
            return mContext.getString(R.string.category_louvre);
        }
    }

}

