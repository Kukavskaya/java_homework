package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification () {
    app.getNavigationHelper().gotoHomePage();
    if(! app.getContactHelper().IsThereAContact()) {
      app.getContactHelper().createContact(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru", "test1"), true);
    }
    app.getContactHelper().selectContacts();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoGroupPage();
  }
}