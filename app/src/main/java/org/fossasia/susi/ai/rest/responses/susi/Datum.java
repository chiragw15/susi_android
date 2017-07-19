package org.fossasia.susi.ai.rest.responses.susi;

import io.realm.RealmObject;

/**
 * <h1>Parse data object in retrofit response from susi client.</h1>
 */
public class Datum extends RealmObject {

    private String title;
    private String description;
    private String link;
    private float percent;
    private String president;

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets percent.
     *
     * @return the percent
     */
    public float getPercent() {
        return percent;
    }

    /**
     * Gets president.
     *
     * @return the president
     */
    public String getPresident() {
        return president;
    }

}
