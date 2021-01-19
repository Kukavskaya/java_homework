package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTest extends TestBase {

  @Test (enabled = false)
  public void testContactDeletion() throws Exception {
    app.goTo().gotoHomePage();
    if(! app.getContactHelper().IsThereAContact()) {
      app.getContactHelper().createContact(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru", "test1"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContacts(before.size() - 1);
    app.getContactHelper().deleteSelectedContacts();
    app.acceptNextAlert = true;
    assertTrue(app.closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    app.goTo().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);

    app.Logout();
  }

}
