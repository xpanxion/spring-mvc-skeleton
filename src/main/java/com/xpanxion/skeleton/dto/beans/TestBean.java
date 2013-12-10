package com.xpanxion.skeleton.dto.beans;

/**
 * Test Bean Pojo
 * 
 * @author bsmith
 *
 */
public class TestBean {

    private long id;

    private String text;

    /**
     * Returns the id of this bean
     * 
     * @return the id the id of this bean
     */
    public long getId() {
        return this.id;
    }

    /**
     * Returns the text of this bean
     * 
     * @return the text the text of this bean
     */
    public String getText() {
        return this.text;
    }

    /**
     * Sets the id of this bean
     * 
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the text of this bean 
     * 
     * @param text
     *            the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

}
