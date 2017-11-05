package com.sonja.sowy;

/**
 * Created by sonia on 11/3/17.
 */

public class Description {

    private int mTitleId;
    private int mDescriptionId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Description(int titleId, int descriptionId, int imageResourceId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;

    }


    public int getTitleId() {
        return mTitleId;
    }

    public int getDescriptionId() {
        return mDescriptionId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}


