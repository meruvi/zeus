package com.example.navigationdrawer.pedido;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

import java.util.Locale;

public class TabbedActivityPedido extends Fragment {

    private TabLayout tabLayout;

    SectionsPagerAdapter mSectionsPagerAdapter;
    public static final String TAG = TabbedActivityPedido.class.getSimpleName();
    ViewPager mViewPager;
    //Personal personal;

    private OnFragmentInteractionListener mListener;

    public TabbedActivityPedido() {
        // Required empty public constructor
    }

    public static TabbedActivityPedido newInstance() {
        return new TabbedActivityPedido();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_item_one, container, false);

        //personal=(Personal)getArguments().getSerializable("personal");

        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());

        mViewPager = (ViewPager) v.findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        //Initializing the tablayout
        tabLayout = (TabLayout) v.findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(mViewPager);

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Bundle args = new Bundle();
            Fragment fragment = null;


            switch(position){


                case 0:
                    fragment = new ListadoPedidoActivity();
                    //args.putSerializable("personal", personal);
                    break;
                case 1:
                    fragment = new ListadoPedidoAtendidos();
                    //args.putSerializable("personal", personal);
                    break;

            }

            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "Pedidos No Sincronizados";
                case 1:
                    return "Pedidos Sincronizados";
                case 2:
                    return "Pedidos Entregados";
            }
            return null;
        }


    }
}
