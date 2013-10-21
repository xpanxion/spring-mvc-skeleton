package com.xpanxion.reviewman.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@NamedQuery(name = "test.getAll", query = "from TestEntity")
public class TestEntity {

    private long id;
    private String value;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    /**
     * @return the text
     */
    @Column
    public String getValue() {
        return this.value;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param text
     *            the text to set
     */
    public void setValue(String value) {
        this.value = value;
    }
}
