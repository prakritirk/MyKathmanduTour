package com.example.android.mykathmandutour;

/**
 * Created by prajbhanda on 6/24/2018.
 */

/**
 * {@link Places} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Places {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Name for the place
     */
    private String mPlaceName;
    /**
     * Address of the place
     */
    private String mAdress;
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mWeb;


    /**
     * Create a new Places object.
     *
     * @param placeName       is the name of the place
     * @param address         is the address of the place
     * @param imageResourceId is the resource ID for the image file associated with this place
     */
    public Places(String placeName, String address, int imageResourceId) {
        mPlaceName = placeName;
        mAdress = address;
        mImageResourceId = imageResourceId;
    }

    public Places(String placeName, String address, String web) {
        mPlaceName = placeName;
        mAdress = address;
        mWeb = web;
    }


    /**
     * Create a new Places object.
     *
     * @param placeName is the name of the place
     * @param address   is the address of the place
     */
    public Places(String placeName, String address) {
        mPlaceName = placeName;
        mAdress = address;

    }

    /**
     * Get the site's name.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the web-site's name.
     */
    public String getWebName() {
        return mWeb;
    }

    /**
     * Get the site's address
     */
    public String getAddress() {
        return mAdress;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
