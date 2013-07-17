package org.openmrs.module.muzimaforms;

import org.openmrs.module.webservices.rest.web.RestConstants;

public class MuzimaConstants {
    public static final String MODULE_ID = "muzimaforms";
    public static final String MUZIMA_NAMESPACE = RestConstants.VERSION_1 + "/" + MuzimaConstants.MODULE_ID;
    public static final String BASE_REQUEST_MAPPING = "/rest/" + MUZIMA_NAMESPACE;
}
