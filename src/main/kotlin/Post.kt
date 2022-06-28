package ru.netology

import java.util.*

data class Post(
    val id: Int,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Long,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val comments: Int = 0,
    val copyright: Boolean,
    val likes: Int = 0,
    val reposts: Int = 0,
    val views: Int = 0,
    val postType: String, //тип записи
    val signerId: Boolean,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: String,
    val postponedId: Objects
)
