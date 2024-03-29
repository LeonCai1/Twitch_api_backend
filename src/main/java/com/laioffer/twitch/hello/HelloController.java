package com.laioffer.twitch.hello;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leon Cai
 * @project twitch
 * @date 1/10/23
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayhello(){
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();
        String template = "This is %s\n" +
                "I work at %s\n" +
                "I live at %s in %s %s\n" +
                "My favorite book is %s by %s\n";
        return template.formatted(
                name,
                company,
                street,
                city,
                state,
                bookTitle,
                bookAuthor
        );
    }


}
