package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class RegisterDTO extends LoginDTO {

    private String verifyPassword;

    public RegisterDTO () {}

    public String getVerifyPassword () {

        return this.verifyPassword;

    }

    public void setVerifyPassword (String verifyPassword) {

        this.verifyPassword = verifyPassword;

    }

}
