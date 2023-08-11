package com.ahmetsenocak.mvc;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 cars/digits")
    private String postalCode;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than 0 or equal to 0")
    @Max(value = 10, message = "must be less than 0 or equal to 10")
    private Integer freePasses;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
