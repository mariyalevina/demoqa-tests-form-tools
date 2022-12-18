package com.levina.tests;


import com.levina.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.levina.tests.TestData.*;

public class StudentRegistrationFormPageTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeUserEmail(Email);
        registrationPage.typeUserGender(UserGender);
        registrationPage.typeUserNumber(userNumber);
        registrationPage.dateOfBirthInput();
        registrationPage.calendar.setDate("08", "November", "2022");

        registrationPage.subjectsInput(subjects);
        registrationPage.hobbiesWrapper(hobbies);
        registrationPage.uploadPicture(Picture);
        registrationPage.currentAddress(Address);
        registrationPage.state();
        registrationPage.stateCityWrapper1(stateCity1);
        registrationPage.city();
        registrationPage.stateCityWrapper2(stateCity2);
        registrationPage.submit();

        registrationPage.modalTitle(modalTitle);
        registrationPage.checkResultsValue(firstName + " " + lastName, "mariya.levina@simbirsoft.com",
                "Female", "1234567890", "08 November,2022", "Chemistry", "Sports",
                "123.png", "Ulyanovsk, st. Kamyshinskaya 105", "NCR Delhi");
    }
}
