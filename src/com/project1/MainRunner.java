package com.project1;

public class MainRunner {
    public static void main(String[] args) {

        // Create "main" folder if not present in current folder structure
        FileOperations.createMainFolderIfNotPresent("main");
        MenuOptions.welcomeScreen("Lockers Pvt. Ltd", "Jhansi Sarangi");
        HandleOptions.handleWelcomeScreenInput();
    }
}