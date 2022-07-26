package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var lastIndex = 0
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++lastIndex)

        return posts.last()
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
            }
        }
        return if (comments.contains(comment)) comment else throw PostNotFoundException()
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