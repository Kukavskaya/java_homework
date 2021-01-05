package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru", "test1"), true);
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().gotoHomePage();
    app.Logout();
  }
}
