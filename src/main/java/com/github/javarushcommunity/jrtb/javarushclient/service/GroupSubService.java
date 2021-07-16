package com.github.javarushcommunity.jrtb.javarushclient.service;

import com.github.javarushcommunity.jrtb.domain.GroupSub;
import com.github.javarushcommunity.jrtb.javarushclient.dto.GroupDiscussionInfo;

/**
* Service for manipulating with {@link GroupSub}.
*/
public interface GroupSubService {

   GroupSub save(String chatId, GroupDiscussionInfo groupDiscussionInfo);
}