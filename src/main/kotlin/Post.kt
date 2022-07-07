package ru.netology

data class Post(
    val id: Int,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Long,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Boolean ,
    val comments: Int,
    val likes: Int,
    val reposts: Int?,
    val views: Int?,
    val postType: String,
    val signerId: Boolean, //тип записи
    val canPin: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: String?,
    val postponedId: Int
)

open class Likes (
    val count: Int?,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,
    val postId: Int?

        )
 class AttachmentLikes(
     count: Int?,
     userLikes: Boolean,
     canLike: Boolean,
     canPublish: Boolean,
     postId: Int?,
     val original: Likes
 ): Likes(count, userLikes, canLike, canPublish, postId)

sealed class Attachments(val type: String)

data class ArrayAttachments(
    val type: String
){
    data class Video(val video: Video) : Attachments("video")
    data class Audio(val audio: Audio) : Attachments("audio")
    data class Photo(val photo: Photo) : Attachments("photo")
    data class Document(val document: Document) : Attachments("document")
}
fun fooAttachments(att: Attachments): String = when (att) {
    is ArrayAttachments.Audio -> "audio \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
    is ArrayAttachments.Document -> "document \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
    is ArrayAttachments.Photo -> "photo \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
    is ArrayAttachments.Video -> "video \nid: 1, \nalbumId: 1, \nownerId: 1, \nuserId: 1"
}