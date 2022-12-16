package com.levina.tests;


import com.github.javafaker.Faker;
import com.levina.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.levina.tests.TestData.*;

public class StudentRegistrationFormFakerTests extends TestBase{

        RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
           currentAddress = faker.address().streetAddress(),
            phone = faker.phoneNumber().subscriberNumber(10);



    @Test
    void fillFormTest() {
        registrationPage.openPage();

     registrationPage.typeFirstName(firstName);
     registrationPage.typeLastName(lastName);
     registrationPage.typeUserEmail(userEmail);
     registrationPage.typeUserGender(UserGender);
     registrationPage.typeUserNumber(phone);
     registrationPage.dateOfBirthInput();
     registrationPage.calendar.setDate("08","November", "2022");
      registrationPage.subjectsInput(subjects);
      registrationPage.hobbiesWrapper(hobbies);
      registrationPage.uploadPicture(Picture);
      registrationPage.currentAddress(currentAddress);
      registrationPage.state();
      registrationPage.stateCityWrapper1(stateCity1);
      registrationPage.city();
      registrationPage.stateCityWrapper2(stateCity2);
      registrationPage.submit();

        registrationPage.modalTitle(modalTitle);
        registrationPage.checkResultsValue(firstName + " " + lastName, userEmail,
                "Female", phone, "08 November,2022", "Chemistry", "Sports",
                "123.png", currentAddress, "NCR Delhi");
    }
}
