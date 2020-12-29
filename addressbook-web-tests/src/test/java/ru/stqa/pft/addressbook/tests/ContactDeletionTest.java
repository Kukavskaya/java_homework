package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.openHomePage();
    app.selectContacts();
    app.deleteSelectedContacts();
    app.acceptNextAlert = true;
    assertTrue(app.closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    app.openHomePage();
    app.Logout();
  }

}
