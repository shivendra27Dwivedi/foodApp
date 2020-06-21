package com.example.assignment.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModel {


    /**
     * status : true
     * statusMessage : loaded successfully
     * Explore Events Now : [{"name":"Buffet Restaurants","iconURL":"https://i.picsum.photos/id/2/500/300.jpg"},{"name":"Chinese Restaurants","iconURL":"https://i.picsum.photos/id/12/500/300.jpg"},{"name":"Italian Restaurants","iconURL":"https://i.picsum.photos/id/13/500/300.jpg"},{"name":"South Indian Restaurants","iconURL":"https://i.picsum.photos/id/15/500/300.jpg"},{"name":"North Indian Restaurants","iconURL":"https://i.picsum.photos/id/16/500/300.jpg"}]
     * Ongoing Events : [{"name":"Food Festival Event","type":"Celebration","location":"UB City","dateTime":"Sun 11am","iconURL":"https://i.picsum.photos/id/17/500/300.jpg"}]
     * Upcoming Events : [{"name":"Dance World Cup","type":"Championship","location":"Marathahalli","dateTime":"Sat 12am","iconURL":"https://i.picsum.photos/id/20/500/300.jpg"},{"name":"Lolz and Laughter","type":"Comedy Show","location":"Electronic City","dateTime":"Fri 7pm","iconURL":"https://i.picsum.photos/id/21/500/300.jpg"},{"name":"Music Festival Event","type":"Celebration","location":"Whitefield","dateTime":"Thurs 11am","iconURL":"https://i.picsum.photos/id/28/500/300.jpg"},{"name":"Music and Dance Concert","type":"Live Concert","location":"Whitefield","dateTime":"Sat 8pm","iconURL":"https://i.picsum.photos/id/29/500/300.jpg"},{"name":"Fun Games","type":"Game Events","location":"Bellandur","dateTime":"Fri 10am","iconURL":"https://i.picsum.photos/id/42/500/300.jpg"}]
     */

    private boolean status;
    private String statusMessage;

    @SerializedName(value = "Upcoming Events", alternate = {"UpcomingEvents"})
    private List<UpcomingEventsBean> upcomingEventsBean;

    @SerializedName(value = "Explore Events Now", alternate = {"ExploreEventsNow"})
    private List<ExploreEventsNowBean> exploreEventsNowBeans;

    @SerializedName(value = "Ongoing Events", alternate = {"OngoingEvents"})
    private List<OngoingEventsBean> ongoingEventsBeans;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public List<UpcomingEventsBean> getUpcomingEventsBean() {
        return upcomingEventsBean;
    }

    public void setUpcomingEventsBean(List<UpcomingEventsBean> upcomingEventsBean) {
        this.upcomingEventsBean = upcomingEventsBean;
    }

    public List<ExploreEventsNowBean> getExploreEventsNowBeans() {
        return exploreEventsNowBeans;
    }

    public void setExploreEventsNowBeans(List<ExploreEventsNowBean> exploreEventsNowBeans) {
        this.exploreEventsNowBeans = exploreEventsNowBeans;
    }

    public List<OngoingEventsBean> getOngoingEventsBeans() {
        return ongoingEventsBeans;
    }

    public void setOngoingEventsBeans(List<OngoingEventsBean> ongoingEventsBeans) {
        this.ongoingEventsBeans = ongoingEventsBeans;
    }

    public static class ExploreEventsNowBean {
        /**
         * name : Buffet Restaurants
         * iconURL : https://i.picsum.photos/id/2/500/300.jpg
         */

        private String name;
        private String iconURL;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIconURL() {
            return iconURL;
        }

        public void setIconURL(String iconURL) {
            this.iconURL = iconURL;
        }
    }

    public static class OngoingEventsBean {
        /**
         * name : Food Festival Event
         * type : Celebration
         * location : UB City
         * dateTime : Sun 11am
         * iconURL : https://i.picsum.photos/id/17/500/300.jpg
         */

        private String name;
        private String type;
        private String location;
        private String dateTime;
        private String iconURL;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getIconURL() {
            return iconURL;
        }

        public void setIconURL(String iconURL) {
            this.iconURL = iconURL;
        }
    }

    public static class UpcomingEventsBean {
        /**
         * name : Dance World Cup
         * type : Championship
         * location : Marathahalli
         * dateTime : Sat 12am
         * iconURL : https://i.picsum.photos/id/20/500/300.jpg
         */

        private String name;
        private String type;
        private String location;
        private String dateTime;
        private String iconURL;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getIconURL() {
            return iconURL;
        }

        public void setIconURL(String iconURL) {
            this.iconURL = iconURL;
        }
    }
}
