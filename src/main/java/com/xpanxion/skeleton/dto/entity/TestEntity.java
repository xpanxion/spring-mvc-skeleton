package com.xpanxion.skeleton.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * TestEntity pojo
 * 
 * Represents items from the test table.  Exposes one named query that returns all entities from the table
 * 
 * @author bsmith
 *
 */
@Entity
@Table(name = "test")
@NamedQuery(name = "test.getAll", query = "from TestEntity")
public class TestEntity { 
    private long id;
    private String value;

    /**
     * Returns the Id of the entity.  This is the primary key. 
     * 
     * @return the id of the entity
     */
    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    /**
     * Returns the entities text field
     * 
     * @return the text field. 
     */
    @Column(name="info")
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the entity's id. 
     * 
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Set's the entity's text field. 
     * 
     * @param text
     *            the text to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
