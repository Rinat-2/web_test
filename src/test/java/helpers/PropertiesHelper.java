package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:local.properties" , "classpath:remote.properties"})
public interface PropertiesHelper extends Config {

    @Key("web.url")
    String webUrl();

    @Key("account.verified.username")
    String verifiedUserName();

    @Key("account.verified.password")
    String verifiedUserPassword();

}