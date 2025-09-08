package com.example.imports;

import java.util.*;
import java.util.regex.Pattern;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader csvReader;
    private final ProfileService profileService;
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
        this.csvReader = Objects.requireNonNull(csvReader);
        this.profileService = Objects.requireNonNull(profileService);
    }

    @Override
    public int importFrom(java.nio.file.Path csvFile) {
        List<String[]> rows = csvReader.read(csvFile.toString());
        int count = 0;
        for (int i = 1; i < rows.size(); i++) { // skip header
            String[] row = rows.get(i);
            if (row.length < 3) {
                System.out.println("Row " + (i+1) + " skipped: missing columns");
                continue;
            }
            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row[2].trim();
            if (id.isEmpty() || email.isEmpty()) {
                System.out.println("Row " + (i+1) + " skipped: missing id or email");
                continue;
            }
            if (!EMAIL_PATTERN.matcher(email).matches()) {
                System.out.println("Row " + (i+1) + " skipped: invalid email");
                continue;
            }
            profileService.createProfile(id, email, displayName);
            count++;
        }
        return count;
    }
}
