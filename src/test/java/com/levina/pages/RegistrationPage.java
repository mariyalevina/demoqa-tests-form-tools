package com.levina.pages;


import com.codeborne.selenide.SelenideElement;
import com.levina.pages.components.CalendarComponent;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            UserEmail = $("#userEmail"),
            NumberElement = $("#userNumber"),
            UserGender = $("#genterWrapper"),
            UserDateOfBirth = $("#dateOfBirthInput"),
            tableResult = $(".table-responsive"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            subjectsInput =  $("#subjectsInput"),
            Address =$("#currentAddress"),
            state = $("#state"),
            stateCity = $("#stateCity-wrapper"),
            city = $("#city"),
            submit = $("#submit"),
            title = $(".modal-title"),
            Picture = $("#uploadPicture");


    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public void typeLastName(String value)
    {
        lastNameInput.setValue(value);
    }

    public void typeUserEmail(String value)
    {
        UserEmail.setValue(value);
    }

    public void typeUserNumber(String value)
    {
        NumberElement.setValue(value);
    }

    public void typeUserGender(String value)
    {
        UserGender.$(byText(value)).click();
    }

    public void dateOfBirthInput()
    {
        UserDateOfBirth.click();
    }

    public void subjectsInput(String value)
    {
        subjectsInput.setValue(value).pressEnter();
    }

    public void hobbiesWrapper(String value)
    {
        hobbiesWrapper.$(byText(value)).click();
    }

    public void uploadPicture(String value)
    {
        Picture.uploadFromClasspath(value);
    }

    public void currentAddress(String value)
    {
        Address.setValue(value);
    }

    public void state()
    {
        state.click();
    }

    public void stateCityWrapper1(String value)
    {
        stateCity.$(byText(value)).click();
    }

    public void city()
    {
       city.click();
    }

    public void stateCityWrapper2(String value)
    {
        stateCity.$(byText(value)).click();
    }

    public void submit()
    {
        submit.click();
    }

    public CalendarComponent calendar = new CalendarComponent();

    public void modalTitle(String value)
    {
        title.shouldHave(text(value));
    }

    public void checkResultsValue(String value1, String value2,  String value3,  String value4, String value5,
                                  String value6,  String value7,  String value8,  String value9,  String value10)
    {
        tableResult.shouldHave(text(value1), text(value2),  text(value3),  text(value4), text(value5), text(value6),
                               text(value7),  text(value8), text(value9),  text(value10));
    }
}

