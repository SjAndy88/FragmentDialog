package com.jsheng.fragmentdialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by shengjun on 2016/12/23.
 */

public class DialogCreateViewFragment extends DialogFragment implements View.OnClickListener {

    @BindView(R.id.txtMsg)
    TextView mTxtMsg;

    @BindView(R.id.btnNeg)
    Button mBtnNeg;
    @BindView(R.id.btnPos)
    Button mBtnPos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_create_view, container, false);
        ButterKnife.bind(this, view);

        mBtnNeg.setText("Bad");
        mBtnPos.setText("Good");
        mTxtMsg.setText("Hello, World!");

        mBtnNeg.setOnClickListener(this);
        mBtnPos.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNeg:
                Toast.makeText(getActivity(), "Negative Button Click!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPos:
                Toast.makeText(getActivity(), "Positive Button Click!", Toast.LENGTH_SHORT).show();
                break;
        }
        dismiss();
    }
}
