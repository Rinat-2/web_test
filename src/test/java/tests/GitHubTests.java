package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GitHubTests extends TestBase{

    @Test
    void loginWithVerifiedEmailTest(){
        open("/login");

        $("#login_field").setValue(config.verifiedUserName());
        $("#password").setValue(config.verifiedUserPassword()).pressEnter();

        $("#repos-container").shouldHave(Condition.text("Repositories"));
    }
}
