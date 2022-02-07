

# SendBirdChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverUrl** | **String** |  |  [optional]
**createdAt** | **BigDecimal** |  |  [optional]
**creator** | [**SendBirdUser**](SendBirdUser.md) |  |  [optional]
**customType** | **String** |  |  [optional]
**data** | **String** |  |  [optional]
**hiddenState** | [**HiddenStateEnum**](#HiddenStateEnum) |  |  [optional]
**invitedAt** | **BigDecimal** |  |  [optional]
**inviter** | [**SendBirdUser**](SendBirdUser.md) |  |  [optional]
**isAccessCodeRequired** | **Boolean** |  |  [optional]
**isBroadcast** | **Boolean** |  |  [optional]
**isDiscoverable** | **Boolean** |  |  [optional]
**isDistinct** | **Boolean** |  |  [optional]
**isEphemeral** | **Boolean** |  |  [optional]
**isFrozen** | **Boolean** |  |  [optional]
**isHidden** | **Boolean** |  |  [optional]
**isPublic** | **Boolean** |  |  [optional]
**isPushEnabled** | **Boolean** |  |  [optional]
**isSuper** | **Boolean** |  |  [optional]
**joinedAt** | **BigDecimal** |  |  [optional]
**joinedMemberCount** | **BigDecimal** |  |  [optional]
**lastMessage** | [**SendBirdMessageResponse**](SendBirdMessageResponse.md) |  |  [optional]
**memberCount** | **BigDecimal** |  |  [optional]
**members** | [**List&lt;SendBirdMember&gt;**](SendBirdMember.md) |  |  [optional]
**messageOffsetTimestamp** | **BigDecimal** |  |  [optional]
**messageSurvivalSeconds** | **BigDecimal** |  |  [optional]
**myCountPreference** | **String** |  |  [optional]
**myLastRead** | **BigDecimal** |  |  [optional]
**myMemberState** | [**MyMemberStateEnum**](#MyMemberStateEnum) |  |  [optional]
**myMutedState** | [**MyMutedStateEnum**](#MyMutedStateEnum) |  |  [optional]
**myPushTriggerOption** | [**MyPushTriggerOptionEnum**](#MyPushTriggerOptionEnum) |  |  [optional]
**myRole** | [**MyRoleEnum**](#MyRoleEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**unreadMentionCount** | **BigDecimal** |  |  [optional]
**unreadMessageCount** | **BigDecimal** |  |  [optional]
**channelUrl** | **String** |  |  [optional]
**operators** | [**List&lt;SendBirdUser&gt;**](SendBirdUser.md) |  |  [optional]
**participantCount** | **BigDecimal** |  |  [optional]



## Enum: HiddenStateEnum

Name | Value
---- | -----
HIDDEN_ALLOW_AUTO_UNHIDE | &quot;hidden_allow_auto_unhide&quot;
HIDDEN_PREVENT_AUTO_UNHIDE | &quot;hidden_prevent_auto_unhide&quot;
UNHIDDEN | &quot;unhidden&quot;



## Enum: MyMemberStateEnum

Name | Value
---- | -----
INVITED | &quot;invited&quot;
JOINED | &quot;joined&quot;
NONE | &quot;none&quot;



## Enum: MyMutedStateEnum

Name | Value
---- | -----
MUTED | &quot;muted&quot;
UNMUTED | &quot;unmuted&quot;



## Enum: MyPushTriggerOptionEnum

Name | Value
---- | -----
ALL | &quot;all&quot;
DEFAULT | &quot;default&quot;
MENTION_ONLY | &quot;mention_only&quot;
FALSE | &quot;false&quot;



## Enum: MyRoleEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
OPERATOR | &quot;operator&quot;



