package com.sales.forms;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author Raysmond<i@raysmond.com>
 */
@Data
public class SettingsForm {
    @NotEmpty
    @NotNull
    private String siteName;

    @NotNull
    private String siteSlogan;

    @NotNull
    private Integer pageSize;

}
