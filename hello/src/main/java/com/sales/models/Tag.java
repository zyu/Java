package com.sales.models;

import com.sales.models.BaseModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Raysmond<i@raysmond.com>.
 */
@Entity
@Table(name = "tags")
@Getter @Setter
public class Tag extends BaseModel {

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
    private List<Post> posts = new ArrayList<>();

    public Tag(){

    }

    public Tag(String name){
        this.setName(name);
    }
}
