package com.example.android.france_tourguideapp;

    /**
     * {@link Place} represents a vocabulary word that the user wants to learn.
     * It contains resource IDs for the default translation, Miwok translation, audio file, and
     * optional image file for that word.
     */
    public class Place {

        /** String resource for the place description*/
        private String mPlaceDescription;

        /** Resource ID for the place image n*/
        private int mPlaceImageId;

        /** String resource ID for the ticket price to get in*/
        private String mPriceInformation;

        /** String resource ID for the place description*/
        private String mOpeningTime;

        /** String resource ID for the place description*/
        private String mPlaceLocation;

        /** String resource ID for the website link */
        private String mWebsiteLink;


        /**
         * Create a new Place object.
         * @param placeDescription is a description of the place to visit
         * @param placeImageId is a image of place
         * @param priceInformation is about prices to get access into place
         * @param openingTime is about opening times to visit the place
         * @param placeLocation all information about how get there
         * @param websiteLink for redirecto to place website

         */


        public Place (String placeDescription, int placeImageId, String priceInformation, String openingTime, String placeLocation, String websiteLink) {

            mPlaceDescription = placeDescription;
            mPlaceImageId = placeImageId;
            mPriceInformation = priceInformation;
            mOpeningTime = openingTime;
            mPlaceLocation = placeLocation;
            mWebsiteLink = websiteLink;


        }

        /**
         * Get the string resource about place description.
         */
        public String getPlaceDescription() {
            return mPlaceDescription ;
        }

        /**
         * Get the resource ID for the image of the place.
         */
        public int getPlaceImageId() {
            return mPlaceImageId;
        }

        /**
         * Return information about the price to access.
         */
        public String getPriceInformation() {
            return mPriceInformation;
        }

        /**
         * Returns information about opening time of the place.
         */

        public String getOpeningTime () {
            return mOpeningTime;
        }

        /**
         * Return information about location of the place to visit.
         */
        public String getPlaceLocation() {
            return mPlaceLocation;
        }

        /**
         * Open website of the place to visit.
         */
        public String getWebsiteLink() {
            return mWebsiteLink;
        }

    }
