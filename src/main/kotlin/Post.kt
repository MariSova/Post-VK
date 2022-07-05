package ru.netology

data class Post(
    val id: Int = 1,
    val ownerId: Long = 0,
    val fromId: Long = 0,
    val createdBy: Long = 0,
    val date: Long = 0,
    val text: String = "Hi",
    val replyOwnerId: Long = 0,
    val replyPostId: Long = 0,
    val friendsOnly: Boolean = false,
    val comments: Int = 0,
    val likes: Int = 0,
    val reposts: Int = 0,
    val views: Int = 0,
    val postType: String = "",
    val signerId: Boolean = true, //тип записи
    val canPin: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: String = "",
    val postponedId: Int = 0,
)
