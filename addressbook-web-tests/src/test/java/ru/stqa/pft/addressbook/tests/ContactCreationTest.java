package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().createContact(new ContactData("user1", "user2", "address1", "+79999999999", "testuser@mail.ru", "test1"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(before, before + 1);
    app.Logout();
  }
}
