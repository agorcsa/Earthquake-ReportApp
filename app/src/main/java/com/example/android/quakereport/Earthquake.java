package com.example.android.quakereport;

/**
 * Created by ILEANA on 8/5/2017.
 */

public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;

    // The location of the earthquake
    private String mLocation;

    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the data of the Earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get url from earthquake
     */
    public String getUrl() {
        return mUrl;
    }
}
