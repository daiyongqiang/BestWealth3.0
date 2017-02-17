package com.ihope.bestwealth;

import com.ihope.bestwealth.ui.BasePresenter;
import com.ihope.bestwealth.ui.BaseView;

/**
 * Created by DYQ on 2017/1/23.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
