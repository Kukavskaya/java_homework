package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    openHomePage();
    selectContacts();
    deleteSelectedContacts();
    acceptNextAlert = true;
    assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
    openHomePage();
    Logout();
  }

}
