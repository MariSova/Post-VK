package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var lastIndex = 0
    private var comments = emptyArray<Post.Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastIndex)

        return posts.last()
    }

    fun createComment(post: Post): Int? {
        val postId = post.id
        val postComment = post.comments
        for (post in posts) {
            if (post.id == postId) {
                return postComment
            } else throw PostNotFoundException("Error")
        }
        return null
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