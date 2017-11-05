
package com.sonja.sowy;


public class Word {

    private int mNameId;
    private int mLatinTranslationId;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(int nameId, int latinTranslationId, int audioResourceId) {
        mNameId = nameId;
        mLatinTranslationId = latinTranslationId;
        mAudioResourceId = audioResourceId;
    }


    public Word(int nameId, int latinTranslationId, int imageResourceId,
                int audioResourceId) {
        mNameId = nameId;
        mLatinTranslationId = latinTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public int getDefaultTranslationId() {
        return mNameId;
    }

    public int getMiwokTranslationId() {
        return mLatinTranslationId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}