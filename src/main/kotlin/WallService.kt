package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var lastIndex = 0

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastIndex)

        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.id
        val oldPost = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    ownerId = oldPost.ownerId,
                    date = oldPost.date,
                )
                return true
            }
        }
        return false
    }

}