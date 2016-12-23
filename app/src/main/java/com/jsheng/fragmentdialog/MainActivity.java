package com.jsheng.fragmentdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnCreateView)
    Button mBtnView;
    @BindView(R.id.btnCreateDialog)
    Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBtnView.setOnClickListener(this);
        mBtnDialog.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreateView :
                showDialogFragmentByCreateView();
                break;
            case R.id.btnCreateDialog :
                showDialogFragmentByCreateDialog();
                break;
        }
    }

    private void showDialogFragmentByCreateView() {
        DialogCreateViewFragment fragment = new DialogCreateViewFragment();
        fragment.show(getSupportFragmentManager(), "dialogfragment_createview");
    }

    private void showDialogFragmentByCreateDialog() {
        DialogCreateDialogFragment fragment = new DialogCreateDialogFragment();
//        fragment.setCancelable(false);
        fragment.show(getSupportFragmentManager(), "dialogfragment_createdialog");
//        fragment.dismiss();
    }
}
