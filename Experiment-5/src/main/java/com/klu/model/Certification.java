package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int certId;
    private String certName;
    private String dateOfCompletion;

    public Certification() {
        this.certId = 501;
        this.certName = "Spring Framework Certification";
        this.dateOfCompletion = "15-01-2026";
    }

    public int getCertId() {
        return certId;
    }

    public String getCertName() {
        return certName;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }
}
