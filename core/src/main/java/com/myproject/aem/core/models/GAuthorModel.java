package com.myproject.aem.core.models;

import org.apache.sling.models.annotations.Model;

import javax.annotation.Resource;
import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class GAuthorModel {

    @Inject
    private String title;

    @Inject
    private String description;

    @Inject
    private String image;

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }


    public String getImage() {

        return image;
    }
}
