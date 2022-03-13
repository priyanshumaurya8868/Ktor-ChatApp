package com.priyanshumaurya8868.ktorandroidchat.presentation.chat

import com.priyanshumaurya8868.ktorandroidchat.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
