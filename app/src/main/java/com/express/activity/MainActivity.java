package com.express.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.express.R;
import com.express.adapter.ExpressAdapter;
import com.express.bean.User;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import de.hdodenhof.circleimageview.CircleImageView;
import qiu.niorgai.StatusBarCompat;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv_main)
    RecyclerView rvMain;
    @Bind(R.id.cv_slide_tou)
    CircleImageView cvSlideTou;
    @Bind(R.id.tv_slide_nickname)
    TextView tvSlideNickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarCompat.translucentStatusBar(this);//去掉状态栏
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setItemAnimator(new DefaultItemAnimator());
        List<String> list = new ArrayList<>();
        list.add("筛选");
        rvMain.setAdapter(new ExpressAdapter(list));
        initData();

    }

    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }

    private void initData() {
        User user = BmobUser.getCurrentUser(User.class);
        if (TextUtils.isEmpty(user.getNickname())) {
            tvSlideNickname.setText("编辑昵称");
        } else {
            tvSlideNickname.setText(user.getNickname());
        }
        Glide.with(this)
                .load(user.getHeadPicThumb())
                .into(cvSlideTou);

    }

    @OnClick({R.id.cv_slide_tou, R.id.tv_slide_nickname})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.cv_slide_tou:
                startActivity(new    Intent(this, PersonalActivity.class));
                break;
            case R.id.tv_slide_nickname:
                startActivity(new Intent(this,NicknameActivity.class));
                break;
        }
    }
}
