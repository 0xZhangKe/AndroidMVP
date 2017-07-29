package com.zhangke.androidmvp.Filter.presenter;

import com.zhangke.androidmvp.Filter.entity.ProduceTypeEntity;
import com.zhangke.androidmvp.Filter.model.FilterModelImpl;
import com.zhangke.androidmvp.Filter.model.IFilterModel;
import com.zhangke.androidmvp.Filter.view.IFilterView;
import com.zhangke.androidmvp.common.OnDataCallbackListener;

import java.util.List;

/**
 * Created by ZhangKe at 2017/7/30
 */
public class FilterPresenterImpl implements IFilterPresenter {

    private IFilterView filterView;
    private IFilterModel filterModel;

    public FilterPresenterImpl(IFilterView filterView) {
        this.filterView = filterView;

        filterModel = new FilterModelImpl();
    }
    
    @Override
    public void getProduceTypeList() {
        filterModel.getProduceTypeList(new OnDataCallbackListener() {
            @Override
            public void onComplete(Object... o) {
                filterView.setProduceTypeList((List<ProduceTypeEntity>) o[0]);
            }

            @Override
            public void onError(int code, String message) {
                filterView.getFilterDataError(code, message);
            }
        });
    }
}
