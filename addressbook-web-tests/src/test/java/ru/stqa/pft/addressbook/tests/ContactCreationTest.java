package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru"));
    app.submitContactForm();
    app.gotoHomePage();
    app.Logout();
  }
}
