package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru"));
    submitContactForm();
    gotoHomePage();
    Logout();
  }
}
