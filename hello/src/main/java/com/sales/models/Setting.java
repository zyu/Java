package com.sales.models;

import com.sales.models.BaseModel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * A generic setting model
 *
 * @author Raysmond<i@raysmond.com>
 */
@Entity
@Table(name = "settings")
@Getter @Setter
public class Setting extends BaseModel {
    @Column(name = "_key", unique = true, nullable = false)
    private String key;

    @Lob
    @Column(name = "_value")
    private Serializable value;

}
