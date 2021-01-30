package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    int index = before.size() + 1;
    File photo = new File("src/test/resources/image.png");
    ContactData contact = new ContactData().withFirstname("user1").withLastname("user2").withAddress("address1")
            .withTelephone("+79999999999").withEmail("testuser@mail.ru").withPhoto(photo);
    app.contact().create(contact, true);
    Contacts after = app.contact().all();
    assertThat(after.size(), equalTo(index));
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));

    app.Logout();
  }

  @Test (enabled = false)
  public void testBadContactCreation() {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    ContactData contact = new ContactData().withFirstname("user1'").withLastname("user2").withAddress("address1").withTelephone("+79999999999").withEmail("testuser@mail.ru").withGroup("test1");
    app.contact().create(contact, true);
    assertThat(app.contact().count(), equalTo(before.size()));
    Contacts after = app.contact().all();
//    Assert.assertEquals(after.size(), before.size());
    assertThat(after, equalTo(before));

    app.Logout();
  }

  @Test (enabled = false)
  public void testCurrentDir () {
    File currentDir = new File(".");
    System.out.println(currentDir.getAbsolutePath());
    File photo = new File("src/test/resources/image.png");
    System.out.println(photo.getAbsolutePath());
    System.out.println(photo.exists());
  }
}
