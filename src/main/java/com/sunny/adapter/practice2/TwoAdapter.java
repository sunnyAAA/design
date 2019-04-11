package com.sunny.adapter.practice2;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 14:30 2019/4/11
 */
public class TwoAdapter implements TwoWayTarget,TwoWayAdaptee {

    private TwoAdapteeRealize twoAdapteeRealize;

    private TwoTargetRealize twoTargetRealize;

    public TwoAdapter(TwoTargetRealize twoTargetRealize) {
        this.twoTargetRealize = twoTargetRealize;
    }

    public TwoAdapter(TwoAdapteeRealize twoAdapteeRealize) {
        this.twoAdapteeRealize = twoAdapteeRealize;
    }


    @Override
    public void specialShow() {
        twoTargetRealize.show();
    }

    @Override
    public void show() {
        twoAdapteeRealize.specialShow();
    }
}
