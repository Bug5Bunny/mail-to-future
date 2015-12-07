package org.mailtofuture.entity;

public class User {
    
    private String uuid;
    private String email;
    private String role;
    private String session;
    
    public User() {
        super();
    }
    
    public User(String uuid, String email, String role, String session) {
        super();
        this.uuid = uuid;
        this.email = email;
        this.role = role;
        this.session = session;
    }
    
    public String getUuid() {
        return uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getSession() {
        return session;
    }
    
    public void setSession(String session) {
        this.session = session;
    }
    
    @Override
    public String toString() {
        return "User [uuid=" + uuid + ", email=" + email + ", role=" + role
                + ", session=" + session + "]";
    }
}
