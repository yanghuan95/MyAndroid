package com.ydroid.myown.yh.ydroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yh on 2017/4/7.
 */

public class YdroidListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public static Fragment newInstance() {
        return new YdroidListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.ydroid_main_list_fragment, container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.ydroid_list_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

    private class YdroidListHolder extends RecyclerView.ViewHolder {

        public YdroidListHolder(View itemView) {
            super(itemView);
        }

        public void onBindView() {

        }
    }

    private class YdroidListAdapter extends RecyclerView.Adapter<YdroidListHolder> {
        private List<YdroidCardModel> mCards;

        public YdroidListAdapter(List<YdroidCardModel> cards) {
            mCards = cards;
        }

        @Override

        public YdroidListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            //TODO add the card model layout
            View v = layoutInflater.inflate(R.layout.support_simple_spinner_dropdown_item, parent, false);
            return new YdroidListHolder(v);
        }

        @Override
        public void onBindViewHolder(YdroidListHolder holder, int position) {
            holder.onBindView();
        }

        @Override
        public int getItemCount() {
            return mCards.size();
        }
    }

}
