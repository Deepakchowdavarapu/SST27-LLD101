package com.example.imports;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) throw new IllegalArgumentException("path required");
    Path csvPath = Path.of(args[0]);
    ProfileImporter importer = new CsvProfileImporter(new NaiveCsvReader(), new ProfileService());
    int n = importer.importFrom(csvPath);
    System.out.println("Imported " + n + " profiles");
    }
}
