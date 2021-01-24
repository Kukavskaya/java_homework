package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    int index = before.size() + 1;
    ContactData contact = new ContactData().withFirstname("user1").withLastname("user2").withAddress("address1").withTelephone("+79999999999").withEmail("testuser@mail.ru").withGroup("test1");
    app.contact().create(contact, true);
    Contacts after = app.contact().all();
    Assert.assertEquals(after.size(), index);
    assertThat(after.size(), equalTo(index));

    //contact.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));

    app.Logout();
  }
}
