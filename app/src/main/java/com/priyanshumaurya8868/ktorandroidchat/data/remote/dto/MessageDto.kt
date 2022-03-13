package com.priyanshumaurya8868.ktorandroidchat.data.remote.dto

import com.priyanshumaurya8868.ktorandroidchat.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.*

@Serializable
data class MessageDto(
    val text: String,
    val timeStamp: Long,
    val username: String,
    val id: String
) {
    fun toMessage(): Message {
        val date = Date(timeStamp)
        val formattedDate = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(date)
        return Message(
            text = text,
            formattedTime = formattedDate,
            username = username
        )
    }
}
