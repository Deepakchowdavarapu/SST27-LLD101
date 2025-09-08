package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(email, "email");
        if (email.length() > 100) {
            throw new IllegalArgumentException("email too long");
        }
        UserProfile p = new UserProfile.Builder()
                .id(id)
                .email(email)
                .build();
        // later, we decide to set a default display name
        p.setDisplayName(id); // mutability leak
        return p;
    }

    public void updateDisplayName(UserProfile p, String displayName) {
        return new UserProfile.Builder()
                .id(p.getId())
                .email(p.getEmail())
                .phone(p.getPhone())
                .displayName(displayName)
                .address(p.getAddress())
                .marketingOptIn(p.isMarketingOptIn())
                .twitter(p.getTwitter())
                .github(p.getGithub())
                .build();
    }
}
