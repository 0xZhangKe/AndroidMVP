package com.zhangke.androidmvp.Produce;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zhangke.androidmvp.Filter.presenter.FilterPresenterImpl;
import com.zhangke.androidmvp.Filter.presenter.IFilterPresenter;
import com.zhangke.androidmvp.Filter.view.IFilterView;
import com.zhangke.androidmvp.Filter.entity.ProduceTypeEntity;
import com.zhangke.androidmvp.R;

import java.util.List;

/**
 * Created by ZhangKe at 2017/7/30
 */
public class ProduceShowActivity extends AppCompatActivity implements IFilterView{

    private IFilterPresenter filterPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce_show);

        filterPresenter = new FilterPresenterImpl(this);
        filterPresenter.getProduceTypeList();
    }

    @Override
    public void setProduceTypeList(List<ProduceTypeEntity> list) {
        //TODO 设置界面筛选条件展示的列表，比如可以弹出一个对话框或者其他
    }

    @Override
    public void getFilterDataError(int code, String msg) {
        //TODO 获取数据出错时向用户展示错误信息。
    }
}
