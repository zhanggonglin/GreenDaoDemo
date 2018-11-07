package com.heaton.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.heaton.greendaodemo.db.UserDaoOpe;
import com.heaton.greendaodemo.util.LogUtil;
import com.heaton.greendaodemo.vo.User;

import java.util.List;
import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Button btnSaveData;
    private Button btn_find_all;

/*    @BindView(R.id.btn_find_all)
    Button btnFindAll;
    @BindView(R.id.btn_save_data)
    Button btnSaveData;
    @BindView(R.id.lv_data_list)
    ListView lvDataList;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnSaveData = (Button)findViewById(R.id.btn_save_data);
        btn_find_all = (Button)findViewById(R.id.btn_find_all);
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogUtil.d("ewrerwe");
            }
        });

        btn_find_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<User> userList = UserDaoOpe.queryAll(MainActivity.this);
                for (int i = 0;i<userList.size();i++){
                    LogUtil.d("用户数据："+userList.get(i).getAge());
                }
            }
        });
    }

    /*@OnClick({R.id.btn_find_all, R.id.btn_save_data})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_find_all:
                List<User> userList = UserDaoOpe.queryAll(MainActivity.this);
                for (int i = 0;i<userList.size();i++){
                    LogUtil.d("用户数据："+userList.get(i).getAge());
                }
                break;
            case R.id.btn_save_data:
                User user = new User(10, 20);
                UserDaoOpe.saveData(MainActivity.this, user);
                break;
        }
    }*/
}
