package com.dprabath.restmongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by PRAJAMA on 7/11/2017.
 */
@Data
@Document
public class Contact {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String twitterHandle;
    private String facebookProfile;
    private String linkedInProfile;
    private String googlePlusProfile;
}
