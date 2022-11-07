/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.sendbird.client.api;

import org.sendbird.client.*;
import org.sendbird.client.auth.*;
import org.openapitools.client.model.AddRegistrationOrDeviceTokenData;
import org.openapitools.client.model.AddRegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.ChoosePushNotificationContentTemplateResponse;
import org.openapitools.client.model.CreateUserData;
import org.openapitools.client.model.CreateUserTokenData;
import org.openapitools.client.model.CreateUserTokenResponse;
import org.openapitools.client.model.LeaveMyGroupChannelsData;
import org.openapitools.client.model.ListMyGroupChannelsResponse;
import org.openapitools.client.model.ListRegistrationOrDeviceTokensResponse;
import org.openapitools.client.model.ListUsersResponse;
import org.openapitools.client.model.MarkAllMessagesAsReadData;
import org.openapitools.client.model.RegisterAsOperatorToChannelsWithCustomChannelTypesData;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenByTokenResponse;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse;
import org.openapitools.client.model.RemoveRegistrationOrDeviceTokenResponse;
import org.openapitools.client.model.ResetPushPreferencesResponse;
import org.openapitools.client.model.SendBirdUser;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceData;
import org.openapitools.client.model.UpdateChannelInvitationPreferenceResponse;
import org.openapitools.client.model.UpdateCountPreferenceOfChannelByUrlData;
import org.openapitools.client.model.UpdateCountPreferenceOfChannelByUrlResponse;
import org.openapitools.client.model.UpdatePushPreferencesData;
import org.openapitools.client.model.UpdatePushPreferencesForChannelByUrlData;
import org.openapitools.client.model.UpdatePushPreferencesForChannelByUrlResponse;
import org.openapitools.client.model.UpdatePushPreferencesResponse;
import org.openapitools.client.model.UpdateUserByIdData;
import org.openapitools.client.model.ViewChannelInvitationPreferenceResponse;
import org.openapitools.client.model.ViewCountPreferenceOfChannelByUrlResponse;
import org.openapitools.client.model.ViewNumberOfChannelsByJoinStatusResponse;
import org.openapitools.client.model.ViewNumberOfChannelsWithUnreadMessagesResponse;
import org.openapitools.client.model.ViewNumberOfUnreadItemsResponse;
import org.openapitools.client.model.ViewNumberOfUnreadMessagesResponse;
import org.openapitools.client.model.ViewPushPreferencesForChannelByUrlResponse;
import org.openapitools.client.model.ViewPushPreferencesResponse;
import org.openapitools.client.model.ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Add a registration or device token
     *
     * ## Add a registration or device token  &gt; __Note__: A user can have up to 20 FCM registration tokens, 20 HMS device tokens, and 20 APNs device tokens each. The oldest token will be deleted before a new token is added for a user who already has 20 registration or device tokens. Only the 20 newest tokens will be maintained for users who already have more than 20 of each token type.  To send notification requests to push notification services on behalf of your server, adds a specific user&#39;s FCM registration token, HMS device token, or APNs device token to Sendbird server. Depending on which push service you are using, you can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;.  A FCM registration token and an APNs device token allow identification of each client app instance on each device, and are generated and registered by Android and iOS apps through the corresponding SDKs. Use this method if you need to register a token via your own server.  &gt; __Note__: For more information on the registration token and device token, visit the Google&#39;s [FCM](https://firebase.google.com/docs/auth/admin/verify-id-tokens) page, Huawei&#39;s [Push kit](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/service-introduction-0000001050040060) and Apple&#39;s [APNs](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/APNSOverview.html) page.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-add-a-registration-or-device-token ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRegistrationOrDeviceTokenTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String tokenType = null;
        //AddRegistrationOrDeviceTokenData addRegistrationOrDeviceTokenData = null;
        //AddRegistrationOrDeviceTokenResponse response = api.addRegistrationOrDeviceToken(userId, tokenType)
        //        .apiToken(apiToken)
        //        .addRegistrationOrDeviceTokenData(addRegistrationOrDeviceTokenData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Choose a push notification content template
     *
     * ## Choose a push notification content template  Chooses a push notification content template of a user&#39;s own. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-choose-a-push-notification-content-template ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void choosePushNotificationContentTemplateTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //Object body = null;
        //ChoosePushNotificationContentTemplateResponse response = api.choosePushNotificationContentTemplate(userId)
        //        .apiToken(apiToken)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Create a user
     *
     * ## Create a user  Creates a new user in the application. A user is identified by its unique user ID, and additionally have a changeable nickname, profile image, and so on.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        //String apiToken = null;
        //CreateUserData createUserData = null;
        //SendBirdUser response = api.createUser()
        //        .apiToken(apiToken)
        //        .createUserData(createUserData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Create user token
     *
     * ## Create user token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTokenTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //CreateUserTokenData createUserTokenData = null;
        //CreateUserTokenResponse response = api.createUserToken(userId)
        //        .apiToken(apiToken)
        //        .createUserTokenData(createUserTokenData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete a user
     *
     * ## Delete a user  Deletes a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-delete-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //Object response = api.deleteUserById(userId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Leave my group channels
     *
     * ## Leave my group channels  Makes a user leave all joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-leave-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to leave all joined group channels.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void leaveMyGroupChannelsTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //LeaveMyGroupChannelsData leaveMyGroupChannelsData = null;
        //Object response = api.leaveMyGroupChannels(userId)
        //        .apiToken(apiToken)
        //        .leaveMyGroupChannelsData(leaveMyGroupChannelsData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List my group channels
     *
     * ## List my group channels  Retrieves all group channels that the user has joined. You can create a request based on various query parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-my-group-channels ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the target user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMyGroupChannelsTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String token = null;
        //Integer limit = null;
        //String distinctMode = null;
        //String publicMode = null;
        //String superMode = null;
        //String hiddenMode = null;
        //String memberStateFilter = null;
        //String unreadFilter = null;
        //Integer createdAfter = null;
        //Integer createdBefore = null;
        //Boolean showEmpty = null;
        //Boolean showFrozen = null;
        //Boolean showMember = null;
        //Boolean showDeliveryReceipt = null;
        //Boolean showReadReceipt = null;
        //String order = null;
        //String metadataOrderKey = null;
        //String customTypes = null;
        //String customTypeStartswith = null;
        //String channelUrls = null;
        //String name = null;
        //String nameContains = null;
        //String nameStartswith = null;
        //String membersExactlyIn = null;
        //String membersIncludeIn = null;
        //String queryType = null;
        //String membersNickname = null;
        //String membersNicknameContains = null;
        //String searchQuery = null;
        //String searchFields = null;
        //String metadataKey = null;
        //String metadataValues = null;
        //String metadataValueStartswith = null;
        //String metacounterKey = null;
        //String metacounterValues = null;
        //String metacounterValueGt = null;
        //String metacounterValueGte = null;
        //String metacounterValueLt = null;
        //String metacounterValueLte = null;
        //String customType = null;
        //ListMyGroupChannelsResponse response = api.listMyGroupChannels(userId)
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .distinctMode(distinctMode)
        //        .publicMode(publicMode)
        //        .superMode(superMode)
        //        .hiddenMode(hiddenMode)
        //        .memberStateFilter(memberStateFilter)
        //        .unreadFilter(unreadFilter)
        //        .createdAfter(createdAfter)
        //        .createdBefore(createdBefore)
        //        .showEmpty(showEmpty)
        //        .showFrozen(showFrozen)
        //        .showMember(showMember)
        //        .showDeliveryReceipt(showDeliveryReceipt)
        //        .showReadReceipt(showReadReceipt)
        //        .order(order)
        //        .metadataOrderKey(metadataOrderKey)
        //        .customTypes(customTypes)
        //        .customTypeStartswith(customTypeStartswith)
        //        .channelUrls(channelUrls)
        //        .name(name)
        //        .nameContains(nameContains)
        //        .nameStartswith(nameStartswith)
        //        .membersExactlyIn(membersExactlyIn)
        //        .membersIncludeIn(membersIncludeIn)
        //        .queryType(queryType)
        //        .membersNickname(membersNickname)
        //        .membersNicknameContains(membersNicknameContains)
        //        .searchQuery(searchQuery)
        //        .searchFields(searchFields)
        //        .metadataKey(metadataKey)
        //        .metadataValues(metadataValues)
        //        .metadataValueStartswith(metadataValueStartswith)
        //        .metacounterKey(metacounterKey)
        //        .metacounterValues(metacounterValues)
        //        .metacounterValueGt(metacounterValueGt)
        //        .metacounterValueGte(metacounterValueGte)
        //        .metacounterValueLt(metacounterValueLt)
        //        .metacounterValueLte(metacounterValueLte)
        //        .customType(customType)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List registration or device tokens
     *
     * ## List registration or device tokens  Retrieves a list of a specific user&#39;s FCM registration tokens, HMS device tokens, or APNs device tokens. You can specify either &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60; in the &#x60;token_type&#x60; parameter, depending on which push notification service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-registration-or-device-tokens ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRegistrationOrDeviceTokensTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String tokenType = null;
        //ListRegistrationOrDeviceTokensResponse response = api.listRegistrationOrDeviceTokens(userId, tokenType)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List users
     *
     * ## List users  Retrieves a list of users in your application. You can query the list using various parameters.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-list-users ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUsersTest() throws ApiException {
        //String apiToken = null;
        //String token = null;
        //Integer limit = null;
        //String activeMode = null;
        //Boolean showBot = null;
        //String userIds = null;
        //String nickname = null;
        //String nicknameStartswith = null;
        //String metadatakey = null;
        //String metadatavaluesIn = null;
        //ListUsersResponse response = api.listUsers()
        //        .apiToken(apiToken)
        //        .token(token)
        //        .limit(limit)
        //        .activeMode(activeMode)
        //        .showBot(showBot)
        //        .userIds(userIds)
        //        .nickname(nickname)
        //        .nicknameStartswith(nicknameStartswith)
        //        .metadatakey(metadatakey)
        //        .metadatavaluesIn(metadatavaluesIn)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Mark all messages as read
     *
     * ## Mark all messages as read  Marks all of a user&#39;s unread messages as read in the joined group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-mark-all-messages-as-read ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markAllMessagesAsReadTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //MarkAllMessagesAsReadData markAllMessagesAsReadData = null;
        //Object response = api.markAllMessagesAsRead(userId)
        //        .apiToken(apiToken)
        //        .markAllMessagesAsReadData(markAllMessagesAsReadData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Register as an operator to channels with custom channel types
     *
     * ## Register as an operator to channels with custom channel types  Registers a user as an operator to channels with particular custom channel types.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-register-as-an-operator-to-channels-with-custom-channel-types ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerAsOperatorToChannelsWithCustomChannelTypesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //RegisterAsOperatorToChannelsWithCustomChannelTypesData registerAsOperatorToChannelsWithCustomChannelTypesData = null;
        //Object response = api.registerAsOperatorToChannelsWithCustomChannelTypes(userId)
        //        .apiToken(apiToken)
        //        .registerAsOperatorToChannelsWithCustomChannelTypesData(registerAsOperatorToChannelsWithCustomChannelTypesData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Remove a registration or device token - When unregistering all device tokens
     *
     * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRegistrationOrDeviceTokenTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //RemoveRegistrationOrDeviceTokenResponse response = api.removeRegistrationOrDeviceToken(userId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Remove a registration or device token - When unregistering a specific token
     *
     * ## Remove a registration or device token  Removes a specific user&#39;s one or more FCM registration tokens, HMS device tokens, or APNs device tokens.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRegistrationOrDeviceTokenByTokenTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String tokenType = null;
        //String token = null;
        //RemoveRegistrationOrDeviceTokenByTokenResponse response = api.removeRegistrationOrDeviceTokenByToken(userId, tokenType, token)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Remove a registration or device token from an owner
     *
     * ## Remove a registration or device token from an owner  Removes a registration or device token from a user who owns it. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-remove-a-registration-or-device-token-from-an-owner ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeRegistrationOrDeviceTokenFromOwnerByTokenTest() throws ApiException {
        //String apiToken = null;
        //String tokenType = null;
        //String token = null;
        //RemoveRegistrationOrDeviceTokenFromOwnerByTokenResponse response = api.removeRegistrationOrDeviceTokenFromOwnerByToken(tokenType, token)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Reset push preferences
     *
     * ## Reset push preferences  Resets a user&#39;s push preferences. After performing this action,   &#x60;do_not_disturb&#x60; and &#x60;snooze_enabled&#x60; are set to false.  The values of the parameters associated with the time frame are all set to 0.  &#x60;timezone&#x60; is reset to &#x60;UTC&#x60;.  &#x60;push_sound&#x60; is reset to &#x60;default&#x60;.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-reset-push-preferences ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetPushPreferencesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //ResetPushPreferencesResponse response = api.resetPushPreferences(userId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update channel invitation preference
     *
     * ## Update channel invitation preference  Updates the channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [update default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-update-default-channel-invitation-preference) action, you can update the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-channel-invitation-preference
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelInvitationPreferenceTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //UpdateChannelInvitationPreferenceData updateChannelInvitationPreferenceData = null;
        //UpdateChannelInvitationPreferenceResponse response = api.updateChannelInvitationPreference(userId)
        //        .apiToken(apiToken)
        //        .updateChannelInvitationPreferenceData(updateChannelInvitationPreferenceData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update count preference of a channel
     *
     * ## Update count preference of a channel  Updates count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-count-preference-of-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCountPreferenceOfChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String channelUrl = null;
        //UpdateCountPreferenceOfChannelByUrlData updateCountPreferenceOfChannelByUrlData = null;
        //UpdateCountPreferenceOfChannelByUrlResponse response = api.updateCountPreferenceOfChannelByUrl(userId, channelUrl)
        //        .apiToken(apiToken)
        //        .updateCountPreferenceOfChannelByUrlData(updateCountPreferenceOfChannelByUrlData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update push preferences
     *
     * ## Update push preferences  Updates a user&#39;s push preferences. Through this action, you can set &#x60;do_not_disturb&#x60; for a user, and update the time frame in which the setting applies.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePushPreferencesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //UpdatePushPreferencesData updatePushPreferencesData = null;
        //UpdatePushPreferencesResponse response = api.updatePushPreferences(userId)
        //        .apiToken(apiToken)
        //        .updatePushPreferencesData(updatePushPreferencesData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update push preferences for a channel
     *
     * ## Update push preferences for a channel  Updates push preferences for a user&#39;s specific group channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-push-preferences-for-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePushPreferencesForChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String channelUrl = null;
        //UpdatePushPreferencesForChannelByUrlData updatePushPreferencesForChannelByUrlData = null;
        //UpdatePushPreferencesForChannelByUrlResponse response = api.updatePushPreferencesForChannelByUrl(userId, channelUrl)
        //        .apiToken(apiToken)
        //        .updatePushPreferencesForChannelByUrlData(updatePushPreferencesForChannelByUrlData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a user
     *
     * ## Update a user  Updates information on a user. In addition to changing a user&#39;s nickname or profile image, you can issue a new access token for the user. The new access token replaces the previous one as the necessary token for authentication.  You can also deactivate or reactivate a user. If the &#x60;leave_all_when_deactivated&#x60; is true (which it is by default), a user leaves all joined group channels when deactivated.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-update-a-user ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //UpdateUserByIdData updateUserByIdData = null;
        //SendBirdUser response = api.updateUserById(userId)
        //        .apiToken(apiToken)
        //        .updateUserByIdData(updateUserByIdData)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View channel invitation preference
     *
     * ## View channel invitation preference  Retrieves channel invitation preference for a user&#39;s [private](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#-3-private-vs-public) group channels.  &gt; __Note__: Using the [view default channel invitation preference](https://sendbird.com/docs/chat/v3/platform-api/guides/application#2-view-default-channel-invitation-preference) action, you can retrieve the value of channel invitation preference which is globally applied to all users within the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-channel-invitation-preference
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewChannelInvitationPreferenceTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //ViewChannelInvitationPreferenceResponse response = api.viewChannelInvitationPreference(userId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View count preference of a channel
     *
     * ## View count preference of a channel  Retrieves count preference of a specific group channel of a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-count-preference-of-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewCountPreferenceOfChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String channelUrl = null;
        //ViewCountPreferenceOfChannelByUrlResponse response = api.viewCountPreferenceOfChannelByUrl(userId, channelUrl)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View number of channels by join status
     *
     * ## View number of channels by join status  Retrieves the number of a user&#39;s group channels by their join status.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-by-join-status ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewNumberOfChannelsByJoinStatusTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String state = null;
        //ViewNumberOfChannelsByJoinStatusResponse response = api.viewNumberOfChannelsByJoinStatus(userId)
        //        .apiToken(apiToken)
        //        .state(state)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View number of channels with unread messages
     *
     * ## View number of channels with unread messages  Retrieves the total number of a user&#39;s group channels with unread messages.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-channels-with-unread-messages ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewNumberOfChannelsWithUnreadMessagesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //List<String> customTypes = null;
        //String superMode = null;
        //ViewNumberOfChannelsWithUnreadMessagesResponse response = api.viewNumberOfChannelsWithUnreadMessages(userId)
        //        .apiToken(apiToken)
        //        .customTypes(customTypes)
        //        .superMode(superMode)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View number of unread items
     *
     * ## View number of unread items  Retrieves a set of total numbers of a user&#39;s unread messages, unread mentioned messages, or received invitations in either super or non-super group channels. This action is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-items ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewNumberOfUnreadItemsTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String customType = null;
        //String itemKeys = null;
        //ViewNumberOfUnreadItemsResponse response = api.viewNumberOfUnreadItems(userId)
        //        .apiToken(apiToken)
        //        .customType(customType)
        //        .itemKeys(itemKeys)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View number of unread messages
     *
     * ## View number of unread messages  Retrieves the total number of a user&#39;s currently unread messages in the group channels. The unread counts feature is only available for the group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-number-of-unread-messages ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve the number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewNumberOfUnreadMessagesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String customTypes = null;
        //String superMode = null;
        //ViewNumberOfUnreadMessagesResponse response = api.viewNumberOfUnreadMessages(userId)
        //        .apiToken(apiToken)
        //        .customTypes(customTypes)
        //        .superMode(superMode)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View push preferences
     *
     * ## View push preferences  Retrieves a user&#39;s push preferences about whether the user has set &#x60;do_not_disturb&#x60; to pause notifications for a certain period of time, and the time frame in which the user has applied the setting.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewPushPreferencesTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //ViewPushPreferencesResponse response = api.viewPushPreferences(userId)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View push preferences for a channel
     *
     * ## View push preferences for a channel  Retrieves whether a user has turned on notification messages for a specific channel. The push notifications feature is only available for group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-push-preferences-for-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewPushPreferencesForChannelByUrlTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String channelUrl = null;
        //ViewPushPreferencesForChannelByUrlResponse response = api.viewPushPreferencesForChannelByUrl(userId, channelUrl)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View a user
     *
     * ## View a user  Retrieves information on a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-a-user ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the unique ID of the user to retrieve.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewUserByIdTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //Boolean includeUnreadCount = null;
        //String customTypes = null;
        //String superMode = null;
        //SendBirdUser response = api.viewUserById(userId)
        //        .apiToken(apiToken)
        //        .includeUnreadCount(includeUnreadCount)
        //        .customTypes(customTypes)
        //        .superMode(superMode)
        //        .execute();
        // TODO: test validations
    }

    /**
     * View who owns a registration or device token
     *
     * ## View who owns a registration or device token  Retrieves a user who owns a FCM registration token, HMS device token, or APNs device token. You can pass one of two values in &#x60;token_type&#x60;: &#x60;gcm&#x60;, &#x60;huawei&#x60;, or &#x60;apns&#x60;, depending on which push service you are using.  https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-view-who-owns-a-registration-or-device-token ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewWhoOwnsRegistrationOrDeviceTokenByTokenTest() throws ApiException {
        //String apiToken = null;
        //String tokenType = null;
        //String token = null;
        //List<ViewWhoOwnsRegistrationOrDeviceTokenByTokenResponseInner> response = api.viewWhoOwnsRegistrationOrDeviceTokenByToken(tokenType, token)
        //        .apiToken(apiToken)
        //        .execute();
        // TODO: test validations
    }

}
