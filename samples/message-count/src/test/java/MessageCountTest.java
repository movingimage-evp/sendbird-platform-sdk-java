import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.client.model.GcListChannelsResponse;
import org.openapitools.client.model.ListUsersResponse;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageCountTest {
    @Test
    @DisplayName("count unread messages")
    void testCountUnreadMessages() {
        MessageCount messageCount = new MessageCount();
        BigDecimal unreadCount = messageCount.countUnreadMessages();
        System.out.println(unreadCount);
        assertEquals(unreadCount, BigDecimal.ONE);

    }

    @AfterAll
    public static void tearDown() {
        System.out.println("AbstractBaseTest.tearDown");
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);

        ListUsersResponse users = user.listUsers("SB::test-user::Java::e2e::");

        for (int i = 0; i < users.getUsers().size(); i++) {
            String userIdToDelete = users.getUsers().get(i).getUserId();
            System.out.println(userIdToDelete);

            user.deleteUserById(userIdToDelete);
        }

        GcListChannelsResponse groupChannelResponse = groupChannel.listChannels("SB::test-gc::Java::e2e::");

        for (int i = 0; i < groupChannelResponse.getChannels().size(); i++) {
            String channelUrlToDelete = groupChannelResponse.getChannels().get(i).getChannelUrl();
            groupChannel.deleteChannelByUrl(channelUrlToDelete);
        }

    }

}