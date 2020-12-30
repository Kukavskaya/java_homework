package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification () {
    app.getNavigationHelper().openHomePage();
    app.getContactHelper().selectContacts();
    app.getContactHelper().initContactModification();
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().openHomePage();
  }
}
